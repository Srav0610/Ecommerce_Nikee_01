//package com.Ecommerce.Nikee.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.Ecommerce.Nikee.Entity.Registration;
//import com.Ecommerce.Nikee.Repository.RegistrationRepository;
//
//
//@Service
//public class CustomerUserDetailsService implements UserDetailsService{
//
//	@Autowired
//	private RegistrationRepository rs;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
////		Registration register=rs.findByUserName(username)
////				.orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
////		
////		return org.springframework.security.core.userdetails.User
////				.builder()
////	            .username(register.getUserName())
////	            .password(register.getPassword())
////	            .roles(register.getRoles().stream().map(Enum::name).toArray(String[]::new))
////	            .build();
//}
//
//}
