package com.Ecommerce.Nikee.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Nikee.Entity.Registration;
import com.Ecommerce.Nikee.Service.RegistrationService;


@RestController
@RequestMapping("/api")
public class RegistrationController {
	
@Autowired
	private RegistrationService rs;
	
	@PostMapping("post/user")
	public ResponseEntity<?> adduser(@RequestBody Registration r) {
	
Registration savedUser = rs.adduser(r);
        
        // Immediately login after registration
        boolean loginSuccess = rs.loginUser(r.getUserName(), r.getPassword());
        
        if (loginSuccess) {
            return ResponseEntity.ok("User registered and logged in successfully");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed after registration");
        }
		
	}
	
	 @PostMapping("/login")
	    public ResponseEntity<?> loginUser(@RequestBody Map<String, String> loginRequest) {
	        String userName = loginRequest.get("userName");
	        String password = loginRequest.get("password");

	        boolean loginSuccess = rs.loginUser(userName, password);

	        if (loginSuccess) {
	            return ResponseEntity.ok("Login successful");
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	        }
	    }
	@GetMapping("/get/{userName}")
	public ResponseEntity<Registration> getuser(@PathVariable("userName") String userName) {
	//get the user details by using user name
		return ResponseEntity.ok(rs.findById(userName));
		
	}
	@GetMapping("/getall")
	public ResponseEntity<List<Registration>> findAll() {
	
		return ResponseEntity.ok(rs.findAll());
		
	}
	
	
}
