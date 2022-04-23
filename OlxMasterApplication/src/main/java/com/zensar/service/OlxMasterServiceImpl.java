package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import com.zensar.entity.AdversiteCategory;
import com.zensar.entity.AdvertiseStatus;

public class OlxMasterServiceImpl implements OlxMasterService {

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
	
	
	public List<AdversiteCategory> getAllAdvertisementCategories() {
		return categories;
	}

	@Override
	public List<AdvertiseStatus> getAllAdvertisementStatus() {
		return status;
	}


}
