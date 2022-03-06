package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Session Started!" );
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory fact=cfg.buildSessionFactory();
        Session session=fact.openSession();
        Transaction tx=session.beginTransaction();
        
        Student stu=new Student();
        stu.setId(103);
        stu.setName("Manoj");
        stu.setCity("jhk"); 
        
        System.out.println(stu);
       
        
       
        session.save(stu);
        tx.commit();
        session.close();
    }
}
