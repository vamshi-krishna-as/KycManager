package com.sixdee.kycproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sixdee.kycproject.entity.SD_KYC_FIELD_MASTER;

public interface KycFieldMasterRepo extends JpaRepository<SD_KYC_FIELD_MASTER, Integer>
{
	
}
