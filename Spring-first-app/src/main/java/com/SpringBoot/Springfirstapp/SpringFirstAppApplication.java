package com.SpringBoot.Springfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackageClasses = EmployeeContoller.class)
public class SpringFirstAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringFirstAppApplication.class, args);
	}

}
