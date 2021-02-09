package com.att.orders;

import java.io.File;
import java.nio.file.Files;

import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {
	
	public static String getContent(String fileName) {
		
		File file;
		String content=null;
		try {
			file = ResourceUtils.getFile("classpath:"+fileName);
			content = new String(Files.readAllBytes(file.toPath()));
		}catch(Exception e) {
			//to behandled.. 
		}
		
		return content;
	}
	
	public static Object getObject(String content, Class className) {
	try {
		return 	new ObjectMapper().readValue(content, className);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}
	
	

}
