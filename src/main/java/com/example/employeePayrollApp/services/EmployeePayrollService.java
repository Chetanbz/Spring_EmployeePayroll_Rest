package com.example.employeePayrollApp.services;

import java.util.ArrayList;
import java.util.List;

import com.example.employeePayrollApp.dto.EmployeePayrollData;
import com.example.employeePayrollApp.model.EmployeePayrollDTO;

import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> empdataList = new ArrayList<>();
        empdataList.add( new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",30000)));
        return empdataList;
    }

    @Override
    public EmployeePayrollData gEmployeePayrollDataById(int empId) {
        EmployeePayrollData empData = null;
        empData =  new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",30000));
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,employeePayrollDTO); 
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,employeePayrollDTO); 
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        // TODO Auto-generated method stub

    }
    
}
