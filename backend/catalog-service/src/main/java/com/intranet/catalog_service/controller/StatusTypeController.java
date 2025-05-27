package com.intranet.catalog_service.controller;

import com.intranet.catalog_service.model.StatusType;
import com.intranet.catalog_service.service.StatusTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/status-types")
public class StatusTypeController {

    @Autowired
    private StatusTypeService service;

    @GetMapping
    public List<StatusType> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatusType> getById(@PathVariable Long id) {
        return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public StatusType create(@RequestBody StatusType statusType) {
        return service.save(statusType);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
