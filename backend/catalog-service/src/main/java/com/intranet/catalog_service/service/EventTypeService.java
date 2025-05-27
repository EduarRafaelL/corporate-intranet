package com.intranet.catalog_service.service;

import com.intranet.catalog_service.model.EventType;
import com.intranet.catalog_service.repository.EventTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventTypeService {

    @Autowired
    private EventTypeRepository repository;

    public List<EventType> findAll() {
        return repository.findAll();
    }

    public Optional<EventType> findById(Long id) {
        return repository.findById(id);
    }

    public EventType save(EventType eventType) {
        return repository.save(eventType);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
