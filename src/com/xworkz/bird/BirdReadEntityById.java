package com.xworkz.bird;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOImpl;
import com.xworkz.bird.dto.BirdEntity;

public class BirdReadEntityById {

	public static void main(String[] args) {

		BirdDAO dao = new BirdDAOImpl();
		BirdEntity dto = dao.readBirdEntitybyId(1);
		System.out.println(dto);
		

		;
	}

}
