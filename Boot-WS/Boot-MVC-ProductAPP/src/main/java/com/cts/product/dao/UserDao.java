package com.cts.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cts.product.entity.User;

public interface UserDao extends JpaRepository<User, String> {

	//@Query("from User u where u.userId=:#{#user.userId} and u.password=:#{#user.psssword}")
	//boolean loginCheck(@Param("user") User user);
	
	User findUserByUserIdAndPasswordIsLike(String userId,String password);
}
