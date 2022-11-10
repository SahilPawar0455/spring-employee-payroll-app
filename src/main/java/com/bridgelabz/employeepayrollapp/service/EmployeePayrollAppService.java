package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repositary.EmployeePayrollAppRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePayrollAppService {
    @Autowired
    EmployeePayrollAppRepositary employeePayrollAppRepositary;
    public static String printMessages() {
        return "hello world";
    }

    public Employee fillInformation(Employee employee) {
      return employeePayrollAppRepositary.save(employee);
    }

    public List <Employee> getAllEmployeeInformation() {
        return employeePayrollAppRepositary.findAll();
    }

    public Employee editEmployeeInformation(int id, int editOfRowNo,String enterTheValue) {
        Optional <Employee> employee = employeePayrollAppRepositary.findById(id);
        if (employee.get().getId() == id){
            switch (editOfRowNo){
                case 1:
                    int id1 = Integer.parseInt(enterTheValue);
                    employee.get().setId(id1);
                    break;
                case 2:
                    employee.get().setFirstName(enterTheValue);
                    break;
                case 3:
                    employee.get().setLastName(enterTheValue);
                    break;
                case 4:
                    employee.get().setProfilePic(enterTheValue);
                    break;
                case 5:
                    employee.get().setNote(enterTheValue);
                    break;
                case 6:
                    long salary = Long.parseLong(enterTheValue);
                    employee.get().setSalary(salary);
                    break;
                case 7:
                    employee.get().setStartDate(enterTheValue);
                    break;
            }
        }
        return employeePayrollAppRepositary.save(employee.get());
    }

    public void deleteEmployeeInformation(int id) {
        Optional <Employee> employee = employeePayrollAppRepositary.findById(id);
        employeePayrollAppRepositary.delete(employee.get());
    }

    public Optional<Employee> getEmployeeInformation(int id) {
        return employeePayrollAppRepositary.findById(id);
    }
}
