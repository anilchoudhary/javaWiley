package com.anil.assessment;

import java.util.Date;

public class Account{
	private Customer customer;
	private String accNo;
	private double balance;
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * @param customer
	 * @param accNo
	 * @param balance
	 */
	public Account(Customer customer, String accNo, double balance) {
		super();
		this.customer = customer;
		this.accNo = accNo;
		this.balance = balance;
	}
	
	Transaction deposit(double amount)
	{
		
		System.out.println("Current balance of account number " + this.accNo + " is " + this.balance);
		
		this.balance += amount; 
		
		System.out.println("Amount " + amount + " added to the account number " + this.accNo);
		
		System.out.println("Updated balance of account number " + this.accNo + " is " + this.balance);
		
		String tranId = this.customer.getName().substring(0, 2).toUpperCase() + Math.round(Math.random()*10000);
		String accntNo = this.accNo;
		Date date = new Date();
		double amt = amount;
		String type = "Deposit";
		
		Transaction temp = new Transaction(tranId, accntNo, date, amt, type);
		return temp;
	}
	
	Transaction withdraw(double amount) throws Exception
	{
		if(this.balance < amount)
		{
			throw new Exception("Account balance insufficient.");
		}
		
		System.out.println("Current balance of account number " + this.accNo + " is " + this.balance);
		
		this.balance -= amount;
		
		System.out.println("Amount " + amount + "deducted from the account number " + this.accNo);
		
		System.out.println("Updated balance of account number " + this.accNo + " is " + this.balance);
		
		String tranId = this.customer.getName().substring(0, 2).toUpperCase() + Math.round(Math.random()*10000);
		String accntNo = this.accNo;
		Date date = new Date();
		double amt = amount;
		String type = "Withdrawal";
		
		Transaction temp = new Transaction(tranId, accntNo, date, amt, type);
		return temp;
	}
	@Override
	public String toString() {
		return "Account [customer=" + customer + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	
}
