package com.example.employeePayrollApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

import java.util.List;

import com.example.employeePayrollApp.dto.EmployeePayrollData;
import com.example.employeePayrollApp.model.EmployeePayrollDTO;
import com.example.employeePayrollApp.model.ResponseDTO;
import com.example.employeePayrollApp.services.IEmployeePayrollService;

import javax.validation.Valid;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

	@Autowired
	private IEmployeePayrollService employeePayrollService;
	
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
		System.out.println("Get,1");
		List<EmployeePayrollData> empdataList = null;
		empdataList = employeePayrollService.getEmployeePayrollData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", empdataList);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId){
		System.out.println("Get,2");
		EmployeePayrollData empData =null;
		empData = employeePayrollService.getEmployeePayrollDataById(empId);
		ResponseDTO respDTO = new ResponseDTO("Get call Sucess for Id:", empData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@Valid  @RequestBody EmployeePayrollDTO employeePayrollDTO){
		System.out.println("post");
		EmployeePayrollData empData =null;
		empData = employeePayrollService.createEmployeePayrollData(employeePayrollDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data for: ", empData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@PutMapping("/update/{empId}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData( @PathVariable("empId") int empId,
	                                                             @Valid @RequestBody EmployeePayrollDTO employeePayrollDTO){
		System.out.println("Put");
		EmployeePayrollData empData =null;
		empData = employeePayrollService.updateEmployeePayrollData(empId,employeePayrollDTO);
		ResponseDTO respDTO = new ResponseDTO("Update Employee Payroll Data for :", empData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		System.out.println("delete");
		employeePayrollService.deleteEmployeePayrollData(empId);
		ResponseDTO respDTO = new ResponseDTO("Delete  Sucessfully :","Deleted Id: " + empId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
