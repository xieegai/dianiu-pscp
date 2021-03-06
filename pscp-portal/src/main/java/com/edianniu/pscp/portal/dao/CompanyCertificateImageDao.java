package com.edianniu.pscp.portal.dao;

import java.util.List;

import com.edianniu.pscp.portal.entity.CompanyCertificateImageEntity;

/**
 * ${comments}
 * 
 * @author yanlin.chen
 * @email yanlin.chen@edianniu.com
 * @date 2017-05-05 14:50:40
 */
public interface CompanyCertificateImageDao extends BaseDao<CompanyCertificateImageEntity> {
	
	public List<CompanyCertificateImageEntity> getCertificateImagesByCompany(Long companyId);
	
	public CompanyCertificateImageEntity getCertificateImageByFileId(String fileId);
	
}
