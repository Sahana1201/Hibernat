package com.xworkz.biscuit.dao;

import java.util.List;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.biscuit.entity.BiscuitEntity;
import com.xworkz.biscuit.util.SFUtil;

public class BiscuitDaoImpl implements BiscuitDao {

	private static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	private SessionFactory factory1 = SFUtil.getFactory();

	@Override
	public int save(BiscuitEntity entity) {
		int value = 0;
		try (Session session = factory1.openSession()) {
			Transaction trans = session.beginTransaction();
			value = (int) session.save(entity);
			session.flush();
			session.clear();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return value;
	}

	@Override
	public void readAllRecords() {

		Session session = null;
		try {
			session = factory.openSession();
			Query query = session.createQuery("from BiscuitEntity");
			List list = query.list();
			System.out.println(list);

		} catch (HibernateException e) {

		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed closed");
			}
		}
	}

	@Override
	public long readPricebyName(String name) {
		Session session = null;
		try {
			session = factory.openSession();
			Query query = session.createQuery("Select price from BiscuitEntity where name=:Name");
			query.setParameter("Name", name);
			Object obj = query.uniqueResult();
			if (obj != null) {
				Long price = (long) obj;
				return price;
			}

		} catch (HibernateException e) {
			System.out.println(e.getMessage());

		} finally {
			if (Objects.nonNull(session)) {
				session.close();

				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return 0;
	}

	@Override
	public void updatepriceByName(long price,String name) {

		Session session = null;
		try {
			session = factory.openSession();
			Query query = session.createQuery(
					"update  BiscuitEntity Biscuit_Table set Biscuit_Table.price=:Price where Biscuit_Table.name= :Name");
			query.setParameter("Price", price);
			query.setParameter("Name", name);
			session.beginTransaction();

			query.executeUpdate();
			System.out.println("Updated Sucessfully");
			session.getTransaction().commit();

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed closed");
			}
		}

	}

	@Override
	public long totalPrice() {

		Session session = null;
		try {
			session = factory.openSession();

			session.beginTransaction();

			Query query = session.createQuery("Select SUM(Biscuit_Table.price) from BiscuitEntity Biscuit_Table");
			Object object = query.uniqueResult();

			if (object != null) {

				Long price = (Long) object;
				System.out.println("Total price in Biscuit_Table---->" + price);
				return price;

			}

		} catch (HibernateException e) {
			e.printStackTrace();

		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed closed");
			}
		}
		return 0;
	}

	@Override
	public long maxPrice() {

		Session session = null;
		try {
			session = factory.openSession();

			session.beginTransaction();

			Query query = session.createQuery("Select MAX(Biscuit_Table.price) from BiscuitEntity Biscuit_Table");
			Object object = query.uniqueResult();

			if (object != null) {

				Long price = (Long) object;
				System.out.println("Max price in Biscuit_Table---->" + price);
				return price;

			}

		} catch (HibernateException e) {
			e.printStackTrace();

		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed closed");
			}
		}
		return 0;

	}

	@Override
	public long minPrice() {

		Session session = null;
		try {
			session = factory.openSession();

			session.beginTransaction();

			Query query = session.createQuery("Select MIN(Biscuit_Table.price) from BiscuitEntity Biscuit_Table");
			Object object = query.uniqueResult();

			if (object != null) {

				Long price = (Long) object;
				System.out.println("Min price in Biscuit_Table---->" + price);
				return price;

			}

		} catch (HibernateException e) {
			e.printStackTrace();

		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed closed");
			}
		}
		return 0;

	}

}
