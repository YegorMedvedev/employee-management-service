package com.employee.hub.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "departments")
public class DepartmentModel extends TimestampedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "budget")
    private double budget;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<EmployeeModel> employeesList;
}
