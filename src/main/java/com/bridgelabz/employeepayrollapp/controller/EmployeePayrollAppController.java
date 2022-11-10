package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.service.EmployeePayrollAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeePayrollAppController {
    @Autowired
    EmployeePayrollAppService employeePayrollAppService;
    @PostMapping("/post")
    public String post(){
        return EmployeePayrollAppService.printMessages();
    }

    @PostMapping("/insert")
    public Employee fillInformation(@RequestBody Employee employee){
        return employeePayrollAppService.fillInformation(employee);
    }

    @GetMapping("/get1/{id}")
    public Optional<Employee> getEmployeeInformation(@PathVariable int id){
        return employeePayrollAppService.getEmployeeInformation(id);
    }

    @GetMapping("/get")
    public List<Employee> getAllEmployeeInformation(){
        return employeePayrollAppService.getAllEmployeeInformation();
    }

    @PutMapping(value = "/update/{id}")
    public Employee editEmployeeInformation(@PathVariable int id,
                                            @RequestParam(value = "editOfRowName")int editOfRowNo,
                                            @RequestParam(value = "EnterTheValue")String EnterTheValue){
        return employeePayrollAppService.editEmployeeInformation(id,editOfRowNo,EnterTheValue);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteEmployeeInformation(@PathVariable int id){
        employeePayrollAppService.deleteEmployeeInformation(id);
    }
}
