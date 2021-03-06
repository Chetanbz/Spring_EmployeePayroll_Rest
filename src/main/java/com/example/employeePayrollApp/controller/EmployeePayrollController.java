package com.example.employeePayrollApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeePayrollApp.dto.EmployeePayrollData;
import com.example.employeePayrollApp.model.EmployeePayrollDTO;
import com.example.employeePayrollApp.model.ResponseDTO;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
		EmployeePayrollData empData =null;
		empData = new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",30000));
		ResponseDTO respDTO = new ResponseDTO("Get Call SuccessFull", empData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId){
		EmployeePayrollData empData =null;
		empData = new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",30000));
		ResponseDTO respDTO = new ResponseDTO("Get call Sucess for Id:", empData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData( @RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData empData =null;
		empData = new EmployeePayrollData(1,employeePayrollDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data for:", empData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData( @RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData empData =null;
		empData = new EmployeePayrollData(1,employeePayrollDTO);
		ResponseDTO respDTO = new ResponseDTO("Update Employee Payroll Data for :", empData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		ResponseDTO respDTO = new ResponseDTO("Delete  Sucessfully :","Deleted Id: " + empId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
