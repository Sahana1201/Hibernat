package com.xworkz.soap;

import com.xworkz.soap.constant.SoapType;
import com.xworkz.soap.dao.SoapDAO;
import com.xworkz.soap.dao.SoapDAOImpl;
import com.xworkz.soap.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {
		SoapDTO entity = new SoapDTO(1, "Aishwarya rai", "Jasmin", true, true, SoapType.BATHINGSOAP);
		SoapDAO dao = new SoapDAOImpl();
		dao.save(entity);
	}

}
