/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learnjsp_part_1;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class ValidateXMLDTD  extends DefaultHandler {
    // create DTD for this 
    //<!DOCTYPE employees SYSTEM "employeeDTD.dtd">
  /*  <?xml version="1.0" encoding="UTF-8"?>
    <!ELEMENT employees (employee+)>
    <!ELEMENT employee (id, name, grade)>
    <!ELEMENT id (#PCDATA)>
    <!ELEMENT name (#PCDATA)>
    <!ELEMENT grade (#PCDATA)>*/
     public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        try {
            ValidateXMLDTD v = new ValidateXMLDTD();
            v.validate();
            System.out.println("validated!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (Exception e) {
            System.out.println("faileddddddddddddddd!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            e.printStackTrace();
        } finally {
            // Any cleanup code goes here
        }
    }

    public void validate() throws ParserConfigurationException, SAXException, IOException {
        String fileName = "employees.xml";
        SAXParserFactory sax = SAXParserFactory.newInstance();
        sax.setValidating(true);
        sax.setNamespaceAware(true);

        SAXParser parser = sax.newSAXParser();
        XMLReader reader = parser.getXMLReader();
        reader.setErrorHandler(this);

        reader.parse(new InputSource("C:\\Users\\kpanchal\\Documents\\NetBeansProjects\\LearnJSP_Part_1\\"+fileName));
    }
    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        super.fatalError(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        super.error(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void warning(SAXParseException e) throws SAXException {
        super.warning(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
