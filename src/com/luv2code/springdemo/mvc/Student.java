package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	public String firstName;
	 
	public String lastName;
	public String country;
	public String favoritLanguage;
	
	
	// check box can take more item than one so we will take the 
	// string array 
	public String[] operatingSystem;
	
	public LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		// populate country options : used ISO country code
       
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR","Brazil");
		countryOptions.put("IN","India");
		countryOptions.put("USA","America");
		countryOptions.put("RUS","Russia");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getFavoritLanguage() {
		return favoritLanguage;
	}

	public void setFavoritLanguage(String favoritLanguage) {
		this.favoritLanguage = favoritLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		
		for(String temp : operatingSystem) {
			System.out.println(temp);
		}
		this.operatingSystem = operatingSystem;
	}

	
	
	
}
