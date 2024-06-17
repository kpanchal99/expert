/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ak.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author amard
 */
public class ReadData {
    
     public static void main(String[] args) {
        
       
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        try{
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        Student student = new Student("Sam", "Sam", "sam@gmail.com");       
        session.save(student);
        session.getTransaction().commit();
        session.close();
        
        session = sessionFactory.openSession();
        student = session.get(Student.class, 1);
        System.out.println("FirstName: " + student.getFirstName());
        
        }catch(Exception ex){
            
        }
     } 
}
