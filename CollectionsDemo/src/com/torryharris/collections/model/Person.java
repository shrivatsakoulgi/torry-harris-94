package com.torryharris.collections.model;

public class Person implements Comparable<Person>{
	
	private String firstName;
	private String lastName;
	private long aadhar;
	private String address;
	
	public Person(String firstName, String lastName, long aadhar, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.aadhar = aadhar;
		this.address = address;
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

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", aadhar=" + aadhar + ", address="
				+ address + "]";
	}

	@Override
	public int compareTo(Person o) {
		Long adhar1 = this.aadhar;
		Long adhar2 = o.aadhar;
		return (adhar1.compareTo(adhar2));
	}
	
	
	
}
