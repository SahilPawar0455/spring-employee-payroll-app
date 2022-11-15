package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollAppDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeePayrollAppController {
    @Autowired
    IEmployeePayrollAppService IEmployeePayrollAppService;
    @GetMapping("/get")
    public String post(){
        return IEmployeePayrollAppService.printMessages();
    }

    @PostMapping("/insert")
    public ResponseEntity<ResponseDTO> fillInformation(@Valid @RequestBody EmployeePayrollAppDTO employeePayrollAppDTO){
          return IEmployeePayrollAppService.fillInformation(employeePayrollAppDTO);
    }

    @GetMapping("/get1/{id}")
    public ResponseEntity<ResponseDTO> getEmployeeInformation(@PathVariable int id){
        return IEmployeePayrollAppService.getEmployeeInformation(id);
    }

    @GetMapping("/searchAllEmployee")
    public ResponseEntity<ResponseDTO> searchAllEmployee(){
        return IEmployeePayrollAppService.searchAllEmployee();
    }
    @PutMapping(value = "/update1/{id}")
    public  ResponseEntity<ResponseDTO> editEmployeeInformation1(@RequestBody EmployeePayrollAppDTO employeePayrollAppDTO,
                                              @PathVariable int id){
        return IEmployeePayrollAppService.editEmployeeInformation1(id,employeePayrollAppDTO);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeeInformation(@PathVariable int id){
       return IEmployeePayrollAppService.deleteEmployeeInformation(id);
    }
}
