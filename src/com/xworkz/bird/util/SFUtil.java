package com.xworkz.bird.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SFUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		if (factory != null && factory.isClosed()) {
			throw new IllegalStateException("SOME ONE CLOSED SF,PLEASE CORRECT THE CODE");
		}
		return factory;
	}

	static {
		try {
			System.out.println("SF INIT STARTED");
			Configuration configuration = new Configuration().configure();
			factory = configuration.buildSessionFactory();
			System.out.println("SF INIT COMPLETED");

		} catch (HibernateException e) {
			System.out.println("SF ERROR IN STATIC BLOCK");
			e.printStackTrace();
		}

	}

}
