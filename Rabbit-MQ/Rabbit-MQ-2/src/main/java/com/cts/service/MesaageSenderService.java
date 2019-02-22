package com.cts.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaageSenderService {
	
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	
	
	public void send(String msg) {
		rabbitTemplate.convertAndSend(msg);
		System.out.println("Sent msg to Queque = " + msg);
	    
	}
	

}
