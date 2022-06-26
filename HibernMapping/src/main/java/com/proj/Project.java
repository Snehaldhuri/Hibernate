package com.proj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_proj")
public class Project {

	@Id
	@Column(name="pid")
	private int pid;
	@Column(name="pname")
	private String projName;
	@Column(name="pdesc")
	private String projDesc;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getProjDesc() {
		return projDesc;
	}
	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}
	public Project(int pid, String projName, String projDesc) {
		super();
		this.pid = pid;
		this.projName = projName;
		this.projDesc = projDesc;
	}
	public Project() {
		super();
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projName=" + projName + ", projDesc=" + projDesc + "]";
	}

}
