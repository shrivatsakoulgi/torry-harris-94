package com.torryharris.model;

import com.torryharris.exceptions.InsufficientFundsException;
import com.torryharris.exceptions.WithdrawLimitExceededException;

public class Bank {
	
	private String bankName;
	private String branchLocation;
	private String ifscCode;
	private double withdrawalLimit;
	
	public Bank(String bankName, String branchLocation, String ifscCode, double withdrawalLimit) {
		this.bankName = bankName;
		this.branchLocation = branchLocation;
		this.ifscCode = ifscCode;
		this.withdrawalLimit = withdrawalLimit;
	}

	public double getWithdrawalLimit() {
		return withdrawalLimit;
	}

	public void setWithdrawalLimit(double withdrawalLimit) {
		this.withdrawalLimit = withdrawalLimit;
	}



	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", branchLocation=" + branchLocation + ", ifscCode=" + ifscCode + "]";
	}
	
	public void withdrawAmount(Person p, double amount) throws InsufficientFundsException, WithdrawLimitExceededException {
		
		if(amount>p.getBalance()) {
			
			throw new InsufficientFundsException("Withdrawal of "+amount+" is Rejected\n"
					+ "Insufficient Funds.. Balance:"+p.getBalance());
		}
		else if((p.getAmountWithdrawn()+amount)>withdrawalLimit) {
			throw new WithdrawLimitExceededException("Withdrawal of "+amount+" is Rejected\n"
					+ "Total Withdrawn amount today is " +p.getAmountWithdrawn()+
					"\nWithdrawal Limit per day is:"+withdrawalLimit);
			
		}
		else {
			System.out.println("Withdrawal of Rs. "+amount+" is Success..!!");
			p.setBalance(p.getBalance()-amount);
			System.out.println("Balance is :"+p.getBalance());
			p.setAmountWithdrawn(p.getAmountWithdrawn()+amount);
			System.out.println("Total amount withdrawn:"+p.getAmountWithdrawn());
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
