package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Address;
import com.model.Employee;
import com.util.HibernateUtil;

public class EmployeeTest {


	public static void main(String[] args) {

		Transaction tx=null;
		try(Session ses=HibernateUtil.getSf().openSession())
		{
			tx=ses.beginTransaction();

			Address addr1=new Address();
			addr1.setAddrId(101);
			addr1.setAddrLoc("HYD");
			addr1.setAddrPin("500016");

			Address addr2=new Address();
			addr2.setAddrId(102);
			addr2.setAddrLoc("BAN");
			addr2.setAddrPin("444102");

			Address addr3=new Address();
			addr3.setAddrId(103);
			addr3.setAddrLoc("NGP");
			addr3.setAddrPin("441108");

			Employee emp1=new Employee();
			emp1.setEmpId(10);
			emp1.setEmpName("xyz");
			emp1.setEmpSal(3000);
			emp1.setAddr(addr1);

			Employee emp2=new Employee();
			emp2.setEmpId(11);
			emp2.setEmpName("abc");
			emp2.setEmpSal(5000);
			emp2.setAddr(addr2);

			Employee emp3=new Employee();
			emp3.setEmpId(12);
			emp3.setEmpName("pqr");
			emp3.setEmpSal(4000);
			emp3.setAddr(addr3);

			Employee emp4=new Employee();
			emp4.setEmpId(13);
			emp4.setEmpName("def");
			emp4.setEmpSal(6000);
			emp4.setAddr(addr3);

			ses.save(addr1);
			ses.save(addr2);
			ses.save(addr3);
			ses.save(emp1);
			ses.save(emp2);
			ses.save(emp3);
			ses.save(emp4);

			tx.commit();
		}
	}
}
