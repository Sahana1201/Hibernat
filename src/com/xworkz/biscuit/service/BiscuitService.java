package com.xworkz.biscuit.service;

import com.xworkz.biscuit.entity.BiscuitEntity;

public interface BiscuitService {
	int save(BiscuitEntity entity);
	void readAllRecords();

	
	boolean readPricebyName(String name);

	boolean updatepriceByName(long price,String name);

	long totalPrice();

	long maxPrice();

	long minPrice();


}
