/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learnjsp_part_1;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;


public class NativeSQLExample {
    
    public static void main(String[] args){

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        try {
            Session session = sessionFactory.openSession();
            //Begin a transaction
            session.beginTransaction();
            String sqlQuery = "SELECT * FROM employee WHERE id = :id";
            //Create a NativeQuery object - not translated by hibernate
            NativeQuery<Employee> query = session.createNativeQuery(sqlQuery, Employee.class);
            // Uncomment the line below if you need to set parameters
            query.setParameter("id", "1");
            //Execute the query and get the result list
            List<Employee> employees = query.getResultList();
            //Print the results
            for (Employee employee : employees) {
                System.out.println(employee.getFirstName());
            }
            //Commit the transaction
            session.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            sessionFactory.close();
        }
    }
}



