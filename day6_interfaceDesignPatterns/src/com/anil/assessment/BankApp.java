package com.anil.assessment;

public class BankApp {
	public static void main(String[] s) throws Exception
	{
		Customer cust = new Customer("John Doe", "john@gmail.com", "2345234553", "SOHFL93930"); // add customer
		
		System.out.println(cust);
		
		System.out.println();
		
		Account acc = new Account(cust, "XYZ98732", 0.00); // create account
		
		System.out.println(acc);
		
		System.out.println();
		
		System.out.println(acc.deposit(100000.00)); // deposit money
		
		System.out.println();
		
		System.out.println(Services.service(acc, 30)); // issue cheque book
		
		System.out.println();
		
		System.out.println(Services.service(acc, 60)); // issue cheque book
		
		System.out.println();
		
		System.out.println(Services.service(acc, 25000, 2)); // issue loan of amount 25000
		
		System.out.println();
		
		System.out.println(acc.withdraw(5000)); // withdraw money
		
		System.out.println();
		
		cust = new Customer("Jane Doe", "jane@gmail.com", "9847334553", "DUPFH11930");  // add customer
		
		Account acc2 = new Account(cust, "XYZ13489", 0.00); // create account
		
		System.out.println(acc2.deposit(100000.00)); // deposit money
		
		System.out.println();
		
		System.out.println(Services.tranferFunds(acc, acc2, 9999));
		
		
	}
}
