package com.cts.product.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	
	

	@Id
	private int empId;
	private String empName;
	private double salary;

	//@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	//@JoinColumn(name="deptId")
	
	
	
	
	
	
	public int getEmpId() {
		return empId;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double salary) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}
