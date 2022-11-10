package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.service.EmployeePayrollAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePayrollAppController {
    @Autowired
    EmployeePayrollAppService employeePayrollAppService;
    @PostMapping("/post")
    public String post(){
        return EmployeePayrollAppService.printMessages();
    }
}
