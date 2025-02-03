package com.panchanama.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.panchanama.entity.IncidentRecord;
import com.panchanama.repository.IncidentRecordRepository;
import java.util.List;
import java.util.Optional;

@Service
public class IncidentRecordService {
	
	@Autowired
    private IncidentRecordRepository repository;

    public List<IncidentRecord> getAllRecords() {
        return repository.findAll();
    }

    public Optional<IncidentRecord> getRecordById(Long id) {
        return repository.findById(id);
    }

    public IncidentRecord saveRecord(IncidentRecord incidentRecord) {
        return repository.save(incidentRecord);
    }

    public void deleteRecord(Long id) {
        repository.deleteById(id);
    }

}
