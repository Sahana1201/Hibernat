package com.xworkz.biscuit.service;

import com.xworkz.biscuit.dao.BiscuitDao;
import com.xworkz.biscuit.dao.BiscuitDaoImpl;
import com.xworkz.biscuit.entity.BiscuitEntity;

public class BiscuitServiceImpl implements BiscuitService {

	BiscuitDao dao = new BiscuitDaoImpl();

	@Override
	public int save(BiscuitEntity entity) {
		boolean namevalid = false;
		boolean brandvalid = false;
		if (entity != null) {
			String name = entity.getName();
			if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 30) {
				System.out.println("Name is valid");
				namevalid = true;
			} else {
				System.out.println("Name is not valid");
				namevalid = false;
			}
			String brand = entity.getBrand();
			if (brand != null && !brand.isEmpty() && brand.length() >= 5 && brand.length() <= 30) {
				System.out.println("Brand is valid");
				brandvalid = true;
			} else {
				System.out.println("Brand is invalid");
				brandvalid = false;
			}

			if (namevalid && brandvalid) {
				System.out.println("Data is valid");
				dao.save(entity);
				return 1;
			}
			return 0;
		}
		System.out.println("entity is null cant validate");
		return 0;
	}

	@Override
	public void readAllRecords() {
		dao.readAllRecords();
	}

	@Override
	public boolean readPricebyName(String name) {
		boolean valid = false;
		if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 30) {
			System.out.println("Name is valid");
			valid = true;
			long price = this.dao.readPricebyName(name);
			System.out.println(price);
			return valid;
		}

		return valid;
	}

	@Override
	public boolean updatepriceByName(long price, String name) {

		boolean valid = false;
		if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 30) {
			valid = true;
			this.dao.updatepriceByName(price, name);
			System.out.println(price);
			return valid;

		}
		return valid;
	}

	@Override
	public long totalPrice() {

		return dao.totalPrice();
	}

	@Override
	public long maxPrice() {

		return dao.maxPrice();
	}

	@Override
	public long minPrice() {

		return dao.minPrice();
	}

}
