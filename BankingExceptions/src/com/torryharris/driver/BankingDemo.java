package com.torryharris.driver;

import com.torryharris.exceptions.InsufficientFundsException;
import com.torryharris.exceptions.WithdrawLimitExceededException;
import com.torryharris.model.Bank;
import com.torryharris.model.Person;

public class BankingDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ram", 123412341234L, 1234567890L, 50000);
		
		Bank sbi = new Bank("SBI","Jaynagar","SBIN000045",40000);
		
		try {
			sbi.withdrawAmount(p1, 20000);
			sbi.withdrawAmount(p1, 15000);
			sbi.withdrawAmount(p1, 18000);
		} catch (InsufficientFundsException | WithdrawLimitExceededException e) {
			
			System.out.println(e);
		}

	}

}
