package com.jackie.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jackie.hibernate.demo.entity.Student;

import java.util.List;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// start a transaction
			session.beginTransaction();

			
			/*************** Code for query objects with Hibernate ***************/
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display students
			System.out.println("All Students:");
			displayStudents(theStudents);
			
			// query students: lastName = 'Chan'
			theStudents = session.createQuery("from Student s where s.lastName='Chan'").getResultList();
			
			// display the students
			System.out.println("Students who have last name of Chan:");
			displayStudents(theStudents);			
			
			// query students: lastName = 'Chan' OR firstName = 'Kobe'
			theStudents = session.createQuery("from Student s where s.lastName='Chan' "
					+ "OR s.firstName='Kobe'").getResultList();
			
			// display the students
			System.out.println("Students who have last name of Chan OR first name is Kobe:");
			displayStudents(theStudents);	
						
			// query students: where email LIKE '%hotmail.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%hotmail.com'").getResultList();
			
			// display the students
			System.out.println("Students whose email ends with hotmail.com:");
			displayStudents(theStudents);	
			
			// query students: where email LIKE '%gmail.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
						
			// display the students
			System.out.println("Students whose email ends with gmail.com:");
			displayStudents(theStudents);	
			
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}

	private static void displayStudents(List<Student> theStudents) {
		theStudents.stream().forEach(student -> System.out.println(student));
		System.out.println();
	} 
}