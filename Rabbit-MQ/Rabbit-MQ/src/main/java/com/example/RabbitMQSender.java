package com.example;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	
	
	public void send(String company) {
		rabbitTemplate.convertAndSend(company);
		System.out.println("Send msg = " + company);
	    
	}

}
