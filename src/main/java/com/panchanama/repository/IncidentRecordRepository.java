package com.panchanama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.panchanama.entity.IncidentRecord;


@Repository
public interface IncidentRecordRepository extends JpaRepository<IncidentRecord, Long> {
	// You can add custom queries if needed
}
