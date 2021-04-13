package com.anil.assessment;

import java.util.Date;

public class Transaction {
	private String transactionId;
	private String accNo;
	private Date transactionDate;
	private double amount;
	private String typeOfTxn;
	/**
	 * @param transactionId
	 * @param accNo
	 * @param transactionDate
	 * @param amount
	 * @param typeOfTxn
	 */
	public Transaction(String transactionId, String accNo, Date transactionDate, double amount, String typeOfTxn) {
		super();
		this.transactionId = transactionId;
		this.accNo = accNo;
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.typeOfTxn = typeOfTxn;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accNo=" + accNo + ", transactionDate="
				+ transactionDate + ", amount=" + amount + ", typeOfTxn=" + typeOfTxn + "]";
	}
	
	
}
