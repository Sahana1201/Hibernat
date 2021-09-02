package com.xworkz.camera.dao;

import java.util.List;

import com.xworkz.camera.dto.CameraEntity;

public interface CameraDao {

	int save(CameraEntity entity);

	

	CameraEntity readCameraEntitybyId(int pk);

	void updateNameById(int id, String name);

	void delete(int id);

	void saveList(List<CameraEntity> entity);
	void deleteList(List<Integer> ids);

}
