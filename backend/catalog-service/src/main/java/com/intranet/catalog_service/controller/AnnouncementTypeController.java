package com.intranet.catalog_service.controller;

import com.intranet.catalog_service.model.AnnouncementType;
import com.intranet.catalog_service.service.AnnouncementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/announcement-types")
public class AnnouncementTypeController {

    @Autowired
    private AnnouncementTypeService service;

    @GetMapping
    public List<AnnouncementType> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnnouncementType> getById(@PathVariable Long id) {
        return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AnnouncementType create(@RequestBody AnnouncementType announcementType) {
        return service.save(announcementType);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
