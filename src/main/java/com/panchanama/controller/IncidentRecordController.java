package com.panchanama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.panchanama.entity.IncidentRecord;
import com.panchanama.service.IncidentRecordService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/incident")
public class IncidentRecordController {
	
	@Autowired
    private IncidentRecordService service;

    @GetMapping
    public List<IncidentRecord> getAllRecords() {
        return service.getAllRecords();
    }

    @GetMapping("/{id}")
    public ResponseEntity<IncidentRecord> getRecordById(@PathVariable Long id) {
        Optional<IncidentRecord> record = service.getRecordById(id);
        return record.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/")
    public ResponseEntity<IncidentRecord> createRecord(@RequestBody IncidentRecord incidentRecord) {
        IncidentRecord savedRecord = service.saveRecord(incidentRecord);
        return new ResponseEntity<>(savedRecord, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecord(@PathVariable Long id) {
        service.deleteRecord(id);
        return ResponseEntity.noContent().build();
    }

}
