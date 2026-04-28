package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectDetailsByUsingMobileNumber 
{

	public static void main(String[] args) 
	{
		String select = "select user from UserInformation user where mobilenumber=7658098765";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("User_Management_System_By_Using_Hibernate");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createQuery(select);
		try 
		{
			UserInformation information = (UserInformation)query.getSingleResult();
			if(information!=null)
			{
				System.out.println("Data Selected");
				System.out.println(information);
			}
			else
				System.out.println("No data selected");
		}
		catch(NoResultException e)
		{
			System.out.println("Handled");
		}
		
		
		
	}

}
