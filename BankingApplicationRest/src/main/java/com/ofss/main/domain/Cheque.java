//package com.ofss.main.domain;
//
//import java.sql.Date;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "cheque_details")
//public class Cheque {
//  
//	@Id
//	@Column(name="cheque_id")
//    private int chequeId;
//	@Column(name="cheque_receiver_name")
//    private String chequeReceiverName;
//	@JoinColumn(name = "account_id")
//    private Account accountId;
//	@Column(name="ceque_depositer_name")
//    private String chequeDepositerName;	
//	@Column(name="cheque_date")
//    private Date chequeDate;
//	@Column(name="cheque_clearance_date")
//	private Date chequeClearanceDate;
//	@Column(name="cheque_expiry_date")
//	private Date chequeExpiryDate;
//	@Column(name="cheque_amount")
//	private float chequeAmount;
//	
//	public Cheque() {
//			}
//
//	public Cheque(int chequeId, String chequeReceiverName, Account accountId, String chequeDepositerName,
//			Date chequeDate, Date chequeClearanceDate, Date chequeExpiryDate, float chequeAmount) {
//		super();
//		this.chequeId = chequeId;
//		this.chequeReceiverName = chequeReceiverName;
//		this.accountId = accountId;
//		this.chequeDepositerName = chequeDepositerName;
//		this.chequeDate = chequeDate;
//		this.chequeClearanceDate = chequeClearanceDate;
//		this.chequeExpiryDate = chequeExpiryDate;
//		this.chequeAmount = chequeAmount;
//	}
//
//	public int getChequeId() {
//		return chequeId;
//	}
//
//	public void setChequeId(int chequeId) {
//		this.chequeId = chequeId;
//	}
//
//	public String getChequeReceiverName() {
//		return chequeReceiverName;
//	}
//
//	public void setChequeReceiverName(String chequeReceiverName) {
//		this.chequeReceiverName = chequeReceiverName;
//	}
//
//	public Account getAccountId() {
//		return accountId;
//	}
//
//	public void setAccountId(Account accountId) {
//		this.accountId = accountId;
//	}
//
//	public String getChequeDepositerName() {
//		return chequeDepositerName;
//	}
//
//	public void setChequeDepositerName(String chequeDepositerName) {
//		this.chequeDepositerName = chequeDepositerName;
//	}
//
//	public Date getChequeDate() {
//		return chequeDate;
//	}
//
//	public void setChequeDate(Date chequeDate) {
//		this.chequeDate = chequeDate;
//	}
//
//	public Date getChequeClearanceDate() {
//		return chequeClearanceDate;
//	}
//
//	public void setChequeClearanceDate(Date chequeClearanceDate) {
//		this.chequeClearanceDate = chequeClearanceDate;
//	}
//
//	public Date getChequeExpiryDate() {
//		return chequeExpiryDate;
//	}
//
//	public void setChequeExpiryDate(Date chequeExpiryDate) {
//		this.chequeExpiryDate = chequeExpiryDate;
//	}
//
//	public float getChequeAmount() {
//		return chequeAmount;
//	}
//
//	public void setChequeAmount(float chequeAmount) {
//		this.chequeAmount = chequeAmount;
//	}
//
//	
//	
//    
//}
