package com.employee.managementService.dto;

import com.employee.managementService.model.EmployeeModel;

import java.util.UUID;

public class EmployeeOutputDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private Double salary;
    private UUID departmentId;

    public static EmployeeOutputDto from(final EmployeeModel employee) {
        final EmployeeOutputDto result = new EmployeeOutputDto();
        result.id = employee.getId();
        result.firstName = employee.getFirstName();
        result.lastName = employee.getLastName();
        result.email = employee.getEmail();
        result.salary = employee.getSalary();

        return result;
    }
}
