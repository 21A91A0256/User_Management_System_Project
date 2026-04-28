package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeeleteTheUserDetailsByUsingUserId 
{

	public static void main(String[] args) 
	
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the userid: ");
		int id = s.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("User_Management_System_By_Using_Hibernate");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		UserInformation userInformation = manager.find(UserInformation.class,id );
		if(userInformation!=null)
		{
			manager.remove(userInformation);
			transaction.commit();
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("No data found");
		}

	}

}
