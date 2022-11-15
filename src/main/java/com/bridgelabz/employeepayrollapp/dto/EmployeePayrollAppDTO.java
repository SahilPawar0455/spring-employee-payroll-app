package com.bridgelabz.employeepayrollapp.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.bridge.Message;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePayrollAppDTO {
    @NotEmpty(message = "Employee First name is mandatory")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee First Name Invalid")
    private String firstName;

    @NotEmpty(message = "Employee Last name is mandatory")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee Last Name Invalid")
    private String lastName;

    private String profilePic;

    @NotEmpty(message = "Notes is mandatory")
    private String note;

    @Min(15000)
    private long salary;

    @NotEmpty(message = "Start Date is mandatory")
    private String startDate;
}
