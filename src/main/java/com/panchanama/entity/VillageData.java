package com.panchanama.entity;

import java.math.BigInteger;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "village_data")
@Data
public class VillageData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int dvncode;

    @Column(length = 255)
    private String dvmname;

    @Column(nullable = false)
    private int dtncode;

    @Column(nullable = false)
    private int lgd_dtncode;

    @Column(length = 255)
    private String dtename;

    @Column(length = 255)
    private String dtmname;

    @Column(nullable = false)
    private int thncode;

    @Column(nullable = false)
    private int lgd_thncode;

    @Column(length = 255)
    private String thename;

    @Column(length = 255)
    private String thmname;

    @Column()
    private int cirncode;

    @Column(length = 255)
    private String cirmname;

    @Column(nullable = false)
    private BigInteger ccode;

    @Column(nullable = false)
    private int lgd_code;

    @Column(length = 255)
    private String villmname;

    @Column(length = 255)
    private String villname;

	public int getDvncode() {
		return dvncode;
	}

	public void setDvncode(int dvncode) {
		this.dvncode = dvncode;
	}

	public String getDvmname() {
		return dvmname;
	}

	public void setDvmname(String dvmname) {
		this.dvmname = dvmname;
	}

	public int getDtncode() {
		return dtncode;
	}

	public void setDtncode(int dtncode) {
		this.dtncode = dtncode;
	}

	public int getLgd_dtncode() {
		return lgd_dtncode;
	}

	public void setLgd_dtncode(int lgd_dtncode) {
		this.lgd_dtncode = lgd_dtncode;
	}

	public String getDtename() {
		return dtename;
	}

	public void setDtename(String dtename) {
		this.dtename = dtename;
	}

	public String getDtmname() {
		return dtmname;
	}

	public void setDtmname(String dtmname) {
		this.dtmname = dtmname;
	}

	public int getThncode() {
		return thncode;
	}

	public void setThncode(int thncode) {
		this.thncode = thncode;
	}

	public int getLgd_thncode() {
		return lgd_thncode;
	}

	public void setLgd_thncode(int lgd_thncode) {
		this.lgd_thncode = lgd_thncode;
	}

	public String getThename() {
		return thename;
	}

	public void setThename(String thename) {
		this.thename = thename;
	}

	public String getThmname() {
		return thmname;
	}

	public void setThmname(String thmname) {
		this.thmname = thmname;
	}

	public long getCirncode() {
		return cirncode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getCcode() {
		return ccode;
	}

	public void setCcode(BigInteger ccode) {
		this.ccode = ccode;
	}

	public void setCirncode(int cirncode) {
		this.cirncode = cirncode;
	}

	public String getCirmname() {
		return cirmname;
	}

	public void setCirmname(String cirmname) {
		this.cirmname = cirmname;
	}

	public int getLgd_code() {
		return lgd_code;
	}

	public void setLgd_code(int lgd_code) {
		this.lgd_code = lgd_code;
	}

	public String getVillmname() {
		return villmname;
	}

	public void setVillmname(String villmname) {
		this.villmname = villmname;
	}

	public String getVillname() {
		return villname;
	}

	public void setVillname(String villname) {
		this.villname = villname;
	}

	@Override
	public String toString() {
		return "VillageData [id=" + id + ", dvncode=" + dvncode + ", dvmname=" + dvmname + ", dtncode=" + dtncode
				+ ", lgd_dtncode=" + lgd_dtncode + ", dtename=" + dtename + ", dtmname=" + dtmname + ", thncode="
				+ thncode + ", lgd_thncode=" + lgd_thncode + ", thename=" + thename + ", thmname=" + thmname
				+ ", cirncode=" + cirncode + ", cirmname=" + cirmname + ", ccode=" + ccode + ", lgd_code=" + lgd_code
				+ ", villmname=" + villmname + ", villname=" + villname + "]";
	}
	
	
    
}
