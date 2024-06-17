	
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

/* XML 

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



<dependency>
	 <groupId>org.springframework</groupId>
	<artifactId>spring-core</artifactId>
	<version>5.3.15</version>
</dependency>
 <dependency>
	 <groupId>org.springframework</groupId>
	<artifactId>spring-context</artifactId>
	<version>5.3.15</version>
</dependency>


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
