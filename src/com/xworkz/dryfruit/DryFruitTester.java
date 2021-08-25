package com.xworkz.dryfruit;

import com.xworkz.dryfruit.dao.DryFruitDao;
import com.xworkz.dryfruit.dao.DryFruitDaoImpl;
import com.xworkz.dryfruit.dto.DryFruitDTO;

public class DryFruitTester {

	public static void main(String[] args) {
		DryFruitDTO dto = new DryFruitDTO(7, "Cashew", "Tulsi", "Brazil", 788, "TulsiDryFruits");
		DryFruitDTO dto1 = new DryFruitDTO(8, "Almond", "Tulsi", "Kashmiri", 900, "TulsiDryFruits");
		DryFruitDao dao = new DryFruitDaoImpl();
		
		dao.save(dto);
		dao.save(dto1);
		dao.readDryFruit(dto);
		dao.updateDryFryit(dto);

	}

}
