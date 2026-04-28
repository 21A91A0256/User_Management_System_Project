package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectUserDetailsUsingTheAddress 
{

	public static void main(String[] args) 
	{
		String select = "select user from UserInformation user where address='jntu'";
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("User_Management_System_By_Using_Hibernate");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query =manager.createQuery(select);
		UserInformation information = (UserInformation)query.getSingleResult();
		
		if(information!=null)
		{
			System.out.println(information);
			System.out.println("Data selected");
		}
		else
			System.out.println("No data selected");

	}

}
