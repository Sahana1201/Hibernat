package com.xworkz.camera;

import com.xworkz.camera.dao.CameraDao;
import com.xworkz.camera.dao.CameraDaoImpl;

public class CameraUpdateTester {

	public static void main(String[] args) {
		CameraDao dao = new CameraDaoImpl();
		dao.updateNameById(2, "Mirrorless Camera");

	}

}
