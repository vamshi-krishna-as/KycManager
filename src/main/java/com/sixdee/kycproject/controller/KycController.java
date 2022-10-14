package com.sixdee.kycproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.kycproject.entity.SD_KYC_FIELD_MASTER;
import com.sixdee.kycproject.entity.SD_KYC_FIELD_TYPES;
import com.sixdee.kycproject.entity.SD_KYC_GROUPS;
import com.sixdee.kycproject.service.KycService;

@RestController
public class KycController
{
	@Autowired
	private KycService service;
	
	@PostMapping("/addKycFieldMaster")
	public int addKycFieldMaster(@RequestBody SD_KYC_FIELD_MASTER var1)
	{
		service.addKycFieldMaster(var1);
		return 0;
	}
	
	@GetMapping("/getKycFiedMaster")
	public List<SD_KYC_FIELD_MASTER> getKycFiedMaster() 
	{
		return service.getKycFiedMaster();
	}
	
	@GetMapping("/getKycFiedTypes")
	public List<SD_KYC_FIELD_TYPES> getKycFiedTypes() 
	{
		return service.getKycFiedTypes();
	}
	
	@GetMapping("/getKycGroup")
	public List<SD_KYC_GROUPS> getKycGroup() 
	{
		return service.getKycGroup();
	}
	
	@DeleteMapping("/deleteKycFieldMaster/{fieldId}")
	public void deleteKycFieldMaster(@PathVariable("fieldId") int fieldId) 
	{
		service.deleteKycFiledMaster(fieldId);
	}
	
	@DeleteMapping("/deleteKycFieldTypes/{iD}")
	public void deleteKycFieldTypes(@PathVariable("iD") int iD) 
	{
		service.deleteKycFieldTypes(iD);
	}
	
	@DeleteMapping("/deleteKycFieldMaster/{iD}")
	public void deleteKycGroups(@PathVariable("iD") int iD) 
	{
		service.deleteKycGroups(iD);
	}	
}
