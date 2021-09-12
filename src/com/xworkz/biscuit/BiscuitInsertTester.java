package com.xworkz.biscuit;

import com.xworkz.biscuit.entity.BiscuitEntity;
import com.xworkz.biscuit.service.BiscuitService;
import com.xworkz.biscuit.service.BiscuitServiceImpl;

public class BiscuitInsertTester {

	public static void main(String[] args) {

		BiscuitService service = new BiscuitServiceImpl();
		BiscuitEntity entity = new BiscuitEntity("Krack-Jack", "Parle", 1, 10l);
		BiscuitEntity entity1 = new BiscuitEntity("Parle-G", "Parle", 1, 20l);
		BiscuitEntity entity2 = new BiscuitEntity("Monaco", "Parle", 1, 30l);
		BiscuitEntity entity3 = new BiscuitEntity("Hide-Seek", "Parle", 4, 100l);
		BiscuitEntity entity4 = new BiscuitEntity("Oreo", "Parle", 3, 150l);
		BiscuitEntity entity5 = new BiscuitEntity("Milano", "Parle", 5, 200l);
		BiscuitEntity entity6 = new BiscuitEntity("Treat", "Birtania", 6, 250l);
		BiscuitEntity entity7 = new BiscuitEntity();

		service.save(entity1);
		service.save(entity);
		service.save(entity2);
		service.save(entity3);
		service.save(entity4);
		service.save(entity5);
		service.save(entity6);
		service.save(entity7);

	}

}
