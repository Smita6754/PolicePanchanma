package com.panchanama.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.panchanama.entity.IncidentRecord;
import com.panchanama.repository.IncidentRecordRepository;
import java.util.List;
import java.util.Optional;

@Service
public class IncidentRecordService {
	
	@Autowired
    private IncidentRecordRepository repository;
	
	@Autowired
    private FileStorageService fileStorageService;

    public List<IncidentRecord> getAllRecords() {
        return repository.findAll();
    }

    public Optional<IncidentRecord> getRecordById(Long id) {
        return repository.findById(id);
    }
    
    public String saveIncidentRecord(IncidentRecord incident, MultipartFile policeSign, MultipartFile witnessSign, MultipartFile arresteeSign) {
        try {
            if (policeSign != null) {
                incident.setPoliceSignPath(fileStorageService.storeFile(policeSign, "police"));
            }
            if (witnessSign != null) {
                incident.setWitnessSignPath(fileStorageService.storeFile(witnessSign, "witness"));
            }
            if (arresteeSign != null) {
                incident.setArresteeSignPath(fileStorageService.storeFile(arresteeSign, "arrestee"));
            }

            repository.save(incident);
            return "Incident saved successfully.";
        } catch (Exception e) {
            return "Error saving incident: " + e.getMessage();
        }
    }

    public void deleteRecord(Long id) {
        repository.deleteById(id);
    }

}
