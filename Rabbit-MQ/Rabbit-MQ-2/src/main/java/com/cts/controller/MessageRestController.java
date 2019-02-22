package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.service.MesaageSenderService;

@RestController
@RequestMapping("/orders")
public class MessageRestController {
	
	@Autowired
	private MesaageSenderService msgService;

	
	@GetMapping("/message/{msg}")
	public String writeMsg(@PathVariable("msg") String msg) {
	
		msgService.send(msg);
		return msg;
	}

}
