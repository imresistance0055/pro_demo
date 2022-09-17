package com.api;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args)

	{

		Configuration configuration = new Configuration(); // create configuration

		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(User.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory(); // create session factory

		Session session = sessionFactory.openSession(); // initialize the session object

		User user = new User();

		user.setId(200);
		user.setName("Amit");
		user.setCity("goa");
		
		
		session.beginTransaction();

		session.save(user);
		session.getTransaction().commit();
		
		
		System.out.println("saved successfully");

	}
}
