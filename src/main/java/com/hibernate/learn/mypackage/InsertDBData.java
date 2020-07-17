package com.hibernate.learn.mypackage;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertDBData {

    public static void main( String[] args )
    {

        Configuration config = new Configuration();
        Session session = SessionFactoryHelper.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();

        Employee empObj=new Employee();
        empObj.setId(1);
        empObj.setFirstName("Subhasis");
        empObj.setLastName("Roy");

        /*session.save(empObj);
        t.commit();
        System.out.println("Data successfully inserted.");
        sessionFactory.close();
        session.close();*/
    }
}
