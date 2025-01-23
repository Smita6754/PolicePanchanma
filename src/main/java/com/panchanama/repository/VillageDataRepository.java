package com.panchanama.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.panchanama.entity.VillageData;

@Repository
public interface VillageDataRepository extends JpaRepository<VillageData, Integer> {
    // Add custom queries here if needed
	
//	@Query(value = "SELECT * FROM village_data vd WHERE vd.dvncode = :divId", nativeQuery = true)
//	List<VillageData> getAllDistrictByDivId(@Param("divId") Integer divId);
	
	List<VillageData> findByDvncode(int dvncode);
    List<VillageData> findByDtncode(int dtncode);
    List<VillageData> findByThncode(int thncode);
    
    @Query("SELECT DISTINCT dtename FROM VillageData WHERE dvncode = :dvncode")
    List<String> getDistrictsByDivision(@Param("dvncode") int dvncode);

    @Query("SELECT DISTINCT thename FROM VillageData WHERE lgd_dtncode = :lgd_dtncode")
    List<String> getTalukasByDistrict(@Param("lgd_dtncode") int lgd_dtncode);

    @Query("SELECT DISTINCT villname FROM VillageData WHERE lgd_thncode = :lgd_thncode")
    List<String> getVillagesByTaluka(@Param("lgd_thncode") int lgd_thncode);
}