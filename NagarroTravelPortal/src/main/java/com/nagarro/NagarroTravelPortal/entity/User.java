package com.nagarro.NagarroTravelPortal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@DynamicUpdate
public class User implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private String fname;
	
	@NotNull
	private String lname;
	
	@NotNull
	private String bunit;
	
	@NotNull
	private String title;
	
	@NotNull
	@Column(unique = true)
	private String email;
	
	@NotNull
	private String address1;
	
	private String address2;
	
	@NotNull
	private String city;
	
	@NotNull
	private String state;
	
	@NotNull
	private Integer zip;
	
	@NotNull
	private String country;

	@NotNull
//	@ValidPassword
	private String password;
	
	

		public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getBunit() {
		return bunit;
	}

	public void setBunit(String bunit) {
		this.bunit = bunit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

		public User(@NotBlank String fname, @NotBlank String lname, @NotBlank String bunit, @NotBlank String title,
			@NotBlank String email, @NotBlank String address1, String address2, @NotBlank String city,
			@NotBlank String state, @NotBlank Integer zip, @NotBlank String country,@NotBlank String password) 
	{
		this.fname = fname;
		this.lname = lname;
		this.bunit = bunit;
		this.title = title;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip =zip;
		this.country = country;
		this.password=password;
	}	
	
	public void setPassword(String password) {
		this.password = password;
	}

	public User() {}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", bunit=" + bunit + ", title=" + title + ", email="
				+ email + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", country=" + country + "]";
	}
	
	
}

