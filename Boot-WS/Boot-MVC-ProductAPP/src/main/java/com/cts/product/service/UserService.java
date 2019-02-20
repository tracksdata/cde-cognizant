package com.cts.product.service;

import com.cts.product.entity.User;

public interface UserService {

	void saveUser(User user);

	User findUser(String userId);
	public User validateUser(User user);

}