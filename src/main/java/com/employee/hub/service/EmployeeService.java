package com.employee.hub.service;

import com.employee.hub.dto.EmployeeDto;
import com.employee.hub.repository.EmployeeRepository;

import java.util.UUID;

public class EmployeeService {
    public EmployeeRepository employeeRepository;

    public EmployeeDto fetchEmployeeById(UUID id) {
        return this.employeeRepository.findById(id).map(EmployeeDto::from).orElse(null);
    }
}
