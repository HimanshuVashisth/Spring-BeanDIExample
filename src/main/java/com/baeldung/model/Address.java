/**
 * 
 */
package com.baeldung.model;

/**
 * @author himanshuvashisth
 *
 */
public class Address { 

	private int houseNum;
	private String streetAddress;
	private String city;
	private Long zip;
	private String state;
	private String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside Address constructor");
	}
	
	public void printAddress() {
		System.out.println("Inside print Address");
	}
	
	// Getters-Setters for all fields
	

	public Address(int houseNum, String streetAddress, String city, Long zip, String state, String country) {
		super();
		this.houseNum = houseNum;
		this.streetAddress = streetAddress;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.country = country;
	}
	
	
	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getZip() {
		return zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
} // @formatter:on
