/**
 * 
 */
package com.baeldung.model;

/**
 * @author himanshuvashisth
 *
 */
public class Person {

	private Address address;
	
	public void setAddress(Address address) {
		System.out.println("Inside Person's Address setter");
		this.address = address;
	}	
	
	public Address getAddress() {
		return address;
	}

	public void fetchPersonAddress() {
		// This method shall enable us to print the address of correspondence of the Person.  
		System.out.println("Inside fetchPersonAddress");
		address.printAddress();
	}
	
}


/*
public Person(Address address) {
	System.out.println("Inside Person constructor");
	this.address = address;
}*/
