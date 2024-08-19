package com.ofss.main.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
@Entity
//@Table(name="login_details")
public class LoginDetails {
    @Id
	@Column(name="login_id")
    private String loginId;
    @Column(name="login_password")
    private String loginPassword;
    @Column(name="login_attempts")
    private int loginAttempts;
    @Column(name="login_status")
    private String loginStatus = "ACTIVE";

//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "loginId")
//    private CustomerDetails customerDetails;
//    
//public CustomerDetails getCustomerDetails() {
//		return customerDetails;
//	}
//
//
//	public void setCustomerDetails(CustomerDetails customerDetails) {
//		this.customerDetails = customerDetails;
//	}


	//    public LoginDetails(String username, String password, int customerId) {
//        this.username = username;
//        this.password = password;
//        this.customerId = customerId;
//    }
    public LoginDetails(){}


	public LoginDetails(String loginId, String loginPassword, int loginAttempts, String loginStatus) {
	super();
	this.loginId = loginId;
	this.loginPassword = loginPassword;
	this.loginAttempts = loginAttempts;
	this.loginStatus = loginStatus;
}


	public String getLoginId() {
		return loginId;
	}


	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}


	public String getLoginPassword() {
		return loginPassword;
	}


	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}


	public int getLoginAttempts() {
		return loginAttempts;
	}


	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}


	public String getLoginStatus() {
		return loginStatus;
	}


	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

}
    