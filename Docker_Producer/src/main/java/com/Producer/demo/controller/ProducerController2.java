package com.Producer.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController2 {

    @RequestMapping("/hello")
    public String indexConsume() {
    	
        return "hi this is tomcat of producer";
    	//System.out.println("my Anme us bjhbd");
       
        		
    }
    @RequestMapping("/hello1")
    public String indexConsume1()
    {
    	return "Hi this is called inside the different methos";
    }
    
}