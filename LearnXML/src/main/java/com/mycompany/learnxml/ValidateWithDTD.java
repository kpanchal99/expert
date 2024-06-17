/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learnxml;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;


public class ValidateWithDTD extends DefaultHandler{

    public static void main(String[] args) {
       
        try {
            ValidateWithDTD v = new ValidateWithDTD();
            v.validateXML();
            System.out.println("Successfully validated");
        } catch (Exception e) {
            System.out.println("Successfully failed");
            System.out.println(e.getMessage());
        }
    }
    
    public void validateXML() throws IOException, ParserConfigurationException, SAXException{
        String xmlFile = "student.xml";
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setValidating(true);
        factory.setNamespaceAware(true);

        SAXParser parser = factory.newSAXParser(); // dtd file
        XMLReader reader = parser.getXMLReader();
        reader.setErrorHandler(this);

        reader.parse(new InputSource(xmlFile));
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
