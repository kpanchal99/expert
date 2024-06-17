package com.mycompany.learnxml;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

public class ValidateWithXSD {

    public static void main(String[] args) {
        try {
            // Create a SchemaFactory and specify XML Schema language
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            // Load the XML Schema from file
            Schema schema = factory.newSchema(new File("studentXSD.xsd"));

            // Create a Validator object for the Schema
            Validator validator = schema.newValidator();

            // Validate the XML document against the Schema
            validator.validate(new StreamSource(new File("student.xml")));

            System.out.println("Validation successful: XML document is valid.");
        } catch (SAXException e) {
            System.out.println("Validation failed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
