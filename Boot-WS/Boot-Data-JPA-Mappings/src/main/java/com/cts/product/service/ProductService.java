package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;

public interface ProductService {

	public void saveEmployee(Employee emp);
	public void saveDepartment(Department dept);
	public Department findDepartment(int deptId);
    public Employee findOne(int empId);
	
	

}