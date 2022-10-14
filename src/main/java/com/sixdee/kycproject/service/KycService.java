package com.sixdee.kycproject.service;

import java.util.List;

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
	
	public int addKycFieldMaster(SD_KYC_FIELD_MASTER var)
	{
		masterRepo.save(var);
		return 0;
	}
	
	
	public List<SD_KYC_FIELD_MASTER> getKycFiedMaster() 
	{
		return masterRepo.findAll();
	}
	
	public List<SD_KYC_FIELD_TYPES> getKycFiedTypes() 
	{
		return typesRepo.findAll();
	}
	
	public List<SD_KYC_GROUPS> getKycGroup() 
	{
		return groupRepo.findAll();
	}
	
	public void deleteKycFiledMaster(int id) 
	{
		masterRepo.deleteById(id);
	}
	
	public void deleteKycFieldTypes(int iD) 
	{
		typesRepo.deleteById(iD);
	}
	
	public void deleteKycGroups(int iD) 
	{
		groupRepo.deleteById(iD);
	}
}
