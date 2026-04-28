package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteTheUserDetailsUsingPassword
{

	public static void main(String[] args)
	{
		String s = "delete from UserInformation user where user.password=1234";
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("User_Management_System_By_Using_Hibernate");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Query query =manager.createQuery(s);
		
		int result = query.executeUpdate();
		if(result!=0)
			System.out.println("User details deleted");
		else
			System.out.println("No data deleted");
		transaction.commit();
	}

}
