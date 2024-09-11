package com.employee.hub.service;

import com.employee.hub.dto.EmployeeOutputDto;
import com.employee.hub.repository.EmployeeRepository;

import java.util.UUID;

public class EmployeeService {
    public EmployeeRepository employeeRepository;

    public EmployeeOutputDto fetchEmployeeById(UUID id) {
        return this.employeeRepository.findById(id).map(EmployeeOutputDto::from).orElse(null);
    }

    public EmployeeOutputDto createEmployee(EmployeeOutputDto employeeDto) {
        /**
         * 1. Get the department first
         * 2. Check if requested salary in addition to other employess doesn't exceed the budget
         * 3.
         */
    }
}
