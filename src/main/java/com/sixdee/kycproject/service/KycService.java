package com.sixdee.kycproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.kycproject.entity.SD_KYC_FIELD_MASTER;
import com.sixdee.kycproject.entity.SD_KYC_FIELD_TYPES;
import com.sixdee.kycproject.entity.SD_KYC_GROUPS;
import com.sixdee.kycproject.repository.KycFieldMasterRepo;
import com.sixdee.kycproject.repository.KycFieldTypesRepo;
import com.sixdee.kycproject.repository.KycGroupsRepo;

@Service
public class KycService
{
	@Autowired
	private KycFieldMasterRepo masterRepo;
	@Autowired
	private KycFieldTypesRepo typesRepo;
	@Autowired
	private KycGroupsRepo groupRepo;
	
	public void addKycFieldMaster(SD_KYC_FIELD_MASTER var)
	{
		masterRepo.save(var);
	}
	
	public void addKycFieldTypes(SD_KYC_FIELD_TYPES var1) 
	{
		typesRepo.save(var1);
	}
	
	public void addKycGroups(SD_KYC_GROUPS var2) 
	{
		groupRepo.save(var2);
	}
	
}
