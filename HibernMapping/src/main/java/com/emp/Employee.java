package com.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.proj.Project;

@Entity
@Table(name="employee_tab")
public class Employee {  //employee //employee_tab

	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_addr")
	private String empAddr;
	
	@ManyToOne()
	@JoinColumn(name = "pid", unique = true)
	private Project prj; //HAS-A
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
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public Project getPrj() {
		return prj;
	}
	public void setPrj(Project prj) {
		this.prj = prj;
	}
	public Employee(int empId, String empName, String empAddr, Project prj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empAddr;
		this.prj = prj;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddr=" + empAddr + ", prj=" + prj + "]";
	}
	
}
