package oneTomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Account_1 {
	@Id
	private int id;
	private String name;
	private String branch;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
    private List<Transaction_1>t;
	public List<Transaction_1> getT() {
		return t;
	}
	public void setT(List<Transaction_1> t) {
		this.t = t;
	}
	
	public Account_1(int id, String name, String branch, List<Transaction_1> t) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.t = t;
	}
	public Account_1() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	

}
