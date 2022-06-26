package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Account;
import com.model.Transactions;
import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSf().openSession()){
			
			tx = session.beginTransaction();
			Transactions t1 = new Transactions(1, 77777);
			Transactions t2 = new Transactions(2, 77778);
			Transactions t3 = new Transactions(3, 77779);
			
			Account acc1 = new Account();
			acc1.setAccNo(1234567);
			acc1.setAccName("UBIN");
			acc1.getTxns().add(t1);
			acc1.getTxns().add(t2);
			acc1.getTxns().add(t3);
			
			session.save(acc1);
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
		}
	}
}
