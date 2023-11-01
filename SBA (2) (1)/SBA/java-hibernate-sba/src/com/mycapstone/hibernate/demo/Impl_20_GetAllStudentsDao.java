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

public class Impl_20_GetAllStudentsDao 
{

	public static void main(String[] args) 
	{

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		
		
int myOption =4;
	switch (myOption) 
		{
		  case 1:
			  System.out.println("Displaying Students List");
					  try {
					// Create All Students session
					Session session = factory.getCurrentSession();
		
					
					// start a transaction
					session.beginTransaction();
					
					List<Student> listOfStudent= SbaQ1_GetAllStudents2_dao.getStudents();
					// get the student from database
						
					// display the students
					displayStudents(listOfStudent);
								
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("First Session Executed!listOfStudent!");
					
					
					// add clean up code
					//session.close();
					}
					finally 
					{
						//factory.close();
					}
			 break;
			 
		    case 2:
			  System.out.println("Displaying All Coure Directory");
					  try {
					// Create All Students session
					Session session = factory.getCurrentSession();
		
					
					// start a transaction
					session.beginTransaction();
					
					List<Course> theCourse= SbaQ1_GetAllStudents2_dao.getCourse();
					// get the student from database
						
					// display the students
					displayCourse(theCourse);
								
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("First Session Executed!!");
					
					
					// add clean up code
					//session.close();
					}
					finally 
					{
						//factory.close();
					}
			 break;
			 
		    case 3:
				  System.out.println("Add Student to the course");
						  try {
						// Create All Students to be added to the course session
						Session session = factory.getCurrentSession();
			
						
						// start a transaction
						session.beginTransaction();
						
					//	List<Student> listOfStudent= SbaQ1_GetAllStudents2_dao.getStudents();
						SbaQ1_GetAllStudents2_dao obj = new SbaQ1_GetAllStudents2_dao();
						obj.addStudentToACourse();
						             
										
						
									
						// commit transaction
						session.getTransaction().commit();
						
						System.out.println("First Session Executed!listOfStudent!");
						
						
						// add clean up code
						//session.close();
						}
						finally 
						{
							//factory.close();
						}
				 break; 
			 
		    case 4:
				  System.out.println("Adding courses");
						  try {
						// Create courses session
						Session session = factory.getCurrentSession();
			
						
						// start a transaction
						session.beginTransaction();
						
					
						SbaQ1_GetAllStudents2_dao obj2 = new SbaQ1_GetAllStudents2_dao();
						obj2.AddCourse();
						             
										
						
									
						// commit transaction
						session.getTransaction().commit();
						
						System.out.println("First Session Executed!AddCourses!");
						
						
						// add clean up code
						//session.close();
						}
						finally 
						{
							//factory.close();
						}
				 break; 
			 
			 
		    
		}
	System.out.println("First Session Not Executed!");
}
	
	
	

	private static void displayStudents(List<Student> theStudent) 
	{
		for (Student tempStudent : theStudent) 
		{
			System.out.println(tempStudent);
		}
	}
	private static void displayCourse(List<Course> theCourse) 
	{
		for (Course tempCourse : theCourse) 
		{
			System.out.println(tempCourse);
		}
	}
}





