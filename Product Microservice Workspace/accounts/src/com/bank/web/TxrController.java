package com.bank.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.service.TxrService;

@Controller
@RequestMapping("/api/txr")
public class TxrController {

	@Autowired
	private TxrService txrService;

	@PostMapping
	public @ResponseBody TxrResponse doTxr(@RequestBody TxrRequest request) {
		txrService.transfer(request.getAmount(), request.getFromAccNum(), request.getToAccNum());
		TxrResponse response = new TxrResponse();
		response.setMessage("Txr success");
		return response;
	}

}
