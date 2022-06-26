package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.emp.Employee;
import com.proj.Project;

public class EmployeeTest {

	
	public static void main(String[] args) {
	
			Session sess = new Configuration().configure().buildSessionFactory().openSession();
			Transaction tx= sess.beginTransaction();
			
			Project p = new Project(1, "XYZ", "sjdkchwnc");
			
			Employee emp = new Employee(101, "Kartik", "MUM", p);
			sess.save(p);
			sess.save(emp);
			tx.commit();
		
	}
}
