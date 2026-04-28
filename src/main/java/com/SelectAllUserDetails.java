package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectAllUserDetails 
{

	public static void main(String[] args) 
	{
		String select = "select user from UserInformation user";
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("User_Management_System_By_Using_Hibernate");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Query query = manager.createQuery(select);
		List<UserInformation> resultList = query.getResultList();
		
		for(UserInformation information: resultList)
		{
			System.out.println("User Id: "+information.getUserid());
			System.out.println("User Name: "+information.getUsername());
			System.out.println("User EmailId: "+information.getUseremailid());
			System.out.println("User Password: "+information.getPassword());
			System.out.println("User MobileNumber: "+information.getMobilenumber());
			System.out.println("User Gender: "+information.getGender());
			System.out.println("User Address: "+information.getAddress());
			System.out.println("===========================================");
					
		}
	}
}	
		