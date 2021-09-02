package com.xworkz.camera;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDao;
import com.xworkz.camera.dao.CameraDaoImpl;
import com.xworkz.camera.dto.CameraEntity;

public class CamerasaveListTester {

	public static void main(String[] args) {

		CameraEntity dto = new CameraEntity("ILCE-7C/BQ IN5", "SONY", "ILCE", "BLACK", 147790, "Prime", "Mirrorlense",
				"Full=Frame", "Time-lapse");
		CameraEntity dto1 = new CameraEntity("ILCE-6C/BQ IN5", "canon", "ILCE", "BLACK", 167790, "Prime", "Mirrorlense",
				"Full=Frame", "Time-lapse");

		CameraDao dao = new CameraDaoImpl();
		List<CameraEntity> list = new ArrayList<CameraEntity>();
		list.add(dto1);
		list.add(dto);

		dao.saveList(list);

	}

}
