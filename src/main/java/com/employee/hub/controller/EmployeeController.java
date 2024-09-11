package com.employee.hub.controller;

import com.employee.hub.dto.EmployeeOutputDto;
import com.employee.hub.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/employees")
@Validated
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeOutputDto> getEmployeeById(@PathVariable final UUID id) {
        try {
            final EmployeeOutputDto result = employeeService.fetchEmployeeById(id);
            if (result != null) {
                return new ResponseEntity<>(result, HttpStatus.OK);
            }
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } catch (final Exception e) {
            logger.error("Exception occurred", e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("")
    public ResponseEntity<EmployeeOutputDto> createEmployee() {
        return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);
    }
}
