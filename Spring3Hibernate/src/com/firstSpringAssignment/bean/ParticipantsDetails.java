package com.firstSpringAssignment.bean;

import java.sql.Date;

public class ParticipantsDetails {

	private Long id;
    
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String phoneNo;
	
	private Date birthDate;
	
	private String gender;
	
	private Long siteId;
	
	private String address;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getSiteId() {
		return siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ParticipantsDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +
			   ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", birthDate=" + birthDate + ", " +
			   "gender=" + gender + ", siteId=" + siteId + ", address=" + address + "]";
	}

	
			
}
