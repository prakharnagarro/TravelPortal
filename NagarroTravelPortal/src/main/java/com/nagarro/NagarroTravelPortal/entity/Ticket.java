package com.nagarro.NagarroTravelPortal.entity;

import java.io.Serializable;

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
public class Ticket implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
 	
	@NotNull
	private String type;
	
	@NotNull
	private String tcity;
	
	@NotNull
	private String lcity;
	
	@NotNull
	private String sdate;
	
	@NotNull
	private String edate;
	
	@NotNull
	private String pnumber;
	
	@NotNull
	private String pname;
	
	@NotNull
	private int exborne;
	
	private String approver;
	
	private int duration;
	
	private int upbound;
	
	@NotNull
	private String details;
	
	@NotNull
	private String email;

	@Override
	public String toString() {
		return "Ticket [type=" + type + ", tcity=" + tcity + ", lcity=" + lcity + ", sdate=" + sdate + ", edate="
				+ edate + ", pnumber=" + pnumber + ", pname=" + pname + ", exborne=" + exborne + ", approver="
				+ approver + ", duration=" + duration + ", upbound=" + upbound + ", details=" + details + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTcity() {
		return tcity;
	}

	public void setTcity(String tcity) {
		this.tcity = tcity;
	}

	public String getLcity() {
		return lcity;
	}

	public void setLcity(String lcity) {
		this.lcity = lcity;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getExborne() {
		return exborne;
	}

	public void setExborne(int exborne) {
		this.exborne = exborne;
	}

	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getUpbound() {
		return upbound;
	}

	public void setUpbound(int upbound) {
		this.upbound = upbound;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Long getId() {
		return Id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ticket(@NotBlank String type, @NotBlank String tcity, @NotBlank String lcity, @NotBlank String sdate,
			@NotBlank String edate, @NotBlank String pnumber, @NotBlank String pname, @NotBlank int exborne,
			String approver, int duration, int upbound, @NotBlank String details) {
		super();
		this.type = type;
		this.tcity = tcity;
		this.lcity = lcity;
		this.sdate = sdate;
		this.edate = edate;
		this.pnumber = pnumber;
		this.pname = pname;
		this.exborne = exborne;
		this.approver = approver;
		this.duration = duration;
		this.upbound = upbound;
		this.details = details;
	}
	
	
}