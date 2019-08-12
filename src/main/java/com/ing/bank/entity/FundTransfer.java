package com.ing.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fundtransfer")
public class FundTransfer {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	@Column(name="from_account")
	private Long fromAccount;
	@Column(name="to_account")
	private Long ToAccount;
	@Column(name="amount")
	private Double amount;
	@Column(name="remarks")
	private String remarks;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public Long getToAccount() {
		return ToAccount;
	}
	public void setToAccount(Long toAccount) {
		ToAccount = toAccount;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
