package com.bridgelabz.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePayrollAppDTO {
    private String firstName;
    private String lastName;
    private String profilePic;
    private String note;
    private long salary;
    private String startDate;
}
