package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	
	Student stu=new Student("Sam","sam@unknown.com");
	Address adds=new Address("Steet16","Pikachu");
	
	Student stu1=new Student("Rock","trock@unknown.com");
	Address adds1=new Address("Steet9","thunderbolt");
	
	Session session=sf.openSession();
	session.beginTransaction();
	
	session.persist(adds);
	stu.setAddress(adds);
	session.persist(stu);
	
	session.persist(adds1);
	stu1.setAddress(adds1);
	session.persist(stu1);
	
	List<Student> students=(List<Student>)session.createQuery("from Student").list();
	for(Student s:students) {
		System.out.println("Details "+s);
	}
	session.getTransaction().commit();
	session.close();
}
}
