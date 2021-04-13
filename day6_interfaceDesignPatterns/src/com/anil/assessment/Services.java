package com.anil.assessment;

import java.util.Date;

public interface Services {
	public static Transaction tranferFunds(Account from, Account to, double amount) throws Exception
	{
		if(from.getBalance() < amount)
		{
			throw new Exception("Account balance insufficient.");
		}
		
		double fromBal = from.getBalance();
		double toBal = to.getBalance();
		
		System.out.println("Current balance of sender account number " + from.getAccNo() + " is " + fromBal);
		System.out.println("Current balance of reciever account number " + to.getAccNo() + " is " + toBal);
		
		fromBal -= amount;
		toBal += amount;
		
		System.out.println("Updated balance of sender account number " + from.getAccNo() + " is " + fromBal);
		System.out.println("Updated balance of reciever account number " + to.getAccNo() + " is " + toBal);
		
		String tranId = from.getCustomer().getName().substring(0, 2).toUpperCase() + Math.round(Math.random()*10000);
		String accntNo = from.getAccNo();
		Date date = new Date();
		double amt = amount;
		String type = "Funds Transfer";
		
		Transaction temp = new Transaction(tranId, accntNo, date, amt, type);
		return temp;	
	}
	
	public static Transaction service(Account acc, int noOfPages)
	{
		double amt = 0;
		if(noOfPages > 30)
		{
			amt = noOfPages;
		}
		
		System.out.println(noOfPages + " pages "+"cheque book issued to account number " + acc.getAccNo() + ". Amount deducted for cheque book " + amt);
		
		String tranId = acc.getCustomer().getName().substring(0, 2).toUpperCase() + Math.round(Math.random()*10000);
		String accntNo = acc.getAccNo();
		Date date = new Date();
		String type = "Cheque book issue";
		
		Transaction temp = new Transaction(tranId, accntNo, date, amt, type);
		return temp;
	}
	
	public static Transaction service(Account acc, double amount, int period)
	{
		double accBal = acc.getBalance();
		
		
		System.out.println("Current balance of the account number " + acc.getAccNo() + " is " + accBal);
		
		accBal += amount;
		
		System.out.println("Loan of amount " + amount + " issued to the account number " + acc.getAccNo());
		
		System.out.println("Updated balance of the account number " + acc.getAccNo() + " is " + accBal);

		
		String tranId = acc.getCustomer().getName().substring(0, 2).toUpperCase() + Math.round(Math.random()*10000);
		String accntNo = acc.getAccNo();
		Date date = new Date();
		double amt = amount;
		String type = "Loan issue";
		
		Transaction temp = new Transaction(tranId, accntNo, date, amt, type);
		return temp;
	}
}
