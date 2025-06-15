package com.panchanama.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "incident_records")
public class IncidentRecord {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "user_id", referencedColumnName = "userId")
	    private User user;

	    @Column(name = "ecase_id")
	    private String ecaseId;

	    @Column(name = "district_name")
	    private String districtName;

	    @Column(name = "district_code")
	    private String districtCode;

	    @Column(name = "taluka_name")
	    private String talukaName;

	    @Column(name = "taluka_code")
	    private String talukaCode;

	    @Column(name = "village_name")
	    private String villageName;

	    @Column(name = "village_code")
	    private String villageCode;

	    @Column(name = "arrest_date_time")
	    private String arrestDateTime;

	    @Column(name = "place_of_arrest")
	    private String placeOfArrest;

	    @Column(name = "arrested_full_name")
	    private String arresteeFullName;

	    @Column(name = "arrestee_father_or_husband_name")
	    private String arresteeFatherHusband;

	    private String age;
	    private String gender;
	    private String address;
	    private String occupation;

	    @Column(name = "offense_description")
	    private String offenseDescription;

	    @Column(name = "legal_sections")
	    private String legalSections;

	    @Column(name = "witness_name")
	    private String witnessName;

	    @Column(name = "witness_address")
	    private String witnessAddress;

	    @Column(name = "witness_role_relation_to_incident")
	    private String witnessRoleRelationToIncident;

	    @Column(name = "police_officer_name")
	    private String policeOfficerName;

	    @Column(name = "police_officer_rank")
	    private String policeOfficerRank;

	    @Column(name = "badge_no")
	    private String badgeNo;

	    @Column(name = "police_station_no")
	    private String policeStationNo;

	    @Column(name = "list_of_items")
	    private String listOfItems;

	    @Column(name = "condition_of_items")
	    private String conditionOfItems;

	    @Column(name = "medical_examination_report")
	    private String medicalExaminationReport;

	    private String enjuries;

	    @Column(name = "arrestee_mobile_no")
	    private String arresteeMobileNo;

	    @Column(name = "witness_mobile_no")
	    private String witnessMobileNo;

	    @Column(name = "police_sign_path")
	    private String policeSignPath;

	    @Column(name = "witness_sign_path")
	    private String witnessSignPath;

	    @Column(name = "arrestee_sign_path")
	    private String arresteeSignPath;

	    @Column(name = "police_sign_name")
	    private String policeSignName;

	    @Column(name = "witness_sign_name")
	    private String witnessSignName;

	    @Column(name = "arrestee_sign_name")
	    private String arresteeSignName;

	    @Column(name = "user_latitude")
	    private String userLatitude;

	    @Column(name = "user_longitude")
	    private String userLongitude;

	    @Column(name = "user_accuracy")
	    private String userAccuracy;

	    @Column(name = "mapping_date")
	    private String mappingDate;

	    @Column(name = "sending_date")
	    private String sendingDate;

	    private String remark;

	    @Column(name = "app_version")
	    private String appVersion;

	    private String status;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public String getEcaseId() {
			return ecaseId;
		}

		public void setEcaseId(String ecaseId) {
			this.ecaseId = ecaseId;
		}

		public String getDistrictName() {
			return districtName;
		}

		public void setDistrictName(String districtName) {
			this.districtName = districtName;
		}

		public String getDistrictCode() {
			return districtCode;
		}

		public void setDistrictCode(String districtCode) {
			this.districtCode = districtCode;
		}

		public String getTalukaName() {
			return talukaName;
		}

		public void setTalukaName(String talukaName) {
			this.talukaName = talukaName;
		}

		public String getTalukaCode() {
			return talukaCode;
		}

		public void setTalukaCode(String talukaCode) {
			this.talukaCode = talukaCode;
		}

		public String getVillageName() {
			return villageName;
		}

		public void setVillageName(String villageName) {
			this.villageName = villageName;
		}

		public String getVillageCode() {
			return villageCode;
		}

		public void setVillageCode(String villageCode) {
			this.villageCode = villageCode;
		}

		public String getArrestDateTime() {
			return arrestDateTime;
		}

		public void setArrestDateTime(String arrestDateTime) {
			this.arrestDateTime = arrestDateTime;
		}

		public String getPlaceOfArrest() {
			return placeOfArrest;
		}

		public void setPlaceOfArrest(String placeOfArrest) {
			this.placeOfArrest = placeOfArrest;
		}

		public String getArresteeFullName() {
			return arresteeFullName;
		}

		public void setArresteeFullName(String arresteeFullName) {
			this.arresteeFullName = arresteeFullName;
		}

		public String getArresteeFatherHusband() {
			return arresteeFatherHusband;
		}

		public void setArresteeFatherHusband(String arresteeFatherHusband) {
			this.arresteeFatherHusband = arresteeFatherHusband;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getOccupation() {
			return occupation;
		}

		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}

		public String getOffenseDescription() {
			return offenseDescription;
		}

		public void setOffenseDescription(String offenseDescription) {
			this.offenseDescription = offenseDescription;
		}

		public String getLegalSections() {
			return legalSections;
		}

		public void setLegalSections(String legalSections) {
			this.legalSections = legalSections;
		}

		public String getWitnessName() {
			return witnessName;
		}

		public void setWitnessName(String witnessName) {
			this.witnessName = witnessName;
		}

		public String getWitnessAddress() {
			return witnessAddress;
		}

		public void setWitnessAddress(String witnessAddress) {
			this.witnessAddress = witnessAddress;
		}

		public String getWitnessRoleRelationToIncident() {
			return witnessRoleRelationToIncident;
		}

		public void setWitnessRoleRelationToIncident(String witnessRoleRelationToIncident) {
			this.witnessRoleRelationToIncident = witnessRoleRelationToIncident;
		}

		public String getPoliceOfficerName() {
			return policeOfficerName;
		}

		public void setPoliceOfficerName(String policeOfficerName) {
			this.policeOfficerName = policeOfficerName;
		}

		public String getPoliceOfficerRank() {
			return policeOfficerRank;
		}

		public void setPoliceOfficerRank(String policeOfficerRank) {
			this.policeOfficerRank = policeOfficerRank;
		}

		public String getBadgeNo() {
			return badgeNo;
		}

		public void setBadgeNo(String badgeNo) {
			this.badgeNo = badgeNo;
		}

		public String getPoliceStationNo() {
			return policeStationNo;
		}

		public void setPoliceStationNo(String policeStationNo) {
			this.policeStationNo = policeStationNo;
		}

		public String getListOfItems() {
			return listOfItems;
		}

		public void setListOfItems(String listOfItems) {
			this.listOfItems = listOfItems;
		}

		public String getConditionOfItems() {
			return conditionOfItems;
		}

		public void setConditionOfItems(String conditionOfItems) {
			this.conditionOfItems = conditionOfItems;
		}

		public String getMedicalExaminationReport() {
			return medicalExaminationReport;
		}

		public void setMedicalExaminationReport(String medicalExaminationReport) {
			this.medicalExaminationReport = medicalExaminationReport;
		}

		public String getEnjuries() {
			return enjuries;
		}

		public void setEnjuries(String enjuries) {
			this.enjuries = enjuries;
		}

		public String getArresteeMobileNo() {
			return arresteeMobileNo;
		}

		public void setArresteeMobileNo(String arresteeMobileNo) {
			this.arresteeMobileNo = arresteeMobileNo;
		}

		public String getWitnessMobileNo() {
			return witnessMobileNo;
		}

		public void setWitnessMobileNo(String witnessMobileNo) {
			this.witnessMobileNo = witnessMobileNo;
		}

		public String getPoliceSignPath() {
			return policeSignPath;
		}

		public void setPoliceSignPath(String policeSignPath) {
			this.policeSignPath = policeSignPath;
		}

		public String getWitnessSignPath() {
			return witnessSignPath;
		}

		public void setWitnessSignPath(String witnessSignPath) {
			this.witnessSignPath = witnessSignPath;
		}

		public String getArresteeSignPath() {
			return arresteeSignPath;
		}

		public void setArresteeSignPath(String arresteeSignPath) {
			this.arresteeSignPath = arresteeSignPath;
		}

		public String getPoliceSignName() {
			return policeSignName;
		}

		public void setPoliceSignName(String policeSignName) {
			this.policeSignName = policeSignName;
		}

		public String getWitnessSignName() {
			return witnessSignName;
		}

		public void setWitnessSignName(String witnessSignName) {
			this.witnessSignName = witnessSignName;
		}

		public String getArresteeSignName() {
			return arresteeSignName;
		}

		public void setArresteeSignName(String arresteeSignName) {
			this.arresteeSignName = arresteeSignName;
		}

		public String getUserLatitude() {
			return userLatitude;
		}

		public void setUserLatitude(String userLatitude) {
			this.userLatitude = userLatitude;
		}

		public String getUserLongitude() {
			return userLongitude;
		}

		public void setUserLongitude(String userLongitude) {
			this.userLongitude = userLongitude;
		}

		public String getUserAccuracy() {
			return userAccuracy;
		}

		public void setUserAccuracy(String userAccuracy) {
			this.userAccuracy = userAccuracy;
		}

		public String getMappingDate() {
			return mappingDate;
		}

		public void setMappingDate(String mappingDate) {
			this.mappingDate = mappingDate;
		}

		public String getSendingDate() {
			return sendingDate;
		}

		public void setSendingDate(String sendingDate) {
			this.sendingDate = sendingDate;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getAppVersion() {
			return appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}	    

}
