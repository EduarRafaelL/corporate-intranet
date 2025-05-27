package com.intranet.employee_service.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;
@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long employeeId;
    
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String position;
    private String department;
    private Long managerId;
    private String role;
    private LocalDateTime hireDate;
    private Boolean isActive = true;

    private LocalDateTime createdAt = LocalDateTime.now();
    private Integer createdBy;
    private LocalDateTime updatedAt;
    private Integer updatedBy;
}
