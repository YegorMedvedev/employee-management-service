package com.employee.hub.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "employees")
public class EmployeeModel extends TimestampedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private Double salary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private DepartmentModel department;

    public UUID getId() { return this.id; }

    public String getFirstName() { return this.firstName; }

    public String getLastName() { return this.lastName; }

    public String getEmail() { return this.email; }

    public Double getSalary() { return this.salary; }
}