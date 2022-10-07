package com.sixdee.kycproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SD_KYC_GROUPS")
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

	public Byte getiD()
	{
		return iD;
	}

	public void setiD(Byte iD) 
	{
		this.iD = iD;
	}

	public String getGroupName()
	{
		return groupName;
	}

	public void setGroupName(String groupName)
	{
		this.groupName = groupName;
	}

	public String getLabel() 
	{
		return label;
	}

	public void setLabel(String label) 
	{
		this.label = label;
	}

	public Byte getGroupOrder()
	{
		return groupOrder;
	}

	public void setGroupOrder(Byte groupOrder)
	{
		this.groupOrder = groupOrder;
	}

	public Byte getParent() 
	{
		return parent;
	}

	public void setParent(Byte parent)
	{
		this.parent = parent;
	}

	public SD_KYC_GROUPS(Byte iD, String groupName, String label, Byte groupOrder, Byte parent) 
	{
		super();
		this.iD = iD;
		this.groupName = groupName;
		this.label = label;
		this.groupOrder = groupOrder;
		this.parent = parent;
	}

	public SD_KYC_GROUPS() 
	{
		super();
	}

	@Override
	public String toString()
	{
		return "SD_KYC_GROUPS [iD=" + iD + ", groupName=" + groupName + ", label=" + label + ", groupOrder="
				+ groupOrder + ", parent=" + parent + "]";
	}
}
