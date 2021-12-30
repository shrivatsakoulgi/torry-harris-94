package com.torryharris.model;

public class Insurance {
	private String insuranceName;
	private String insuranceType;
	
	public Insurance(String insuranceName, String insuranceType) {
		this.insuranceName = insuranceName;
		this.insuranceType = insuranceType;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	public void assignInsurance(Employee employee) {	
		if(insuranceType.equals("Health")) {
			employee.setSumInsured(employee.getSalary()*6);
		}
		else if(insuranceType.equals("Term")) {
			employee.setSumInsured(employee.getSalary()*12*5);
		}
		else {
			System.out.println(insuranceType+" is not Supported..!!");
		}
	}

}
