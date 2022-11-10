package com.bridgelabz.employeepayrollapp.repositary;

import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeePayrollAppRepositary extends JpaRepository <Employee,Integer> {
}
