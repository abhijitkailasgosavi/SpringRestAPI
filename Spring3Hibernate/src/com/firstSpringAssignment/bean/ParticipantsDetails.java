package com.firstSpringAssignment.bean;

import java.math.BigDecimal;
import java.sql.Date;

public class ParticipantsDetails {

    private long ID;
	private String FIRST_NAME;
	private String LAST_NAME;
	private String EMAIL_ID;
	private BigDecimal PHONE_NO;
	private Date BIRTH_DATE;
	private String GENDER;
	private long SITE_ID;
	private String ADDRESS;
	
	public ParticipantsDetails(){
		
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
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
		return "ParticipantsDetails [ID=" + ID + ", FIRST_NAME=" + FIRST_NAME + ", LAST_NAME=" + LAST_NAME
				+ ", EMAIL_ID=" + EMAIL_ID + ", PHONE_NO=" + PHONE_NO + ", BIRTH_DATE=" + BIRTH_DATE + ", GENDER="
				+ GENDER + ", SITE_ID=" + SITE_ID + ", ADDRESS=" + ADDRESS + "]";
	}
		
}
