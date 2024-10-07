package com.employee.managementService.model;

import com.employee.managementService.dto.DepartmentInputDto;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "departments")
public class DepartmentModel extends TimestampedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private final UUID id;

    @Column(name = "name", unique = true, nullable = false)
    private final String name;

    @Column(name = "budget", nullable = false)
    private final double budget;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<EmployeeModel> employeesList;

    private DepartmentModel (final Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.budget = builder.budget;
    }

    public UUID getId() { return this.id; }

    public String getName() { return this.name; }

    public double getBudget() { return this.budget; }

    public static class Builder {
        private UUID id;
        private String name;
        private double budget;

        public static Builder create(final DepartmentInputDto dto) {
            final Builder result = new Builder();
            result.name = dto.getName();
            result.budget = dto.getBudget();

            return result;
        }

        public DepartmentModel build() { return new DepartmentModel(this); }
    }
}
