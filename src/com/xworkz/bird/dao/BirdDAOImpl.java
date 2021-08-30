package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.dto.BirdEntity;
import com.xworkz.bird.util.SFUtil;

public class BirdDAOImpl implements BirdDAO {

	@Override
	public int save(BirdEntity entity) {
		// Configuration configuration = new Configuration();
		// configuration.configure();
		// configuration.addAnnotatedClass(BirdEntity.class);
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		int pk = (int) session.save(entity);
		tx.commit();
		System.out.println(pk);
		session.close();
		// factory.close();
		return pk;
	}

	@Override
	public int readBirdEntity(BirdEntity entity) {
		// Configuration config = new Configuration();
		// config.configure();
		// config.addAnnotatedClass(BirdEntity.class);
		// SessionFactory factory = config.buildSessionFactory();
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		BirdEntity dt = (BirdEntity) session.get(BirdEntity.class, 1);
		System.out.println(dt);
		tr.commit();
		session.close();
		// factory.close();

		return 1;
	}

	@Override
	public BirdEntity readBirdEntitybyId(int pk) {

		// Configuration config = new Configuration();
		// config.configure();
		// config.addAnnotatedClass(BirdEntity.class);
		// SessionFactory factory = config.buildSessionFactory();
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();

		BirdEntity dt = session.get(BirdEntity.class, pk);
		System.out.println(dt);

		session.close();
		// factory.close();

		return dt;
	}

	@Override
	public void updateNameById(int id, String name) {

		// Configuration config = new Configuration();
		// config.configure();
		// config.addAnnotatedClass(BirdEntity.class);
		// SessionFactory sf = config.buildSessionFactory();
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		BirdEntity dto = new BirdEntity();
		dto = (BirdEntity) session.get(BirdEntity.class, id);
		dto.setName(name);
		session.update(dto);
		session.getTransaction().commit();
		System.out.println("updated name : " + name);
		session.close();

	}

	@Override
	public void delete(int id) {

		// Configuration config = new Configuration();
		// config.configure();
		// config.addAnnotatedClass(BirdEntity.class);
		// SessionFactory sf = config.buildSessionFactory();

		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		Object obj = session.load(BirdEntity.class, new Integer(id));
		BirdEntity dt = (BirdEntity) obj;
		Transaction tr = session.beginTransaction();
		session.delete(dt);
		System.out.println("data at " + id + "row as been deleted");
		tr.commit();
		session.close();

	}

}
