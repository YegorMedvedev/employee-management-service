package com.employee.managementService.controller;

import com.employee.managementService.dto.DepartmentInputDto;
import com.employee.managementService.dto.DepartmentOutputDto;
import com.employee.managementService.exception.EntityAlreadyExists;
import com.employee.managementService.service.DepartmentService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Validated
public class DepartmentController {
    private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("")
    public ResponseEntity<DepartmentOutputDto> createDepartment(@RequestBody final DepartmentInputDto departmentInputDto) {
        try {
            final DepartmentOutputDto result = this.departmentService.createDepartment(departmentInputDto);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }  catch (final EntityAlreadyExists e) {
            logger.error("Exception occurred", e);
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        } catch (final Exception e) {
            logger.error("Exception occurred", e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
