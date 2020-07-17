package com.hibernate.learn.mypackage;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertDBData {

    public static void main( String[] args )
    {

        Configuration config = new Configuration();
        Session session = SessionFactoryHelper.getSessionFactory().openSession();
        Transaction transactionObj = session.beginTransaction();

        Employee empObj=new Employee();
        empObj.setId(4);
        empObj.setFirstName("Vittal");
        empObj.setLastName("Das");

        System.out.println("Session created successfully.");
        session.save(empObj);
        transactionObj.commit();
        System.out.println("Data successfully inserted in emp table..");

        session.close();
        SessionFactoryHelper.closeSessionFactory();
    }
}
