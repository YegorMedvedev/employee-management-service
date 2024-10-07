package com.employee.managementService.repository;

import com.employee.managementService.model.DepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentModel, UUID> {
    Optional<DepartmentModel> findByName(String name);
}
