
package com.mycompany.learnjsp_part_1;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CreateXML {
    // create xml file
    public static void main(String[] args) {
        try {
            Document document = (Document) DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            //root node
            Element employees = document.createElement("employees");
            document.appendChild(employees);
            
            // create 2d array 
//            String[][] empData = new String[3][3];
            String[][] empData = { 
                new String[] {"1","Karan","IT"},
                new String[] {"33","Panchal","Tech"} 
            };
            
            for(String[] data : empData){
                //childrens
                Element employee = document.createElement("employee");
                
                Element title = document.createElement("id");            
                Text titleText = document.createTextNode(data[0]);  
                title.appendChild(titleText);
            
                Element name = document.createElement("Name");               
                Text nameText = document.createTextNode(data[1]);               
                name.appendChild(nameText);
                
                Element grade = document.createElement("Dept");               
                Text gradeText = document.createTextNode(data[2]);               
                grade.appendChild(gradeText);
                
                employee.appendChild(title);
                employee.appendChild(name);
                employee.appendChild(grade);
                
                employees.appendChild(employee);
            }
            
             // Write to XML FILE
            TransformerFactory transformerfactory = TransformerFactory.newInstance();
            transformerfactory.newTransformer().transform(new DOMSource(document), new StreamResult("employees.xml"));
            
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
