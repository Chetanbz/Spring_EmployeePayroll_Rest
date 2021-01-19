package com.example.employeePayrollApp.services;

import java.util.List;

import com.example.employeePayrollApp.dto.EmployeePayrollData;
import com.example.employeePayrollApp.model.EmployeePayrollDTO;

public interface IEmployeePayrollService {
    
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeePayrollData(int empId);


}
