package com.Ecommerce.Nikee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.Nikee.Entity.Registration;
import com.Ecommerce.Nikee.OpenFeign.ProductClient;
import com.Ecommerce.Nikee.Repository.RegistrationRepository;


@Service("registrationService")
public class RegistationServiceImpl implements RegistrationService{
	@Autowired
	private RegistrationRepository rr;
	
	  @Autowired
	    private ProductClient productClient;

	@Override
	public Registration adduser(Registration register) {
		
		 Registration savedUser = rr.save(register);
		
	String result=	productClient.initializeCartForUser(savedUser.getUserName());
		return savedUser;
	}

	@Override
	public Registration findById(String UserName) {
		// TODO Auto-generated method stub
		Registration r= rr.findById(UserName).orElseThrow();
	      	return r;
	}

	@Override
	public List<Registration> findAll() {
		// TODO Auto-generated method stub
		//to get all the details
		   return rr.findAll();
	}
	
	  public boolean loginUser(String userName, String password) {
	        Optional<Registration> userOpt = rr.findByUserName(userName);
	        if (userOpt.isPresent()) {
	            return userOpt.get().getPassword().equals(password); // Compare hash in real apps
	        }
	        return false;
	    }

}
