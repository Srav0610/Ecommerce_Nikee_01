package com.Ecommerce.Nikee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.Ecommerce.Nikee.Entity.Registration;
import com.Ecommerce.Nikee.Enum.Roles;
import com.Ecommerce.Nikee.Repository.RegistrationRepository;
import com.Ecommerce.Nikee.Service.RegistationServiceImpl;




@SpringBootTest
class EcommerceNikee01RegistrationLoginApplicationTests {

	@Test
	void contextLoads() { }
		@Mock
	    private RegistrationRepository registrationRepository;

	    @InjectMocks
	    private RegistationServiceImpl registrationService;

	    @BeforeEach
	    void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }

	    @Test
	    void registration() {
	        Registration user = new Registration();
	        user.setUserName("Sravanthi@123");
	        user.setFristName("Sravanthi");
	        user.setLastName("Manchikatla");
	        user.setPassword("Srav@0610");
	        user.setGender("Female");
	        user.setAge(24);
	        user.setRoles(Roles.ADMIN);

	        when(registrationRepository.save(any(Registration.class))).thenReturn(user);

	        System.out.println("User before saving: " + user);
	        Registration savedUser = registrationService.adduser(user);
	        System.out.println("Saved User: " + savedUser);

	        assertNotNull(savedUser, "Saved user should not be null");
	        assertEquals("Sravanthi@123", savedUser.getUserName());
	        assertEquals("Sravanthi", savedUser.getFristName());
	        assertEquals("Manchikatla", savedUser.getLastName());
	        assertEquals("Female", savedUser.getGender());
	        assertEquals("Srav@0610", savedUser.getPassword());
	        assertEquals(24, savedUser.getAge());
	        assertEquals(Set.of(Roles.ADMIN), savedUser.getRoles());

	        verify(registrationRepository, times(1)).save(any(Registration.class));
	    
	
}
}

