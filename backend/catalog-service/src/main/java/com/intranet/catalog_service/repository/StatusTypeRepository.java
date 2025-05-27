package com.intranet.catalog_service.repository;

import com.intranet.catalog_service.model.StatusType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusTypeRepository extends JpaRepository<StatusType, Long> {
}
