package com.Ecommerce.Nikee.Entity;

import java.util.Set;

import com.Ecommerce.Nikee.Enum.Roles;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;

@Entity
public class Registration {

	@Id    
	private String userName;
	private String password;
	private String fristName;
	private String lastName;
	private String gender;
	private Integer age;
	    @Enumerated(EnumType.STRING)
	    private Roles roles;
	 
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		 this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	public Registration(String userName, String password, String fristName, String lastName, String gender, Integer age,
			Roles roles) {
		super();
	this.userName = userName;
	this.password = password;
		this.fristName = fristName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.roles = roles;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
