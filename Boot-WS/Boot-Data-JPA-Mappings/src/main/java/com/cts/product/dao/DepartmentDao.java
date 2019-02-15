package com.cts.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
