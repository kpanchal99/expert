///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.practical_12;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
///**
// *
// * @author amard
// */
//public class GetData {
//    
//    public static void main(String[] args) {
//        
//       
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        try {
//            tx = session.beginTransaction();
//
//            // Fetch user with id 1
//            Student student = session.get(Student.class, 1);
//            System.out.println("FirstName: " + student.getName());
//            System.out.println("Email: " + student.getEmail());
//
//            tx.commit();
//        } catch (Exception e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//            sessionFactory.close();
//        }
//    }
//}