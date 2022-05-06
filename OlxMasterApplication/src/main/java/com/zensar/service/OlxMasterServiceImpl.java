package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entity.AdversiteCategory;
import com.zensar.entity.AdvertiseStatus;
import com.zensar.repository.CategoryRepository;
import com.zensar.repository.StatusRepository;
@Service
public class OlxMasterServiceImpl implements OlxMasterService {
	
	@Autowired
    private CategoryRepository categoryRepository;
	@Autowired
	private StatusRepository statusRepository;

	static List<AdversiteCategory> categories= new ArrayList<AdversiteCategory>();
	static List<AdvertiseStatus> status=new ArrayList<AdvertiseStatus>();
	
	static {
		categories.add(new AdversiteCategory(1L, "Furniture"));
		categories.add(new AdversiteCategory(2L, "Cars"));
		categories.add(new AdversiteCategory(3L, "Mobiles"));
		categories.add(new AdversiteCategory(4L, "Real Estate"));
		categories.add(new AdversiteCategory(5L, "Sports"));
	}
	
	static {
		status.add(new AdvertiseStatus(1L, "OPEN"));
		status.add(new AdvertiseStatus(2L, "CLOSED"));
	} 
	
	
	@Override
	public List<AdversiteCategory> getAllAdvertisementCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public List<AdvertiseStatus> getAllAdvertisementStatus() {
		return statusRepository.findAll();
	}

}