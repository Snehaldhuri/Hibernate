package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transactions {

	@Id
	private int txId;
	
	private double txAmt;
	
	public int getTxId() {
		return txId;
	}
	public void setTxId(int txId) {
		this.txId = txId;
	}
	public double getTxAmt() {
		return txAmt;
	}
	public void setTxAmt(double txAmt) {
		this.txAmt = txAmt;
	}
	public Transactions(int txId, double txAmt) {
		super();
		this.txId = txId;
		this.txAmt = txAmt;
	}
	@Override
	public String toString() {
		return "Transaction [txId=" + txId + ", txAmt=" + txAmt + "]";
	}
	
}
