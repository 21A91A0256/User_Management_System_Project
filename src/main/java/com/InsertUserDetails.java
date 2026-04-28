package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertUserDetails 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter User Id: ");
		int userid = s.nextInt();
		System.out.println("Enter the name: ");
		String username = s.next();
		System.out.println("Enter the emailid: ");
		String emailid = s.next();
		System.out.println("Enter the Password: ");
		String password = s.next();
		System.out.println("Enter the Mobile Number: ");
		long mobilenumber = s.nextLong();
		System.out.println("Enter the Gender: ");
		String gender = s.next();
		System.out.println("Enter the Address: ");
		String address = s.next();
	
		
		UserInformation userInformation = new UserInformation(userid,username,emailid,password,mobilenumber,gender,address);
		//1)Load the persistence.xml file
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("User_Management_System_By_Using_Hibernate");
		//2)Establish the connection
		//3)Create the platform
		EntityManager em = emf.createEntityManager();
		//4)Begin the Transaction
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		//5)Perform the Operations
		em.persist(userInformation);
		//6)Commit the Transaction
		transaction.commit();
		//7)Close the Connection
	}
}
