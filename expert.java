
/*    public static void main(String[] args) {
        String db_name = "mca";
        String url = "jdbc:mysql://localhost:3306/" + db_name;
        int PORT = 3306;
        String username = "root";
        String password = "root";
        
        try {
            // Register Driver 
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to database...");
            Connection connection = DriverManager.getConnection(url, username, password);

            // Step 3: Execute a query
            System.out.println("Creating statement...");
            Statement statement = connection.createStatement();
            String sql = "SELECT id, name, email FROM users";
            ResultSet rs = statement.executeQuery(sql);

            // Step 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                // Display values
                System.out.print("id: " + id);
                System.out.print(", username: " + name);
                System.out.println(", email: " + email);
            }

            // Step 5: Clean-up environment
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        
        }    
    }*/

/* Generic Servlet

public class GenericServletExample extends GenericServlet {

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        sr1.setContentType("text/html");
        PrintWriter out = sr1.getWriter();
        out.println("<html><body>");
        out.println("<h2>Response from GenericServlet</h2>");
        out.println("Hello, this is a generic servlet example!");
        out.println("</body></html>");   
    }

}

*/
/*Servlet Config and Context

<context-param>
        <param-name>appName</param-name>
        <param-value>MyWebApp</param-value>
</context-param>
    <servlet>
        <servlet-name>ServletConfig_Context</servlet-name>
        <servlet-class>com.mycompany.learnjsp_part_1.ServletConfig_Context</servlet-class>
        <init-param>
            <param-name>jdbc_url</param-name>
            <param-value>llocalhost:3306</param-value>
        </init-param>
    </servlet>
	
	
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               // values are defined in web.xml
        
        // Servelt Config - for each servlet
        ServletConfig servletConfig = getServletConfig();
        String jbdc_url =servletConfig.getInitParameter("jdbc_url");
        
        System.out.println(jbdc_url);
        
        // ServletContext - servlet Container
        ServletContext servletContext = getServletContext();
        String app_name = servletContext.getInitParameter("appName");
        System.out.println(app_name);
    }
*/


/* Search.jsp
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="LoginServlet" method="POST">
            <input type="type" name="search" placeholder="enter to search">
            <button type="submit" value="redirect" name="btn">redirect</button>
            <button type="submit" value="forward" name="btn">forward</button>
            <button type="submit" value="include" name="btn">include</button>
        </form>
    </body>
</html>


//doGet or doPost
String btn = request.getParameter("btn");
String search = request.getParameter("search");

if ("redirect".equals(btn)) {
	// Redirect to Google search
	response.sendRedirect("https://www.google.com/search?q=" + search);
} else if ("include".equals(btn)) {
	// Include content from index.html
	System.out.println("include------------------------ call");
	RequestDispatcher rd = request.getRequestDispatcher("/index.html");
	rd.include(request, response);
} else {
	// Forward to welcome.jsp
	System.out.println("forward------------------------ call");
	RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
	rd.forward(request, response);
}
*/

/*Session Tracking

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.Cookie" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SessionIn" method="GET">
            <input type="hidden" name="sessionId" value=" <%= request.getParameter("sessionId")  %>">
            <input type="text" name="cookie_value" placeholder="enter cookies value">
            <input type="text" name="http_value" placeholder="enter http session value">
            <input type="submit" value="Submit">
        </form>
        <%      
            Cookie[] cookies = request.getCookies();
        %>
        <h1>After Redirect from Servlet now value are set</h1>
        <h3>username value : <%= session.getAttribute("username")  %></h3>
         <h3>cookie value : <%= cookies[0].getValue().toString()  %></h3>
         
         <h3>URL parameter <%=  request.getParameter("uname") %></h3>
         
         <h3>Hidden Field Value set by Servlet <%=  request.getParameter("sessionId") %> </h3>
    </body>
</html>


public class SessionIn extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // getting value send by user using jsp form
        String cookie_value = request.getParameter("cookie_value");
        String http_value = request.getParameter("http_value");
        
        // set http session
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("username", http_value);
        
        
        // set Cookie
        Cookie cookie = new Cookie("year", cookie_value);
        response.addCookie(cookie);
        
        // setting value for hidden field
        request.setAttribute("sessionId", "435345v3");
        response.sendRedirect("SessionIn.jsp");
    }
}

*/

