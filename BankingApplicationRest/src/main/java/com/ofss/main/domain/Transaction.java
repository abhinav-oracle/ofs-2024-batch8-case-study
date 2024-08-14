//package com.ofss.main.domain;
//
//import java.sql.Time;
//import java.sql.Timestamp;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "transaction_details")
//public class Transaction {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="transaction_id")
//    private int transactionId;
//	@Column(name="sender_account_id")
//    private int senderAccountId;
//	@Column(name="receiver_account_id")
//    private int receiverAccountId;
//	@Column(name="transaction_amount")
//    private float transactionAmount;
//	@Column(name="transaction_type")
//    private String transactionType;
//	@Column(name="transaction_time")	
//    private Timestamp transaction_time;
//    
//	
//	public Transaction() {
//		
//	}
//
//
//	public int getTransactionId() {
//		return transactionId;
//	}
//
//
//	public void setTransactionId(int transactionId) {
//		this.transactionId = transactionId;
//	}
//
//
//	public int getSenderAccountId() {
//		return senderAccountId;
//	}
//
//
//	public void setSenderAccountId(int senderAccountId) {
//		this.senderAccountId = senderAccountId;
//	}
//
//
//	public int getReceiverAccountId() {
//		return receiverAccountId;
//	}
//
//
//	public void setReceiverAccountId(int receiverAccountId) {
//		this.receiverAccountId = receiverAccountId;
//	}
//
//
//	public float getTransactionAmount() {
//		return transactionAmount;
//	}
//
//
//	public void setTransactionAmount(float transactionAmount) {
//		this.transactionAmount = transactionAmount;
//	}
//
//
//	public String getTransactionType() {
//		return transactionType;
//	}
//
//
//	public void setTransactionType(String transactionType) {
//		this.transactionType = transactionType;
//	}
//
//
//	public Timestamp getTransaction_time() {
//		return transaction_time;
//	}
//
//
//	public void setTransaction_time(Timestamp transaction_time) {
//		this.transaction_time = transaction_time;
//	}
//
//
//	public Transaction(int transactionId, int senderAccountId, int receiverAccountId, float transactionAmount,
//			String transactionType, Timestamp transaction_time) {
//		super();
//		this.transactionId = transactionId;
//		this.senderAccountId = senderAccountId;
//		this.receiverAccountId = receiverAccountId;
//		this.transactionAmount = transactionAmount;
//		this.transactionType = transactionType;
//		this.transaction_time = transaction_time;
//	}
//	
//	
//
//    
//}
//	
