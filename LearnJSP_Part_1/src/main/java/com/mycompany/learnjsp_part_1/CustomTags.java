
package com.mycompany.learnjsp_part_1;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class CustomTags extends SimpleTagSupport{

    // create tld in web-inf .tld
//	<?xml version="1.0" encoding="UTF-8"?>
//	<taglib version="2.1" xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-jsptaglibrary_2_1.xsd">
//	  <tlib-version>1.0</tlib-version>
//	  <short-name>mca_tag</short-name>
//	  <uri>/WEB-INF/mca_tag</uri>
//		  <tag>
//			  <name>kjsim</name>
//			  <tag-class>com.mycompany.learnjsp_part_1.CustomTags</tag-class>
//			 <body-content>empty</body-content>
//		  </tag>
//	</taglib>
    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("Karan (MCA KJSIM)");
    }
    
}
