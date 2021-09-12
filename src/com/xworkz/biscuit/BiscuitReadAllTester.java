package com.xworkz.biscuit;

import com.xworkz.biscuit.service.BiscuitService;
import com.xworkz.biscuit.service.BiscuitServiceImpl;

public class BiscuitReadAllTester {

	public static void main(String[] args) {

		BiscuitService service = new BiscuitServiceImpl();

		System.out.println("Read All Records");
		service.readAllRecords();

		System.out.println("Read Price by Name");
		System.out.println(service.readPricebyName("Milano"));

		System.out.println("Update Price by Name");
		service.updatepriceByName(800l, "Hide-Seek");

		System.out.println("Total price of all biscuit");
		service.totalPrice();

		System.out.println("Max price of all biscuit");
		service.maxPrice();

		System.out.println("Min price of all biscuit");
		service.minPrice();

	}

}
