package com.xworkz.camera;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDao;
import com.xworkz.camera.dao.CameraDaoImpl;


public class CameraDeleteListTester {

	public static void main(String[] args) {

		CameraDao dao = new CameraDaoImpl();
		List<Integer> pkid = new ArrayList<Integer>();
		pkid.add(2);
		pkid.add(3);
		dao.deleteList(pkid);

	}

}
