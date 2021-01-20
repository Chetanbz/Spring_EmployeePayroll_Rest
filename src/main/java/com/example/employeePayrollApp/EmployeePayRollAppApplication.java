package com.example.employeePayrollApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayRollAppApplication {

	public static void main(String[] args) {
		System.out.print("hello application started");
		ApplicationContext context = SpringApplication.run(EmployeePayRollAppApplication.class, args);
		log.info("Employee Payroll App Started in {} Environment ",
				context.getEnvironment().getProperty("environment"));
		System.out.print(context.getEnvironment().getProperty("environment"));
	}

}
