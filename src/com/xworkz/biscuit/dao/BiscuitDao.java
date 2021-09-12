package com.xworkz.biscuit.dao;

import com.xworkz.biscuit.entity.BiscuitEntity;

public interface BiscuitDao {
	
	int save(BiscuitEntity entity);
	void readAllRecords();

	
	long readPricebyName(String name);

	void updatepriceByName(long price,String name);

	long totalPrice();

	long maxPrice();

	long minPrice();

}
