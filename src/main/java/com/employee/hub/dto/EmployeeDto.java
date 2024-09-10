package com.employee.hub.dto;

import com.employee.hub.model.EmployeeModel;

import java.util.UUID;

public class EmployeeDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private Double salary;
    private UUID departmentId;

    public static EmployeeDto from(final EmployeeModel employee) {
        final EmployeeDto result = new EmployeeDto();
        result.id = employee.getId();
        result.firstName = employee.getFirstName();
        result.lastName = employee.getLastName();
        result.email = employee.getEmail();
        result.salary = employee.getSalary();

        return result;
    }
}
