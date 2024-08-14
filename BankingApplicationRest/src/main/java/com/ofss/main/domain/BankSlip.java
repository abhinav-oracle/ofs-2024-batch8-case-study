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
//@Table(name = "bankslip")
//public class BankSlip {
//    
//	@Id
//	@Column(name = "slip_id")
//    private int slipId;
//	@JoinColumn(name = "cheque_id")
//    private Cheque chequeId;
//	@Column(name = "slip_date")
//    private Date slipDate;
//	@Column(name = "approval_status")
//    private boolean approvalStatus;
//	public BankSlip() {
//		
//	}
//	public BankSlip(int slipId, Cheque chequeId, Date slipDate, boolean approvalStatus) {
//		super();
//		this.slipId = slipId;
//		this.chequeId = chequeId;
//		this.slipDate = slipDate;
//		this.approvalStatus = approvalStatus;
//	}
//	public int getSlipId() {
//		return slipId;
//	}
//	public void setSlipId(int slipId) {
//		this.slipId = slipId;
//	}
//	public Cheque getChequeId() {
//		return chequeId;
//	}
//	public void setChequeId(Cheque chequeId) {
//		this.chequeId = chequeId;
//	}
//	public Date getSlipDate() {
//		return slipDate;
//	}
//	public void setSlipDate(Date slipDate) {
//		this.slipDate = slipDate;
//	}
//	public boolean isApprovalStatus() {
//		return approvalStatus;
//	}
//	public void setApprovalStatus(boolean approvalStatus) {
//		this.approvalStatus = approvalStatus;
//	}
//	
//	
//   
//	
//}
