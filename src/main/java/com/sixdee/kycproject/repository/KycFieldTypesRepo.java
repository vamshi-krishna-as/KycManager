package com.sixdee.kycproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sixdee.kycproject.entity.SD_KYC_FIELD_TYPES;

public interface KycFieldTypesRepo extends JpaRepository<SD_KYC_FIELD_TYPES, Integer>
{

}
