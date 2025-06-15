package com.panchanama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
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

    @Autowired
    private ObjectMapper objectMapper;
    
    @PostMapping(value = "/save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> saveIncident(
        @RequestPart("data") String incidentJson,
        @RequestPart(value = "policeSign", required = false) MultipartFile policeSign,
        @RequestPart(value = "witnessSign", required = false) MultipartFile witnessSign,
        @RequestPart(value = "arresteeSign", required = false) MultipartFile arresteeSign
    ) {
        try {
            IncidentRecord incident = objectMapper.readValue(incidentJson, IncidentRecord.class);
            String result = service.saveIncidentRecord(incident, policeSign, witnessSign, arresteeSign);
            if (result.contains("successfully")) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid input: " + e.getMessage());
        }
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecord(@PathVariable Long id) {
        service.deleteRecord(id);
        return ResponseEntity.noContent().build();
    }

}
