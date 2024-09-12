package com.employee.hub.service;

import org.springframework.stereotype.Service;

import com.employee.hub.dto.DepartmentInputDto;
import com.employee.hub.dto.DepartmentOutputDto;
import com.employee.hub.exception.EntityAlreadyExists;
import com.employee.hub.model.DepartmentModel;
import com.employee.hub.repository.DepartmentRepository;

import java.util.Optional;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    public DepartmentOutputDto createDepartment(final DepartmentInputDto departmentInputDto) {
        final String departmentName = departmentInputDto.getName();
        final Optional<DepartmentModel> result = this.departmentRepository.findByName(departmentName);

        if (result.isEmpty()) {
            final String errorMessage = String.format("Department with the name \"%s\" already exists", departmentName);
            throw new EntityAlreadyExists(errorMessage);
        }

        final DepartmentModel departmentModel = this.departmentRepository.save(
                DepartmentModel.Builder.create(departmentInputDto).build());

        return DepartmentOutputDto.from(departmentModel);
    }
}
