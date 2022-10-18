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

public class SD_KYC_GROUPS {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iD;

	@Column(name = "GROUP_NAME")
	private String groupName;

	@Column(name = "LABEL")
	private String label;

	@Column(name = "GROUP_ORDER")
	private int groupOrder;

	@Column(name = "PARENT")
	private int parent;

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getGroupOrder() {
		return groupOrder;
	}

	public void setGroupOrder(int groupOrder) {
		this.groupOrder = groupOrder;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public SD_KYC_GROUPS() {
		super();
	}

	public SD_KYC_GROUPS(int iD, String groupName, String label, int groupOrder, int parent) {
		super();
		this.iD = iD;
		this.groupName = groupName;
		this.label = label;
		this.groupOrder = groupOrder;
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "SD_KYC_GROUPS [iD=" + iD + ", groupName=" + groupName + ", label=" + label + ", groupOrder="
				+ groupOrder + ", parent=" + parent + "]";
	}

}
