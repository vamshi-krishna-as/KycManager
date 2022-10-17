package com.sixdee.kycproject.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "SD_KYC_FIELD_MASTER ")
public class SD_KYC_FIELD_MASTER 
{
	@Id
	@Column(name = "FIELD_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fieldId;
	
	@Column(name = "FIELD_NAME")
	private String fieldName;
	
	@Column(name = "FIELD_TYPE")
	private int fieldType;
	
	@Column(name = "TAG_TYPE")
	private int tagType;
	
	@Column(name = "DROPDOWN")
	private String dropDown;
	
	
	@OneToMany(targetEntity = SD_KYC_FIELD_TYPES.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "iD",referencedColumnName = "FIELD_ID")
	private List<SD_KYC_FIELD_TYPES> types;
	
	@OneToMany(targetEntity = SD_KYC_GROUPS.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "iD",referencedColumnName = "FIELD_ID")
	private List<SD_KYC_GROUPS> groups;

	public int getFieldId() 
	{
		return fieldId;
	}

	public void setFieldId(int fieldId) 
	{
		this.fieldId = fieldId;
	}

	public String getFieldName() 
	{
		return fieldName;
	}

	public void setFieldName(String fieldName)
	{
		this.fieldName = fieldName;
	}

	public int getFieldType() 
	{
		return fieldType;
	}

	public void setFieldType(int fieldType)
	{
		this.fieldType = fieldType;
	}

	public int getTagType()
	{
		return tagType;
	}

	public void setTagType(int tagType) 
	{
		this.tagType = tagType;
	}

	public String getDropDown() 
	{
		return dropDown;
	}
	
	public List<SD_KYC_FIELD_TYPES> getTypes() 
	{
		return types;
	}

	public void setTypes(List<SD_KYC_FIELD_TYPES> types) 
	{
		this.types = types;
	}

	public List<SD_KYC_GROUPS> getGroups() 
	{
		return groups;
	}

	public void setGroups(List<SD_KYC_GROUPS> groups)
	{
		this.groups = groups;
	}

	public void setDropDown(String dropDown) 
	{
		this.dropDown = dropDown;
	}

	public SD_KYC_FIELD_MASTER() 
	{
		super();
	}
	
	public SD_KYC_FIELD_MASTER(int fieldId, String fieldName, int fieldType, int tagType, String dropDown) 
	{
		super();
		this.fieldId = fieldId;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.tagType = tagType;
		this.dropDown = dropDown;
	}

	@Override
	public String toString() 
	{
		return "SD_KYC_FIELD_MASTER [fieldId=" + fieldId + ", fieldName=" + fieldName + ", fieldType=" + fieldType
				+ ", tagType=" + tagType + ", dropDown=" + dropDown + "]";
	}
	
}
