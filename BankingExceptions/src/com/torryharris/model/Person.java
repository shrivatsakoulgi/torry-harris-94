package com.torryharris.model;

public class Person {
	private String personName;
	private long aadhaar;
	private long accountNumber;
	private double balance;
	private double amountWithdrawn;

	public Person(String personName, long aadhaar, long accountNumber, double balance) {
		
		this.personName = personName;
		this.aadhaar = aadhaar;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.amountWithdrawn=0;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public long getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAmountWithdrawn() {
		return amountWithdrawn;
	}

	public void setAmountWithdrawn(double amountWithdrawn) {
		this.amountWithdrawn = amountWithdrawn;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", aadhaar=" + aadhaar + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + ", amountWithdrawn=" + amountWithdrawn + "]";
	}
	
	
	

}
