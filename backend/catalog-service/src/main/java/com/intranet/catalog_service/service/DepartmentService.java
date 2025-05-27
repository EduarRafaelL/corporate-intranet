package com.intranet.catalog_service.service;

import com.intranet.catalog_service.model.Department;
import com.intranet.catalog_service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<Department> findAll() {
        return repository.findAll();
    }

    public Optional<Department> findById(Long id) {
        return repository.findById(id);
    }

    public Department save(Department department) {
        return repository.save(department);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
