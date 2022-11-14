package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollAppDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repositary.EmployeePayrollAppRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollAppService implements IEmployeePayrollAppService{
    @Autowired
    EmployeePayrollAppRepositary employeePayrollAppRepositary;
    @Override
    public String printMessages() {
        return "hello world";
    }

    @Override
    public ResponseEntity<ResponseDTO> fillInformation(EmployeePayrollAppDTO employeePayrollAppDTO) {
        Employee employee = new Employee(employeePayrollAppDTO);
        employeePayrollAppRepositary.save(employee);
        ResponseDTO responseDTO = new ResponseDTO(" Successfully Add in database",employee);
        return  new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ResponseDTO> deleteEmployeeInformation(int id) {
        Optional <Employee> employee = employeePayrollAppRepositary.findById(id);
        ResponseDTO responseDTO = new ResponseDTO(" Successfully delete employee ",employee);
        employeePayrollAppRepositary.delete(employee.get());
        return  new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseDTO> getEmployeeInformation(int id) {
        Optional<Employee> employee=employeePayrollAppRepositary.findById(id);
        ResponseDTO responseDTO = new ResponseDTO(" Successfully getting employee ",employee);
        return  new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseDTO> searchAllEmployee() {
        List<Employee> employeeList = employeePayrollAppRepositary.findAll();
        ResponseDTO responseDTO = new ResponseDTO("All Employee Details",employeeList);
        return  new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ResponseDTO> editEmployeeInformation1(int id, EmployeePayrollAppDTO employeePayrollAppDTO){
        Optional <Employee> optional= employeePayrollAppRepositary.findById(id);
        if (optional.get().getId() == id){
            Employee employee1 = new Employee(id,employeePayrollAppDTO);
            employeePayrollAppRepositary.save(employee1);
            ResponseDTO responseDTO = new ResponseDTO(" Successfully Update ",employee1);
            return  new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
        }else {
            return null;
        }
    }
}
