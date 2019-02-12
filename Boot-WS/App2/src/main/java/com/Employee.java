package com;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

// Bean class / POJO
@Component("emp")
public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	
	@Bean
	public void info() {
		System.out.println("------- Informaton about an employee");
	}
	

	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
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
		// -- changes
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("sallry: " + salary);
		// System.out.println("Id: "+empId);
		// System.out.println("Id: "+empId);

	}

}
