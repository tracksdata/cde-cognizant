package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.UserDao;
import com.cts.product.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public void saveUser(User user) {
		dao.save(user);
	}

	@Override
	public User findUser(String userId) {
		return dao.findById(userId).orElse(null);
	}

	public User validateUser(User user) {

		return dao.findUserByUserIdAndPasswordIsLike(user.getUserId(), user.getPassword());

	}

}
