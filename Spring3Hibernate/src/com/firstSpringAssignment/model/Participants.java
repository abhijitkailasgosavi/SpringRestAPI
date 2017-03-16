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
	@Column(name = "id")
	private long id;
	
	@NotNull
	private String first_name;
	
	@NotNull
	private String last_name;
	
	@NotNull
	private String email_id;
	
	@NotNull
	private BigDecimal phone_no;
	
	@NotNull
	private Date birth_date;
	
	@NotNull
	private String gender;
	
	@NotNull
	private BigDecimal site_id;
	
	@NotNull
	private String address;
	
	public Participants(){
		
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
	public BigDecimal getSite_id() {
		return site_id;
	}
	public void setSite_id(BigDecimal site_id) {
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
		return "participants [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email_id="
				+ email_id + ", phone_no=" + phone_no + ", birth_date=" + birth_date + ", gender=" + gender
				+ ", site_id=" + site_id + ", address=" + address + "]";
	}
	
	
}