/* scripting directive page include import 



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>

<%--<%@include file="header.jsp" %>--%>
<%--<%@ include file="index.html" %>--%>

<%--<jsp:include page="dynamicContent.jsp" />--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= new Date()%>

        <c:out value="${'Welcome to javaTpoint'}"/>  
        <c:set var="income" scope="session" value="${4000*4}"/>  
        <c:if test="${income > 8000}">  
           <p>My income is: <c:out value="${income}"/><p>  
        </c:if>
    </body>
</html>


*/

/*  action tags beans 


public class UserBean {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UseBean and Set Example</title>
    </head>
    <body>
        <jsp:useBean id="user" class="com.mycompany.learnjsp_part_1.UserBean" scope="session" />
        <jsp:setProperty name="user" property="name" value="John Doe" />
        <jsp:setProperty name="user" property="age" value="30" />

        <h2>User Information</h2>
        <p>Name: <jsp:getProperty name="user" property="name" /></p>
        <p>Age: <jsp:getProperty name="user" property="age" /></p>
    </body>
</html>


*/

/* custom tags / taglib
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--import tld-->
<%@ taglib prefix="mca" uri="/WEB-INF/mca_tag.tld" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <mca:kjsim />
    </body>
</html>


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

*/

/* XML 
create xml
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

validate dtd


    // create DTD for this 
    //<!DOCTYPE students SYSTEM "student.dtd">
  //  <?xml version="1.0" encoding="UTF-8"?>
  //  <!ELEMENT students (student+)>
  //  <!ELEMENT student (id, name, grade)>
   // <!ELEMENT id (#PCDATA)>
   // <!ELEMENT name (#PCDATA)>
 //   <!ELEMENT grade (#PCDATA)>
    
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




	// add to xml file
//        <employees
//          xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'
//          xsi:noNamespaceSchemaLocation='student.xsd'>

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


create xsd file
<xs:schema version="1.0"
           xmlns:xs="http://www.w3.org/2001/XMLSchema"
           elementFormDefault="qualified">
     <xs:element name="employees">
         <xs:complexType>
             <xs:sequence>
                 <xs:element name="employee" maxOccurs="unbounded">
                    <xs:complexType>
                        <xs:sequence>
                            <xs:element name="id" type="xs:int"/>
                            <xs:element name="Name" type="xs:string"/>
                            <xs:element name="Depte" type="xs:string"/>
                        </xs:sequence>
                    </xs:complexType>
                 </xs:element>
             </xs:sequence>
         </xs:complexType>
     </xs:element>
</xs:schema>


*/


/*hibernate

<hibernate-configuration>
    <session-factory>
        <!-- JDBC Database connection settings -->
        <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/mca</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">root</property>


        <!-- SQL dialect -->
        <property name="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</property>

        <!-- Enable Hibernate's automatic session context management -->
        <property name="hibernate.current_session_context_class">thread</property>

        <!-- Echo all executed SQL to stdout -->
        <property name="hibernate.show_sql">true</property>

        <!-- Automatically create or update the database schema -->
        <property name="hibernate.hbm2ddl.auto">update</property>
        
        <!-- Mention annotated class -->
        <mapping class="com.mycompany.learnjsp_part_1.Employee"/>    
    </session-factory>
</hibernate-configuration>


@Entity
@Table( name = "Employee")
public class Employee {
    
    @Id
    private int id;
    private String firstName; 
    private String lastName;   
    private int salary;  

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
        
}

    public static void main(String[] args) {
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Employee emp = new Employee(1,"","",200000);
            session.save(emp);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) { // read
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        // get data 1 id
        Employee emp = session.get(Employee.class, 1);
        System.out.println("Emp name " + emp.getFirstName());
        session.close();
    }
	
		
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

*/

