package oneTomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction_1 tr = new Transaction_1(102, "30000");
		Transaction_1 tr1 = new Transaction_1(103, "50000");
		ArrayList<Transaction_1> li = new ArrayList<Transaction_1>();
		li.add(tr);
		li.add(tr1);
		Account_1 ac = new Account_1(101, "aaaa", "xyz", li);
//		Account_1 ac1 = new Account_1(102, "bbbbb", "abc", li);
//		ArrayList<Transaction_1> ac2= new ArrayList<Transaction_1>();
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = s.beginTransaction();

//		s.save(li);
		s.save(ac);
		t.commit();
		s.close();

	}

}
