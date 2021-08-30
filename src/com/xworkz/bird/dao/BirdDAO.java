package com.xworkz.bird.dao;

import com.xworkz.bird.dto.BirdEntity;

public interface BirdDAO {

	int save(BirdEntity entity);

	int readBirdEntity(BirdEntity entity);

	BirdEntity readBirdEntitybyId(int pk);

	void updateNameById(int id, String name);

	void delete(int id);

}
