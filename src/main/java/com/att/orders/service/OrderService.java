package com.att.orders.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.att.orders.Util;
import com.att.orders.modal.Order;

@Service
public class OrderService {
	
	static List<Order> orderList = new ArrayList<Order>();
	
	static {
	String cont = Util.getContent("orders.json");
	Order order = (Order) Util.getObject(cont, Order.class);
	
	orderList.add(order);
	}

	public Order getOrder(long orderId) {
		
		Order ord = orderList.stream().filter(order->orderId==order.getId()).findFirst().orElse(null);	;
		
		return  ord;
		
	}
}
