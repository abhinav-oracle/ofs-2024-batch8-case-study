//package com.ofss.main.domain;
//
//import java.sql.Date;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import jakarta.persistence.Transient;
//
//@Entity
////@Table(name = "account_details")
//public class Account{
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="account_type")
//	private int accountId;
//	@Column(name="account_type")
//    private String accountType;
//	@Column(name="account_min_balance")
//    private double accountMinBalance;
//	@Column(name="account_current_balance")
//    private double accountCurrentBalance;
//	@Column(name="account_withdrawal_limit")
//    private double accountWithdrawalLimit;
//	@Column(name="account_rate_of_interest")
//    private double accountRateOfInterest;
//	@Column(name="account_overdraft")
//    private double accountOverdraft;
//	@Column(name="account_opening_date")
//    private Date accountOpeningDate;
//	
//	@ManyToOne
//    @JoinColumn(name = "customer_id")
//    private CustomerDetails customerId;
//
//
//    public Account(){
//
//    }
//
//    public Account(CustomerDetails customerId, String accountType, Date accountOpeningDate, double accountMinBalance, double accountCurrentBalance, double accountWithdrawalLimit, double accountRateOfInterest, double accountOverdraft){
//        this.customerId=customerId;
//        this.accountOverdraft=accountOverdraft;
//        this.accountType=accountType;
//        this.accountMinBalance=accountMinBalance;
//        this.accountCurrentBalance=accountCurrentBalance;
//        this.accountWithdrawalLimit = accountWithdrawalLimit;
//        this.accountRateOfInterest = accountRateOfInterest;
//        this.accountOpeningDate = accountOpeningDate;
//    }
//
//
//    public int getAccountId() {
//        return accountId;
//    }
//    public void setAccountId(int accountId) {
//        this.accountId = accountId;
//    }
//    public double getAccountOverdraft() {
//        return accountOverdraft;
//    }
//    public void setAccountOverdraft(double accountOverdraft) {
//        this.accountOverdraft = accountOverdraft;
//    }
//    public String getAccountType() {
//        return accountType;
//    }
//    public void setAccountType(String accountType) {
//        this.accountType = accountType;
//    }
//    public double getAccountMinBalance() {
//        return accountMinBalance;
//    }
//    public void setAccountMinBalance(double accountMinBalance) {
//        this.accountMinBalance = accountMinBalance;
//    }
//    public double getAccountCurrentBalance() {
//        return accountCurrentBalance;
//    }
//    public void setAccountCurrentBalance(double accountCurrentBalance) {
//        this.accountCurrentBalance = accountCurrentBalance;
//    }
//    public double getAccountWithdrawalLimit() {
//        return accountWithdrawalLimit;
//    }
//    public void setAccountWithdrawalLimit(double accountWithdrawalLimit) {
//        this.accountWithdrawalLimit = accountWithdrawalLimit;
//    }
//    public double getAccountRateOfInterest() {
//        return accountRateOfInterest;
//    }
//    public void setAccountRateOfInterest(double accountRateOfInterest) {
//        this.accountRateOfInterest = accountRateOfInterest;
//    }
//    public Date getAccountOpeningDate() {
//        return accountOpeningDate;
//    }
//    public void setAccountOpeningDate(Date accountOpeningDate) {
//        this.accountOpeningDate = accountOpeningDate;
//    }
//
//	public CustomerDetails getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(CustomerDetails customerId) {
//		this.customerId = customerId;
//	} 
//   
//
//
//}
