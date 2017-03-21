package com.firstSpringAssignment.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="participants")
public class Participants {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private long ID;
	
	@NotNull
	private String FIRST_NAME;
	
	@NotNull
	private String LAST_NAME;
	
	@NotNull
	private String EMAIL_ID;
	
	@NotNull
	private BigDecimal PHONE_NO;
	
	@NotNull
	private Date BIRTH_DATE;
	
	@NotNull
	private String GENDER;
	
	@NotNull
	private long SITE_ID;
	
	@NotNull
	private String ADDRESS;
	
	public Participants(){
		
	}

	public long getID() {
		return ID;
	}

	public void setID(long bigDecimal) {
		ID = bigDecimal;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}

	public String getEMAIL_ID() {
		return EMAIL_ID;
	}

	public void setEMAIL_ID(String eMAIL_ID) {
		EMAIL_ID = eMAIL_ID;
	}

	public BigDecimal getPHONE_NO() {
		return PHONE_NO;
	}

	public void setPHONE_NO(BigDecimal pHONE_NO) {
		PHONE_NO = pHONE_NO;
	}

	public Date getBIRTH_DATE() {
		return BIRTH_DATE;
	}

	public void setBIRTH_DATE(Date bIRTH_DATE) {
		BIRTH_DATE = bIRTH_DATE;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public long getSITE_ID() {
		return SITE_ID;
	}

	public void setSITE_ID(long sITE_ID) {
		SITE_ID = sITE_ID;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	@Override
	public String toString() {
		return "Participants [ID=" + ID + ", FIRST_NAME=" + FIRST_NAME + ", LAST_NAME=" + LAST_NAME + ", EMAIL_ID="
				+ EMAIL_ID + ", PHONE_NO=" + PHONE_NO + ", BIRTH_DATE=" + BIRTH_DATE + ", GENDER=" + GENDER
				+ ", SITE_ID=" + SITE_ID + ", ADDRESS=" + ADDRESS + "]";
	}
		
}
