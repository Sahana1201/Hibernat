package com.xworkz.camera;

import com.xworkz.camera.dao.CameraDao;
import com.xworkz.camera.dao.CameraDaoImpl;

public class CameraDeleteTester {

	public static void main(String[] args) {

		CameraDao dao = new CameraDaoImpl();
		dao.delete(5);

	}

}
