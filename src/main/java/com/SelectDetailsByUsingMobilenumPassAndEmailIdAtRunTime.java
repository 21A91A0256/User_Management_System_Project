package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectDetailsByUsingMobilenumPassAndEmailIdAtRunTime 
{
	//writea a hibernate program to display the details of the user by  using mobilenumber,and password and emailid.
	//note all there should be taken at runtime.
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mobilenumber: ");
		long mobilenumber = s.nextLong();
		System.out.println("Enter the password: ");
		String password = s.next();
		System.out.println("Enter the emailid: ");
		String emailid = s.next();
		
		String select = "select user from UserInformation user where user.mobilenumber=?1 and user.password=?2 and user.useremailid=?3";
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("User_Management_System_By_Using_Hibernate");
		EntityManager manager =factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createQuery(select);
		
		
		query.setParameter(1, mobilenumber);
		
		query.setParameter(2,password );
		
		query.setParameter(3, emailid);
		
			try
			{
				UserInformation information = (UserInformation) query.getSingleResult();
				System.out.println(information);
				
				
			}
			catch(NoResultException e)
			{
				System.out.println("No Data Found");
			}
	}

}
