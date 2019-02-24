package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.product.dao.CartRepository;
import com.cts.product.dao.ItemLineDao;
import com.cts.product.entity.ItemLine;
import com.cts.product.entity.Product;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/cart/{user}")
@RefreshScope
public class CartController {

	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private ItemLineDao itemLineDao;

	@PostMapping
	public ResponseEntity<?> addToCart(@PathVariable String user, @RequestBody ItemLine itemLine) {

		System.out.println("---> new for mngo");
		itemLine.setUser(user);
	
		itemLineDao.save(itemLine);
		/*String url = "http://localhost:8081/api/products";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Product[]> response = restTemplate.getForEntity(url, Product[].class);

		Product[] products = response.getBody();
		boolean flag = false;
		for (Product prod : products) {
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println("---------------------");
			if (itemLine.getItem().getId() == prod.getId()) {
				flag = true;
			}
		}

		if (flag) {
			return new ResponseEntity<ItemLine>(cartRepository.save(user, itemLine),HttpStatus.NO_CONTENT);
			//return cartRepository.save(user, itemLine);

		}
		return new ResponseEntity<String>("Item Id "+itemLine.getItem().getId()+" not found in products ",HttpStatus.OK);

*/
		return new ResponseEntity<ItemLine>(itemLine,HttpStatus.OK);

	}

	@GetMapping
	public List<ItemLine> get(@PathVariable String user) {
		return itemLineDao.findAll();
		}

	@DeleteMapping
	public void delete(@PathVariable String user) {
		cartRepository.clear(user);
	}

}
