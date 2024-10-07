package com.employee.managementService.dto;

import com.employee.managementService.model.DepartmentModel;

import java.util.UUID;

public class DepartmentOutputDto {
    private UUID id;
    private String name;
    private double budget;
    private String createdAt;
    private String updatedAt;

    public static DepartmentOutputDto from(final DepartmentModel department) {
        final DepartmentOutputDto result = new DepartmentOutputDto();
        result.id = department.getId();
        result.name = department.getName();
        result.budget = department.getBudget();
        result.createdAt = department.getCreationDate().toString();
        result.updatedAt = department.getUpdateDate().toString();

        return result;
    }
}
