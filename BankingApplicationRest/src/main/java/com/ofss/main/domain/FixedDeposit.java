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
//@Table(name = "fixed_deposit_details")
//public class FixedDeposit {
//	
//	@Id
//	@Column(name = "fixed_deposit_id")
//    private int fdId;
//	@JoinColumn(name = "account_id")
//    private Account accountId;
//	@Column(name = "fixed_deposit_validity")
//    private int fdValidity;	
//	@Column(name = "fixed_deposit_rate_of_interest")
//	 private int fdRate;
//	@Column(name = "fixed_deposit_start_date")
//	 private Date fdStartDate ;
//	@Column(name = "fixed_deposit_end_date")
//	 private Date fdSEndDate ;
//	
//	
//	public FixedDeposit() {
//		
//	}
//	public FixedDeposit(int fdId, Account accountId, int fdValidity, int fdRate, Date fdStartDate, Date fdSEndDate) {
//		super();
//		this.fdId = fdId;
//		this.accountId = accountId;
//		this.fdValidity = fdValidity;
//		this.fdRate = fdRate;
//		this.fdStartDate = fdStartDate;
//		this.fdSEndDate = fdSEndDate;
//	}
//	public int getFdId() {
//		return fdId;
//	}
//	public void setFdId(int fdId) {
//		this.fdId = fdId;
//	}
//	public Account getAccountId() {
//		return accountId;
//	}
//	public void setAccountId(Account accountId) {
//		this.accountId = accountId;
//	}
//	public int getFdValidity() {
//		return fdValidity;
//	}
//	public void setFdValidity(int fdValidity) {
//		this.fdValidity = fdValidity;
//	}
//	public int getFdRate() {
//		return fdRate;
//	}
//	public void setFdRate(int fdRate) {
//		this.fdRate = fdRate;
//	}
//	public Date getFdStartDate() {
//		return fdStartDate;
//	}
//	public void setFdStartDate(Date fdStartDate) {
//		this.fdStartDate = fdStartDate;
//	}
//	public Date getFdSEndDate() {
//		return fdSEndDate;
//	}
//	public void setFdSEndDate(Date fdSEndDate) {
//		this.fdSEndDate = fdSEndDate;
//	}
//    
//	
//}
