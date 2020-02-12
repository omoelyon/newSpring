package com.luv2code.springdemo.mcv;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	
	private String country;
	
	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "BRAZIL");
		countryOptions.put("NIG", "NIGERIA");
		countryOptions.put("GH", "GHANA");
		countryOptions.put("TG", "TOGO");
		countryOptions.put("CR", "CARMERON");
		
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
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	

}
