package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e1=ac.getBean("employee",Employee.class);
		
		//new Employee().info();
		//e1.info();
		//e1.setDept(new Department());
		//Employee e2=ac.getBean("e1",Employee.class);

		//e1.display();
		
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getSalary());
		
		System.out.println(e1.getDept().getDeptId());
		System.out.println(e1.getDept().getDeptName());
		
		
		System.out.println("--- done ");
		
		ac.registerShutdownHook();
		
		
		
	}

}
