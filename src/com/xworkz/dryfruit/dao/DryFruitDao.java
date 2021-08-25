package com.xworkz.dryfruit.dao;

import com.xworkz.dryfruit.dto.DryFruitDTO;

public interface DryFruitDao {

	int save(DryFruitDTO entity);

	int readDryFruit(DryFruitDTO entity);

	int updateDryFryit(DryFruitDTO entity);

	int deleteDryFruit(DryFruitDTO entity);

}
