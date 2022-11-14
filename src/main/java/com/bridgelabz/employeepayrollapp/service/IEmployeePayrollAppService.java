package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollAppDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface IEmployeePayrollAppService {
    String printMessages();
    ResponseEntity<ResponseDTO> fillInformation(EmployeePayrollAppDTO employeePayrollAppDTO);
    ResponseEntity<ResponseDTO> deleteEmployeeInformation(int id);
    ResponseEntity<ResponseDTO> getEmployeeInformation(int id);
    ResponseEntity<ResponseDTO> searchAllEmployee();
    ResponseEntity<ResponseDTO> editEmployeeInformation1(int id, EmployeePayrollAppDTO employeePayrollAppDTO);
}