/* 
<!DOCTYPE html>
<html>
<head>
    <title>CRUD Operations</title>
</head>
<body>
    <h1>User Management</h1>
    <form action="UserServlet" method="post">
        <input type="hidden" name="action" id="action">

        <label for="id">User ID:</label>
        <input type="text" id="id" name="id"><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email"><br>

        <button type="button" onclick="setActionAndSubmit('create')">Create</button>
        <button type="button" onclick="setActionAndSubmit('read')">Read</button>
        <button type="button" onclick="setActionAndSubmit('update')">Update</button>
        <button type="button" onclick="setActionAndSubmit('delete')">Delete</button>
    </form>

    <div id="result"></div>

    <script>
        function setActionAndSubmit(action) {
            document.getElementById('action').value = action;
            document.forms[0].submit();
        }
    </script>
</body>
</html>

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String URL = "jdbc:mysql://localhost:3306/exampledb";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                createUser(request, response);
                break;
            case "read":
                readUsers(request, response);
                break;
            case "update":
                updateUser(request, response);
                break;
            case "delete":
                deleteUser(request, response);
                break;
        }
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String query = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            response.getWriter().println("User created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error creating user.");
        }
    }

    private void readUsers(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String query = "SELECT * FROM users";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             PrintWriter out = response.getWriter()) {

            response.setContentType("text/html");
            out.println("<h1>User List</h1>");
            out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Email</th></tr>");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                out.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + email + "</td></tr>");
            }
            out.println("</table>");

        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error reading users.");
        }
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String query = "UPDATE users SET name = ?, email = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setInt(3, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                response.getWriter().println("User updated successfully.");
            } else {
                response.getWriter().println("User with ID " + id + " not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error updating user.");
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String query = "DELETE FROM users WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                response.getWriter().println("User deleted successfully.");
            } else {
                response.getWriter().println("User with ID " + id + " not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error deleting user.");
        }
    }
}
*/

/*
add dependency
create SpringConfig.xml - remove version in xsd line
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
">
<!--// remvoe vversion in xsd-->
    <bean id="studentBean" class="com.mycompany.learnspring.Student"></bean>
</beans>
  
  Student.java
  public class Student {
    
    public void display(){
        System.out.println("hello form spring mvc!!!!!!!!!!!!!!!!!");
    }
}

Main.java
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("SpringConfig.xml");
        Student stud = (Student)context.getBean("studentBean");
        stud.display();
    }
}

*/



/*  check in db table exist or not
CRUD 
<!DOCTYPE html>
<html>
<head>
    <title>User Management</title>
</head>
<body>
    <h2>Add User</h2>
    <form method="post" action="UserServlet">
        <input type="hidden" name="action" value="add">
        Name: <input type="text" name="name"><br>
        Email: <input type="text" name="email"><br>
        <input type="submit" value="Add User">
    </form>

    <h2>Update User</h2>
    <form method="post" action="UserServlet">
        <input type="hidden" name="action" value="update">
        ID: <input type="text" name="id"><br>
        Name: <input type="text" name="name"><br>
        Email: <input type="text" name="email"><br>
        <input type="submit" value="Update User">
    </form>

    <h2>Delete User</h2>
    <form method="post" action="UserServlet">
        <input type="hidden" name="action" value="delete">
        ID: <input type="text" name="id"><br>
        <input type="submit" value="Delete User">
    </form>

    <h2>User List</h2>
    <form method="get" action="UserServlet">
        <input type="submit" value="Refresh User List">
    </form>
</body>
</html>


public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database connection settings
    private static final String DB_NAME = "mca";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            addUser(request, response);
        } else if ("update".equals(action)) {
            updateUser(request, response);
        } else if ("delete".equals(action)) {
            deleteUser(request, response);
        }
    }

    private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Insert a new record
            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.executeUpdate();

            // Clean-up environment
            preparedStatement.close();
            connection.close();

            response.sendRedirect("index.html"); // Redirect to a success page or back to the form
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Update an existing record
            String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();

            // Clean-up environment
            preparedStatement.close();
            connection.close();

            response.sendRedirect("index.html"); // Redirect to a success page or back to the form
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Delete a record
            String sql = "DELETE FROM users WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            // Clean-up environment
            preparedStatement.close();
            connection.close();

            response.sendRedirect("index.html"); // Redirect to a success page or back to the form
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
*/
/*Required POM



<dependency>
	<groupId>com.mysql</groupId>
	<artifactId>mysql-connector-j</artifactId>
	<version>8.3.0</version>
</dependency>

<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
	<version>1.2</version>
</dependency>


<dependency>
	<groupId>org.hibernate</groupId>
	<artifactId>hibernate-core</artifactId>
	<version>5.6.15.Final</version>
</dependency>


<dependency>
	<groupId>org.hibernate</groupId>
	<artifactId>hibernate-entitymanager</artifactId>
	<version>5.5.5.Final</version>
</dependency>


//MVC
              
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>5.2.8.RELEASE</version>
        </dependency>

        <!-- Spring Context -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.2.8.RELEASE</version>
        </dependency>


//web
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-web</artifactId>
	<version>5.3.23</version>
</dependency>
 <dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-webmvc</artifactId>
	<version>5.3.15</version>
</dependency>
*/