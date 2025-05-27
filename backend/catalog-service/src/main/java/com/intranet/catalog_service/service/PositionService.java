package com.intranet.catalog_service.service;

import com.intranet.catalog_service.model.Position;
import com.intranet.catalog_service.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionService {

    @Autowired
    private PositionRepository repository;

    public List<Position> findAll() {
        return repository.findAll();
    }

    public Optional<Position> findById(Long id) {
        return repository.findById(id);
    }

    public Position save(Position position) {
        return repository.save(position);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
