package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollAppDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
   private int id;
   private String firstName;
   private String lastName;
   private String profilePic;
   private String note;
   private long salary;
   private String startDate;
    public Employee(EmployeePayrollAppDTO employeePayrollAppDTO) {
        this.firstName = employeePayrollAppDTO.getFirstName();
        this.lastName = employeePayrollAppDTO.getLastName();
        this.profilePic = employeePayrollAppDTO.getProfilePic();
        this.note = employeePayrollAppDTO.getNote();
        this.salary = employeePayrollAppDTO.getSalary();
        this.startDate = employeePayrollAppDTO.getStartDate();
    }

    public Employee(int id, EmployeePayrollAppDTO employeePayrollAppDTO) {
        this.id = id;
        this.firstName = employeePayrollAppDTO.getFirstName();
        this.lastName = employeePayrollAppDTO.getLastName();
        this.profilePic = employeePayrollAppDTO.getProfilePic();
        this.note = employeePayrollAppDTO.getNote();
        this.salary = employeePayrollAppDTO.getSalary();
        this.startDate = employeePayrollAppDTO.getStartDate();
    }
}
