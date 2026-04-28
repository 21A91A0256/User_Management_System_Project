package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SelectTheDetailsOfUserByUsingPK 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the userid: ");
		int userid = s.nextInt();
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("User_Management_System_By_Using_Hibernate");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserInformation userInformation = manager.find(UserInformation.class, userid);
		if(userInformation!=null)
		{
			UserInformation output =manager.merge(userInformation);
			System.out.println(output);
		}
		else
			System.out.println("No data Found");

	}

}
