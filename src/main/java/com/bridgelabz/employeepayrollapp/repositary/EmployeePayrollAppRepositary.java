package com.bridgelabz.employeepayrollapp.repositary;

import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeePayrollAppRepositary extends JpaRepository <Employee,Integer> {

@Query(value = "SELECT * FROM employee where department = :department", nativeQuery = true)
List<Employee> employeeFindByDepartment (String department);
}
