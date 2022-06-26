package oneTomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction_1 {
	@Id
 private int t_id;
 private String t_amount;
public int getT_id() {
	return t_id;
}
public void setT_id(int t_id) {
	this.t_id = t_id;
}
public String getT_amount() {
	return t_amount;
}
public void setT_amount(String t_amount) {
	this.t_amount = t_amount;
}
public Transaction_1() {
	super();
}
public Transaction_1(int t_id, String t_amount) {
	super();
	this.t_id = t_id;
	this.t_amount = t_amount;
}
@Override
public String toString() {
	return "Transaction [t_id=" + t_id + ", t_amount=" + t_amount + "]";
}


}
