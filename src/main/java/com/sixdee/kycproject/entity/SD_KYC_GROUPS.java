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
@Table(name = "SD_KYC_GROUPS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SD_KYC_GROUPS 
{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Byte iD;
	
	@Column(name = "GROUP_NAME")
	private String groupName;
	
	@Column(name = "LABEL")
	private String label;
	
	@Column(name = "GROUP_ORDER")
	private Byte groupOrder;
	
	@Column(name = "PARENT")
	private Byte parent;
}
