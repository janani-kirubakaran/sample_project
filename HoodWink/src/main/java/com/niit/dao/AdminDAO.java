package com.niit.dao;


	import org.springframework.stereotype.Repository;

	@Repository
	public class AdminDAO {
		
	
		public boolean isValidAdmin(String adminname, String password)
		{
			if(adminname.equals("jan")  && password.equals("niit")	)
			{
				return true;
			}
			else
			{
				return false;
			}
		}



	}



