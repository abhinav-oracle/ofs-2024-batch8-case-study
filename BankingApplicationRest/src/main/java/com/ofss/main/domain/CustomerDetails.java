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
//@Table(name="bank_customer")
public class CustomerDetails {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="customer_id")
    private int customerId;
//    @Column(name="customer_first_name")
    private String customerFirstName;
//    @Column(name="customer_last_name")
    private String customerLastName;
//    @Column(name="customer_address")
    private String customerAddress;
//    @Column(name="customer_city")
    private String customerCity;
//    @Column(name="customer_state")
    private String customerState;
//    @Column(name="customer_zip")
    private int customerZip;
//    @Column(name="customer_phone_no")
    private String customerPhoneNo;
//    @Column(name="customer_email")
    private String customerEmail;
    
    //@Transient
    //@Column(name = "customer_login_id")
    @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name="customer_login_id")
    private LoginDetails loginId;
    
    public CustomerDetails(){
    	
    }

	public CustomerDetails(int customerId, String customerFirstName, String customerLastName, String customerAddress,
			String customerCity, String customerState, int customerZip, String customerPhoneNo, String customerEmail, LoginDetails loginId) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerState = customerState;
		this.customerZip = customerZip;
		this.customerPhoneNo = customerPhoneNo;
		this.customerEmail = customerEmail;
		this.loginId = loginId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public int getCustomerZip() {
		return customerZip;
	}

	public void setCustomerZip(int customerZip) {
		this.customerZip = customerZip;
	}

	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}

	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public LoginDetails getLoginId() {
		return loginId;
	}

	public void setLoginId(LoginDetails loginId) {
		this.loginId = loginId;
	}

	
    
    
}
