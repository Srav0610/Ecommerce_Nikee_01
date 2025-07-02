package com.Ecommerce.Nikee.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.Nikee.Entity.Registration;


public interface RegistrationRepository extends JpaRepository<Registration, String>{

	Optional<Registration> findByUserName(String username);

}
