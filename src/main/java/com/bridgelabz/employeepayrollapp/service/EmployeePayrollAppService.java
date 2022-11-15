package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollAppDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.exceptions.EmployeePayrollAppException;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repositary.EmployeePayrollAppRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollAppService implements IEmployeePayrollAppService{
    @Autowired
    EmployeePayrollAppRepositary employeePayrollAppRepositary;
   // List<Employee> employeeList = new ArrayList<>();

    @Override
    public String printMessages() {
        return "hello world";
    }

    @Override
    public ResponseEntity<ResponseDTO> fillInformation(EmployeePayrollAppDTO employeePayrollAppDTO) {
        Employee employee = new Employee(employeePayrollAppDTO);
        employeePayrollAppRepositary.save(employee);                                              // save in repository
       // employeeList.add(employee);                                                               // add in employee List
        ResponseDTO responseDTO = new ResponseDTO(" Successfully Add in database",employee);
        return  new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ResponseDTO> deleteEmployeeInformation(int id) {
        Optional <Employee> employee = employeePayrollAppRepositary.findById(id);
        ResponseDTO responseDTO = new ResponseDTO(" Successfully delete employee ",employee);
        employeePayrollAppRepositary.delete(employee.get());                            // delete in repository
       // employeeList.remove(employee.get());                                            // delete in employee List
        return  new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseDTO> getEmployeeInformation(int id) {
        Optional<Employee> employee=employeePayrollAppRepositary.findById(id);          // get Employee in repository
       // Employee employee1 = employeeList.get(id);                                      // get Employee in Employee List
        ResponseDTO responseDTO = new ResponseDTO(" Successfully getting employee ",employee);
        return  new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseDTO> searchAllEmployee() {
        List<Employee> employeeList1 = employeePayrollAppRepositary.findAll();        // get all Employee in repository
     //   List<Employee> employeeList2 = employeeList.stream().toList();                //  get all Employee in Employee List
        ResponseDTO responseDTO = new ResponseDTO("All Employee Details",employeeList1);
        return  new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseDTO> editEmployeeInformation1(int id, EmployeePayrollAppDTO employeePayrollAppDTO){
        Optional <Employee> employee = employeePayrollAppRepositary.findById(id);                    // get Employee in repository
    //    Employee employee2 = employeeList.get(id);                                                  // get Employee in Employee List
        if (employee.get().getId() == id){
            Employee employee3 = new Employee(id,employeePayrollAppDTO);
            employeePayrollAppRepositary.save(employee3);                                           // update Employee in repository
           // employeeList.add(employee3);                                                            // update Employee in Employee List
            ResponseDTO responseDTO = new ResponseDTO(" Successfully Update ",employee3);
            return  new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
        }else {
            return null;
        }
    }
}
