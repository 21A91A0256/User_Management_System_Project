package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateMobileNumberByUsingId 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the user id: ");
		int userid = s.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("User_Management_System_By_Using_Hibernate");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		//Selection
		UserInformation userInformation = manager.find(UserInformation.class, userid);
		System.out.println("Before updation: "+userInformation);
		if(userInformation!=null)
		{
			System.out.println("Enter the mobile number: ");
			long mobilenumber = s.nextLong();
			userInformation.setMobilenumber(mobilenumber);
			System.out.println("After updation: "+userInformation);
			manager.merge(userInformation);
			transaction.commit();
		}

	}

}
