package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	
	@Autowired
	RabbitMQSender rabbitMQSender;
	
	@Autowired
	Receiver rec;

	@GetMapping(value = "/producer/{msg}")
	public String producer(@PathVariable("msg") String empName) {
	
	
	//emp.setEmpName(empName);
		rabbitMQSender.send(empName);

		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}
	
	
	@GetMapping("/display")
	public String getMessage() {
		MyMessage mm=new  MyMessage();
		Receiver r=new Receiver(mm);
		System.out.println("---- Controller: MM: "+mm.getMessage());
		//return rec.receiveMessage("test");
		return mm.getMessage();
	}

}
