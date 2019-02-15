package com.cts.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.DepartmentDao;
import com.cts.product.dao.EmployeeDao;
import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private EmployeeDao empDao;
	@Autowired
	private DepartmentDao deptDao;
	@Override
	public void saveEmployee(Employee emp) {
		
		empDao.save(emp);
		
	}
	
	
	
     public Employee findOne(int empId) {
    	 return empDao.findById(empId).orElse(null);
     }

     
     public void saveDepartment(Department dept) {
    	 
    	 deptDao.save(dept);
 		
 	}
	@Override
	public Department findDepartment(int deptId) {
		
		return deptDao.findById(deptId).orElse(null);
	}
	
	
}
