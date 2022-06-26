package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

/**
 * @author visha
 *
 */

//alt+shift +s  --> R
//alt+shift +s  --> o
//alt+shift +s  --> s

@Entity
@Table(name="empl")
public class Employee { //employee

	@Id
	@Column(name = "eid")
	private int empId;
	@Column(name ="ename")
	private String empName;
	@Column(name ="esal")
	private double empSal;
	
	//Collection type //seaprate DB table
	@ElementCollection
	@CollectionTable(name="empAddr", joinColumns = @JoinColumn(name="eid"))
	@OrderColumn(name="addr")
	@Column(name="eaddr")
	private List<String> empAddr = new ArrayList();

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public List<String> getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(List<String> empAddr) {
		this.empAddr = empAddr;
	}
	// param const
	public Employee(int empId, String empName, double empSal, List<String> empAddr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAddr = empAddr;
	}

	public Employee() {
		super();
	}

	// to string method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAddr=" + empAddr
				+ "]";
	}
	
	
}