package com.xworkz.camera;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDao;
import com.xworkz.camera.dao.CameraDaoImpl;
import com.xworkz.camera.dto.CameraEntity;

public class CameraSaveTester {

	public static void main(String[] args) {

		CameraEntity dto = new CameraEntity("ILCE-7C/BQ IN5", "SONY", "ILCE", "BLACK", 147790, "Prime", "Mirrorlense",
				"Full=Frame", "Time-lapse");

		CameraDao dao = new CameraDaoImpl();
		dao.save(dto);
		

	}

}
