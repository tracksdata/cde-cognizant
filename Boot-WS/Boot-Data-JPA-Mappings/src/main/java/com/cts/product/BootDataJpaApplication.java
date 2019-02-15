package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class BootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(BootDataJpaApplication.class, args);
		ProductService ps=ac.getBean(ProductService.class);
		
		
		Department dept=new Department();
		dept.setDeptId(1024);
		dept.setDeptName("Accounts");
		dept.setLoc("Chennai");
		
		
		Employee e1=new Employee(10, "Praveen", 773773);
		Employee e2=new Employee(11, "James", 458745);
		Employee e3=new Employee(12, "Ozvitha", 2344);
		Employee e4=new Employee(13, "Ruth", 544468);
		Employee e5=new Employee(14, "Dev", 84846);
		
		
		dept.getEmps().add(e1);
		dept.getEmps().add(e2);
		dept.getEmps().add(e3);
		dept.getEmps().add(e4);
		dept.getEmps().add(e5);

		ps.saveDepartment(dept);
		
		
		

		
	
		
		
		
	}

}

