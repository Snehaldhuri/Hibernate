package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class EmpTest {

	public static void main(String[] args) {

//		Configuration cfg = new Configuration();	
//		cfg.configure();
//		SessionFactory sf =cfg.buildSessionFactory();
//		Session session =sf.openSession();
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx= session.beginTransaction();
		
		List<String> addresses = new ArrayList<String>();
		addresses.add("MUMBAI");
		addresses.add("HYD");
		addresses.add("DEL");
		
		Employee empl = new Employee(1, "XYZ", 2000 , addresses);
		
		//insert into db
		session.save(empl);
	
		tx.commit();
		
		//to get data of an object
		Employee empl1 = session.get(Employee.class, 1);
		System.out.println(empl1.toString());
		
	}

}
