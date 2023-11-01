package com.mycapstone.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycapstone.hibernate.demo.entity.Course;
import com.mycapstone.hibernate.demo.entity.Instructor;
import com.mycapstone.hibernate.demo.entity.InstructorDetail;
import com.mycapstone.hibernate.demo.entity.Review;
import com.mycapstone.hibernate.demo.entity.Student;

public class SbaQ1_GetAllStudents1 {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
						session.beginTransaction();
						
						// query students
						List<Student> theStudent = session.createQuery("from Student").getResultList();
						
						// display the students
						displayStudents(theStudent);
						
						// commit transaction
						session.getTransaction().commit();
						
						System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudent) 
	{
		for (Student tempStudent : theStudent) 
		{
			System.out.println(tempStudent);
		}
	}
	}







