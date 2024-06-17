/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical_10;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
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
public class XMLCreator {
    public static void main(String[] args) throws ParserConfigurationException{
            try {
            Document document = (Document) DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
           
            
            Element students = document.createElement("students");
            document.appendChild(students);
            
            String[][] studentss = {
                new String[] {"1","Karan","8.10"},
                new String[] {"33","Panchal","8.0"},
            };
            
            
            
            for(String[] stud : studentss){
                Element student = document.createElement("student");
                
                Element title = document.createElement("id");               
                Text titleText = document.createTextNode(stud[0]);
            
                title.appendChild(titleText);
            
                Element name = document.createElement("Name");               
                Text nameText = document.createTextNode(stud[1]);               
                name.appendChild(nameText);
                
                Element grade = document.createElement("Grade");               
                Text gradeText = document.createTextNode(stud[2]);               
                grade.appendChild(gradeText);
                
                student.appendChild(title);
                student.appendChild(name);
                student.appendChild(grade);
                
                students.appendChild(student);
            }

            // Write to XML FILE
            TransformerFactory transformerfactory = TransformerFactory.newInstance();
            transformerfactory.newTransformer().transform(new DOMSource(document), new StreamResult("student.xml"));
            
            
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(XMLCreator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(XMLCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            System.out.println("Created XML");
        }


    }
}
