package com.sixdee.kycproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SD_KYC_FIELD_TYPES")
public class SD_KYC_FIELD_TYPES 
{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Byte iD;
	
	@Column(name = "NAME")
	private String name;

	public Byte getiD() 
	{
		return iD;
	}

	public void setiD(Byte iD)
	{
		this.iD = iD;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public SD_KYC_FIELD_TYPES(Byte iD, String name) 
	{
		super();
		this.iD = iD;
		this.name = name;
	}

	public SD_KYC_FIELD_TYPES()
	{
		super();
	}

	@Override
	public String toString() 
	{
		return "SD_KYC_FIELD_TYPES [iD=" + iD + ", name=" + name + "]";
	}
}
