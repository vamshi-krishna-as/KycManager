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
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SD_KYC_FIELD_TYPES 
{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Byte iD;
	
	@Column(name = "NAME")
	private String name;
}
