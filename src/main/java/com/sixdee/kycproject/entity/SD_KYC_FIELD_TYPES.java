package com.sixdee.kycproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "SD_KYC_FIELD_TYPES")

public class SD_KYC_FIELD_TYPES 
{
	@Id
	@Column(name = "ID")
	private int iD;
	
	@Column(name = "NAME")
	private String name;

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SD_KYC_FIELD_TYPES(int iD, String name) {
		super();
		this.iD = iD;
		this.name = name;
	}

	public SD_KYC_FIELD_TYPES() {
		super();
	}

	@Override
	public String toString() {
		return "SD_KYC_FIELD_TYPES [iD=" + iD + ", name=" + name + "]";
	}
}
