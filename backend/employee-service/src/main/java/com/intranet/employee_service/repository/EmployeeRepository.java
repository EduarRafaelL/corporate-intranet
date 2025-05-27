package com.intranet.employee_service.repository;

import com.intranet.employee_service.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Aquí puedes agregar métodos personalizados como:
    // List<Employee> findByDepartment(String department);
}
