package com.intranet.catalog_service.service;

import com.intranet.catalog_service.model.AnnouncementType;
import com.intranet.catalog_service.repository.AnnouncementTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementTypeService {

    @Autowired
    private AnnouncementTypeRepository repository;

    public List<AnnouncementType> findAll() {
        return repository.findAll();
    }

    public Optional<AnnouncementType> findById(Long id) {
        return repository.findById(id);
    }

    public AnnouncementType save(AnnouncementType announcementType) {
        return repository.save(announcementType);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
