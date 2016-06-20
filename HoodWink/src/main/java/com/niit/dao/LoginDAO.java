package com.niit.dao;


	import org.springframework.stereotype.Repository;

	@Repository
	public class LoginDAO {
		
	
		public boolean isValidUser(String username, String password)
		{
			if(username.equals("janani")  && password.equals("niit")	)
			{
				return true;
			}
			else
			{
				return false;
			}
		}



	}



