package com.firstSpringAssignment.model;

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
	@Column(name = "IDENTIFIER")
	private Long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@NotNull
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@NotNull
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@NotNull
	@Column(name = "PHONE_NO")
	private String phoneNo;
	
	@NotNull
	@Column(name = "BIRTH_DATE")
	private Date birthDate;
	
	@NotNull
	@Column(name = "GENDER")
	private String gender;
	
	@NotNull
	@Column(name = "SITE_ID")
	private Long siteId;
	
	@NotNull
	@Column(name = "ADDRESS")
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
		return "Participants [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" +
	            emailId + ", phoneNo=" + phoneNo + ", birthDate=" + birthDate + ", gender=" + gender + ", siteId=" +
				siteId + ", address=" + address + "]";
	}
	
		
	
}
