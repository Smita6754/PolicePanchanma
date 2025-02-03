package com.panchanama.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "incident_records")
public class IncidentRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "father_or_husband_name")
	private String fatherOrHusbandName;

	private Integer age;

	private String gender;

	private String address;

	private String occupation;

	private String district;

	private String taluka;

	private String village;

	@Column(name = "arrest_date_time")
	private LocalDateTime arrestDateTime;

	@Column(name = "place_of_arrest")
	private String placeOfArrest;

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

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFatherOrHusbandName() {
		return fatherOrHusbandName;
	}

	public void setFatherOrHusbandName(String fatherOrHusbandName) {
		this.fatherOrHusbandName = fatherOrHusbandName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public LocalDateTime getArrestDateTime() {
		return arrestDateTime;
	}

	public void setArrestDateTime(LocalDateTime arrestDateTime) {
		this.arrestDateTime = arrestDateTime;
	}

	public String getPlaceOfArrest() {
		return placeOfArrest;
	}

	public void setPlaceOfArrest(String placeOfArrest) {
		this.placeOfArrest = placeOfArrest;
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
}
