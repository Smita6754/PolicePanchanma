package com.panchanama.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panchanama.entity.VillageData;
import com.panchanama.repository.VillageDataRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class VillageDataService {

    @Autowired
    private VillageDataRepository villageDataRepository;
    
    public List<VillageData> getDataByDvncode(int dvncode) {
        return villageDataRepository.findByDvncode(dvncode);
    }

    public List<VillageData> getDataByDtncode(int dtncode) {
        return villageDataRepository.findByDtncode(dtncode);
    }

    public List<VillageData> getDataByThncode(int thncode) {
        return villageDataRepository.findByThncode(thncode);
    }
    
//    public List<String> getDistrictsByDivision(int dvncode) {
//        return villageDataRepository.getDistrictsByDivision(dvncode);
//    }
//
//    public List<String> getTalukasByDistrict(int dtncode) {
//        return villageDataRepository.getTalukasByDistrict(dtncode);
//    }
//
//    public List<String> getVillagesByTaluka(int thncode) {
//        return villageDataRepository.getVillagesByTaluka(thncode);
//    }
    
    public List<Map<String, Object>> getDistrictsByDivision(int dvncode) {
        return villageDataRepository.getDistrictsByDivision(dvncode);
    }
    
    public List<Map<String, Object>> getAllDistricts() {
        return villageDataRepository.getAllDistricts();
    }

    public List<Map<String, Object>> getTalukasByDistrict(int dtncode) {
        return villageDataRepository.getTalukasByDistrict(dtncode);
    }

    public List<Map<String, Object>> getVillagesByTaluka(int thncode) {
        return villageDataRepository.getVillagesByTaluka(thncode);
    }

}