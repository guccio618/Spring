package com.jackie.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jackie.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// create 3 student objects
			System.out.println("Creating 3 student objects...");
			Student theStudent1 = new Student("Jackie", "Chan", "jackiechan@hotmail.com");
			Student theStudent2 = new Student("Kobe", "Bryant", "kobebryant@hotmail.com");
			Student theStudent3 = new Student("Kevin", "Garnett", "kevingarnett@hotmail.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("Saving 3 students");
			session.save(theStudent1);
			session.save(theStudent2);
			session.save(theStudent3);

			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
