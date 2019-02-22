package com.example;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Receiver {
	
	MyMessage msg;
	
	public Receiver() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Receiver(MyMessage  msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
		
	}
	

	@RabbitListener(queues = "my-Q")
    public void receiveMessage(String myMsg) {
       // log.info("Received message as generic: {}", message.toString());
		System.out.println("---- Receiced Message: ");
		msg.setMessage(myMsg);
		
    }

	

}
