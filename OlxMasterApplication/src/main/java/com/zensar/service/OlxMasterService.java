package com.zensar.service;

import java.util.List;

import com.zensar.entity.AdversiteCategory;
import com.zensar.entity.AdvertiseStatus;

public interface OlxMasterService {
	
	List<AdversiteCategory> getAllAdvertisementCategories();
	
	 List<AdvertiseStatus> getAllAdvertisementStatus();

}