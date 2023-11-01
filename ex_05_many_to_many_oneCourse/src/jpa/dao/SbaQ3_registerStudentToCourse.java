package jpa.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycapstone.hibernate.demo.entity.Course;
import com.mycapstone.hibernate.demo.entity.Instructor;
import com.mycapstone.hibernate.demo.entity.InstructorDetail;
import com.mycapstone.hibernate.demo.entity.Review;
import com.mycapstone.hibernate.demo.entity.Student;

public class SbaQ3_registerStudentToCourse {

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
						
			// create a course
			Course javaCourse = new Course("Perscholas -Amex Java FullStack ");
						
			// save the course
			System.out.println("\nSaving the course ...");
			session.save(javaCourse);
			System.out.println("Saved the course: " + javaCourse);
			
			// create one java students
			Student javaFrehiwot = new Student("Frehiwot", "Meron", "fmeron@gmail.com");
			
						
			// add students to the course
			javaCourse.addStudent(javaFrehiwot);
			
			
			// save the students
			System.out.println("\nSaving students ...");
			session.save(javaFrehiwot);
			
			System.out.println("Saved students: " + javaCourse.getStudents());
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}
	}

}





