package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.product.entity.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	// custom method
	
}