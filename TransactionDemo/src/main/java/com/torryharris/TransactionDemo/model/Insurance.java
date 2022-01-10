package com.torryharris.TransactionDemo.model;

public class Insurance {

	private int insuranceId;
	private String insuranceName;
	private String insuranceType;
	
	public Insurance(int insuranceId, String insuranceName, String insuranceType) {
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
		this.insuranceType = insuranceType;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
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

	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", insuranceType="
				+ insuranceType + "]";
	}
	
	
	
}
