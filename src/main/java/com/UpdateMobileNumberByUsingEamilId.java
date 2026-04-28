package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateMobileNumberByUsingEamilId 
{

	public static void main(String[] args) 
	{
		String update = "update UserInformation user set user.mobilenumber=9908765674 where user.useremailid='surya@gmail.com'";
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("User_Management_System_By_Using_Hibernate");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Query query =manager.createQuery(update);
		System.out.println(query);
		int result = query.executeUpdate();
		if(result!=0)
			System.out.println("Mobile number updated");
		else
			System.out.println("No data updated");
		transaction.commit();
	}

}
