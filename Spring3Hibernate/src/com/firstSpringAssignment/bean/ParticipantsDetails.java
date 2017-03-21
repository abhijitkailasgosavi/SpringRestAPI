package com.firstSpringAssignment.bean;

import java.math.BigDecimal;
import java.sql.Date;

public class ParticipantsDetails {

    private long id;
    
	private String first_name;
	
	private String last_name;
	
	private String email_id;
	
	private BigDecimal phone_no;
	
	private Date birth_date;
	
	private String gender;
	
	private long site_id;
	
	private String address;
	
	public ParticipantsDetails(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public BigDecimal getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(BigDecimal phone_no) {
		this.phone_no = phone_no;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSite_id() {
		return site_id;
	}

	public void setSite_id(long site_id) {
		this.site_id = site_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ParticipantsDetails [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email_id=" + email_id + ", phone_no=" + phone_no + ", birth_date=" + birth_date + ", gender="
				+ gender + ", site_id=" + site_id + ", address=" + address + "]";
	}

	
			
}
