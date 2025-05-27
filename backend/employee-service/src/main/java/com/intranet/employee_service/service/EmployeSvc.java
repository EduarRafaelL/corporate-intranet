package com.intranet.employee_service.service;

import com.intranet.employee_service.model.Employee;
import com.intranet.employee_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeSvc {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> updateEmployee(Long id, Employee updatedEmployee) {
        return employeeRepository.findById(id).map(emp -> {
            emp.setFirstName(updatedEmployee.getFirstName());
            emp.setLastName(updatedEmployee.getLastName());
            emp.setEmail(updatedEmployee.getEmail());
            emp.setPhone(updatedEmployee.getPhone());
            emp.setPosition(updatedEmployee.getPosition());
            emp.setDepartment(updatedEmployee.getDepartment());
            emp.setManagerId(updatedEmployee.getManagerId());
            emp.setRole(updatedEmployee.getRole());
            emp.setHireDate(updatedEmployee.getHireDate());
            emp.setIsActive(updatedEmployee.getIsActive());
            emp.setUpdatedAt(updatedEmployee.getUpdatedAt());
            emp.setUpdatedBy(updatedEmployee.getUpdatedBy());
            return employeeRepository.save(emp);
        });
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
