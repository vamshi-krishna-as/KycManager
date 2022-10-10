package com.sixdee.kycproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void addKycFieldMaster(@RequestBody SD_KYC_FIELD_MASTER var1)
	{
		service.addKycFieldMaster(var1);
	}
	
	@PostMapping("/addKycFieldTypes")
	public void addKycFieldTypes(@RequestBody SD_KYC_FIELD_TYPES var2)
	{
		service.addKycFieldTypes(var2);
	}
	
	@PostMapping("/addKycGroups")
	public void addKycGroups(@RequestBody SD_KYC_GROUPS var3)
	{
		service.addKycGroups(var3);
	}
	
}
