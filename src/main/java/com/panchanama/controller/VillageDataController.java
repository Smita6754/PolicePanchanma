package com.panchanama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.panchanama.entity.User;
import com.panchanama.entity.VillageData;
import com.panchanama.service.VillageDataService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/villages")
public class VillageDataController {

    @Autowired
    private VillageDataService villageDataService;

    @GetMapping("/by-dvncode/{dvncode}")
    public List<VillageData> getVillageDataByDvncode(@PathVariable int dvncode) {
        return villageDataService.getDataByDvncode(dvncode);
    }

    @GetMapping("/by-dtncode/{dtncode}")
    public List<VillageData> getVillageDataByDtncode(@PathVariable int dtncode) {
        return villageDataService.getDataByDtncode(dtncode);
    }

    @GetMapping("/by-thncode/{thncode}")
    public List<VillageData> getVillageDataByThncode(@PathVariable int thncode) {
        return villageDataService.getDataByThncode(thncode);
    }
    
//    @GetMapping("/districts/{dvncode}")
//    public List<String> getDistrictsByDivision(@PathVariable int dvncode) {
//        return villageDataService.getDistrictsByDivision(dvncode);
//    }
//
//    @GetMapping("/talukas/{dtncode}")
//    public List<String> getTalukasByDistrict(@PathVariable int dtncode) {
//        return villageDataService.getTalukasByDistrict(dtncode);
//    }
//
//    @GetMapping("/villages/{thncode}")
//    public List<String> getVillagesByTaluka(@PathVariable int thncode) {
//        return villageDataService.getVillagesByTaluka(thncode);
//    }
    
    @GetMapping("/districts/{dvncode}")
    public List<Map<String, Object>> getDistrictsByDivision(@PathVariable int dvncode) {
        return villageDataService.getDistrictsByDivision(dvncode);
    }
    
    @GetMapping("/districts")
    public List<Map<String, Object>> getAllDistricts() {
        return villageDataService.getAllDistricts();
    }

    @GetMapping("/talukas/{dtncode}")
    public List<Map<String, Object>> getTalukasByDistrict(@PathVariable int dtncode) {
        return villageDataService.getTalukasByDistrict(dtncode);
    }

    @GetMapping("/villages/{thncode}")
    public List<Map<String, Object>> getVillagesByTaluka(@PathVariable int thncode) {
        return villageDataService.getVillagesByTaluka(thncode);
    }
}
