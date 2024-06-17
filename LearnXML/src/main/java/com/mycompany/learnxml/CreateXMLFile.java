/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learnxml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author kpanchal
 */
public class CreateXMLFile {
    
    public static void main(String[] args) {
        
        try{
            Document document = (Document) DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            //root node
            Element students = document.createElement("students");
            document.appendChild(students);
            
            //child node
            String[][] student = {
                new String[] {"1","Karan","8.10"},
                new String[] {"33","Panchal","9.0"},
            };
            for(String[] stud : student){
                //child root element
                Element std = document.createElement("student");
                
                Element title = document.createElement("id");               
                Text titleText = document.createTextNode(stud[0]);
            
                title.appendChild(titleText);
            
                Element name = document.createElement("Name");               
                Text nameText = document.createTextNode(stud[1]);               
                name.appendChild(nameText);
                
                Element grade = document.createElement("Grade");               
                Text gradeText = document.createTextNode(stud[2]);               
                grade.appendChild(gradeText);
                
                std.appendChild(title);
                std.appendChild(name);
                std.appendChild(grade);
                
                students.appendChild(std);
            }
            
            // Write to XML FILE
            TransformerFactory transformerfactory = TransformerFactory.newInstance();
            transformerfactory.newTransformer().transform(new DOMSource(document), new StreamResult("student.xml"));
            
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Created XML");
        }
    }
}
