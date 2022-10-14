package com.sixdee.kycproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sixdee.kycproject.entity.SD_KYC_GROUPS;

public interface KycGroupsRepo extends JpaRepository<SD_KYC_GROUPS, Integer>
{

}
