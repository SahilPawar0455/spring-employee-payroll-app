package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollAppDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.service.EmployeePayrollAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeePayrollAppController {
    @Autowired
    EmployeePayrollAppService employeePayrollAppService;
    @GetMapping("/get")
    public String post(){
        return employeePayrollAppService.printMessages();
    }

    @PostMapping("/insert")
    public ResponseEntity<ResponseDTO> fillInformation(@RequestBody EmployeePayrollAppDTO employeePayrollAppDTO){
          return employeePayrollAppService.fillInformation(employeePayrollAppDTO);
    }

    @GetMapping("/get1/{id}")
    public ResponseEntity<ResponseDTO> getEmployeeInformation(@PathVariable int id){
        return employeePayrollAppService.getEmployeeInformation(id);
    }

    @GetMapping("/searchAllEmployee")
    public ResponseEntity<ResponseDTO> searchAllEmployee(){
        return employeePayrollAppService.searchAllEmployee();
    }
    @PutMapping(value = "/update1/{id}")
    public  ResponseEntity<ResponseDTO> editEmployeeInformation1(@RequestBody EmployeePayrollAppDTO employeePayrollAppDTO,
                                              @PathVariable int id){
        return employeePayrollAppService.editEmployeeInformation1(id,employeePayrollAppDTO);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeeInformation(@PathVariable int id){
       return employeePayrollAppService.deleteEmployeeInformation(id);
    }
}
