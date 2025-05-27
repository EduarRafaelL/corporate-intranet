package com.intranet.catalog_service.service;

import com.intranet.catalog_service.model.StatusType;
import com.intranet.catalog_service.repository.StatusTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusTypeService {

    @Autowired
    private StatusTypeRepository repository;

    public List<StatusType> findAll() {
        return repository.findAll();
    }

    public Optional<StatusType> findById(Long id) {
        return repository.findById(id);
    }

    public StatusType save(StatusType statusType) {
        return repository.save(statusType);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
