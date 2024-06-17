
package com.mycompany.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("springConfig.xml");
        Student stud = (Student)context.getBean("studentBean");
        stud.display();
    }
}
