
package com.mycompany.practical_12;

import java.io.File;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class NativeSQLExample {
    
    public static void main(String[]args){
        Configuration configuration = new Configuration();
        configuration.configure(new File("C:\\Users\\exam.202STUD124\\Downloads\\Hibernate\\src\\main\\resources\\hibernate.cfg.xml"));
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        try {
            Session session = sessionFactory.getCurrentSession();
            //Begin a transaction
            
            session.beginTransaction();
            
            //Define a native SQL query 
            String sqlQuery = "SELECT * FROM students WHERE id= :id";
    //Create a NAtiveQuery Object
    
    NativeQuery<Student> query = session.createNativeQuery(sqlQuery,Student.class);
    
    //Set Parameters
    query.setParameter("id", "33");
    
    List<Student> students = query.getResultList();
    
    for(Student student: students){
        System.out.println(student.getName());
    }
    
    
    //
        }
        catch(HibernateException ex){
            
        }
        }
    
    }

