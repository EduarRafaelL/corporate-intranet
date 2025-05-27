package com.intranet.catalog_service.repository;

import com.intranet.catalog_service.model.AnnouncementType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementTypeRepository extends JpaRepository<AnnouncementType, Long> {
}
