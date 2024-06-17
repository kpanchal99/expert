
package com.mycompany.practical_11;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class XMLValidatorDTD extends DefaultHandler {
    
    public static void main(String[] args) {
        String xmlFile = "student.xml"; 
        
        try {
            XMLValidatorDTD validator = new XMLValidatorDTD();
            validator.validate(xmlFile);
            System.out.println("Validation is sucessful!");
        } catch (Exception e) {
             System.out.println("Validation failed!");
            e.printStackTrace();
        }
    }

    public void validate(String xmlFile) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setValidating(true);
        factory.setNamespaceAware(true);

        SAXParser parser = factory.newSAXParser(); // dtd file
        XMLReader reader = parser.getXMLReader();
        reader.setErrorHandler(this);

        reader.parse(new InputSource(xmlFile));
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        System.out.println("Error: " + e.getMessage());
        throw new SAXException("Error encountered during validation");
    }

    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        System.out.println("Fatal Error: " + e.getMessage());
        throw new SAXException("Fatal Error encountered during validation");
    }

    @Override
    public void warning(SAXParseException e) throws SAXException {
        System.out.println("Warning: " + e.getMessage());
    }
}
//
//Student.dtd file
//
//<!ELEMENT students (student+)>
//<!ELEMENT student (id, name, grade)>
//<!ELEMENT id (#PCDATA)>
//<!ELEMENT name (#PCDATA)>
//<!ELEMENT grade (#PCDATA)>
//
//	<!ELEMENT students (student+)>: This line defines the structure of the students element. It says that the students element must contain one or more student elements.
//	<!ELEMENT student (id, name, grade)>: This line defines the structure of the student element. It says that each student element must contain an id, a name, and a grade element, in that order.
//	<!ELEMENT id (#PCDATA)>: This line defines the structure of the id element. It says that the id element contains parsed character data (#PCDATA), which means it can contain text.
//	<!ELEMENT name (#PCDATA)>: This line defines the structure of the name element. Similar to the id element, it contains parsed character data (#PCDATA), allowing it to hold text.
//	<!ELEMENT grade (#PCDATA)>: This line defines the structure of the grade element. Again, it contains parsed character data (#PCDATA), meaning it can also hold text.
//
//
//Students.xml
//
//Load dtd file here
//<?xml version="1.0" encoding="UTF-8" standalone="no"?><students><student><id>1</id></student><student><id>2</id></student></students>

