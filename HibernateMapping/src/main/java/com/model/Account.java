package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Account {

	@Id
	private int accNo;
	
	private String accName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="aidFk")
	private List<Transactions> txns = new ArrayList<Transactions>();

	public Account() {
		super();
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public List<Transactions> getTxns() {
		return txns;
	}

	public void setTxns(List<Transactions> txns) {
		this.txns = txns;
	}

	public Account(int accNo, String accName, List<Transactions> txns) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.txns = txns;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", txns=" + txns + "]";
	}
	
}
