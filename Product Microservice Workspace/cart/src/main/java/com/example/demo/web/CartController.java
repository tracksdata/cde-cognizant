package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ItemLine;
import com.example.demo.repository.CartRepository;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/v1/api/cart/{user}")
public class CartController {

	@Autowired
	private CartRepository cartRepository;

	@PostMapping
	public ItemLine addToCart(@PathVariable String user, @RequestBody ItemLine itemLine) {
		return cartRepository.save(user, itemLine);
	}

	@GetMapping
	public List<ItemLine> get(@PathVariable String user) {
		return cartRepository.findAll(user);
	}

	@DeleteMapping
	public void delete(@PathVariable String user) {
		cartRepository.clear(user);
	}

}
