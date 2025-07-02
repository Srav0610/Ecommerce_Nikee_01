package com.Ecommerce.Nikee.Service;

import java.util.List;

import com.Ecommerce.Nikee.Entity.Registration;



public interface RegistrationService {

	 
	public Registration adduser(Registration register);
	public Registration findById(String UserName); 
	List<Registration> findAll();
	//public boolean loginUser(String userName, String password);    
	public boolean loginUser(String userName, String password);
}
