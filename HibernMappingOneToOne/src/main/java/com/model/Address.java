package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addrtab")
public class Address {
    @Id
    @Column (name="aid")
	private int addrId;
    @Column (name="loc")
	private String addrLoc;
    @Column (name="pin")
	private String addrPin;
    
	public Address() {
		super();
	}
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getAddrLoc() {
		return addrLoc;
	}
	public void setAddrLoc(String addrLoc) {
		this.addrLoc = addrLoc;
	}
	public String getAddrPin() {
		return addrPin;
	}
	public void setAddrPin(String addrPin) {
		this.addrPin = addrPin;
	}
	
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", addrLoc=" + addrLoc + ", addrPin=" + addrPin + "]";
	}
    
}
