package com.xworkz.bird;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.dto.BirdEntity;

public class BirdsaveTester {

	public static void main(String[] args) {
		BirdEntity dto = new BirdEntity(5, "Parrots", "Birds House", "Rose-ringed", "Lovebirds", "apples", "male", true,
				"peach to teal", " 25mm");
		BirdEntity dto1 = new BirdEntity(3, "Crow", "Crow house", "Indiancrow", "Crow", "Small animals",
				"Female", false, "black", "25mm");

		BirdDAO dao = new BirdDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.readBirdEntity(dto);

	}

}
