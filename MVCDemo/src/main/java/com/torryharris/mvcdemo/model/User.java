package com.torryharris.mvcdemo.model;

public class User {

	private String userName;
	private String email;
	private long phone;
	private String address;
	private int age;
	private String password;
	
	public User(String userName, String email, long phone, String address, int age, String password) {
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.age = age;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", age=" + age + ", password=" + password + "]";
	}
	
	
	
	
}
