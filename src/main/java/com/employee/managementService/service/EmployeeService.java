package com.employee.managementService.service;

import org.springframework.stereotype.Service;

import com.employee.managementService.dto.EmployeeOutputDto;
import com.employee.managementService.repository.EmployeeRepository;

import java.util.UUID;

@Service
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

        throw new UnsupportedOperationException("This operation is not implemented yet.");
    }
}
