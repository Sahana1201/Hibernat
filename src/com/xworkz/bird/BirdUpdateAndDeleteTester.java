package com.xworkz.bird;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;

public class BirdUpdateAndDeleteTester {

	public static void main(String[] args) {

		BirdDAO dao = new BirdDAOImpl();
		dao.updateNameById(2, "Crow");
		dao.delete(2);

	}

}
