package com.att.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.att.orders.modal.Order;
import com.att.orders.service.OrderService;

@RestController
public class OrderApiController {

	@Autowired
	OrderService service;
    @RequestMapping(value = "/order/{orderId}",
            produces = { "application/json" }, 
            method = RequestMethod.GET)
    public ResponseEntity<Order> getOrderById( @PathVariable("orderId") Long orderId) throws OrderException {
    	if(orderId == null) {
    		throw new OrderException("Invalid Id", HttpStatus.BAD_REQUEST);
    	}
    	Order order = service.getOrder(orderId);
    	if(order == null) {
    		throw new OrderException("No Order found for the id", HttpStatus.NOT_FOUND);
    	}
        return new ResponseEntity<Order>(order, HttpStatus.OK);
    }

}
