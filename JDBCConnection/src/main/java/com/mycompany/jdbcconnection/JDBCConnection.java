
package com.mycompany.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {
//      ADD dependencies in maven
//        <dependencies>
//        <!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
//        <dependency>
//            <groupId>com.mysql</groupId>
//            <artifactId>mysql-connector-j</artifactId>
//            <version>8.3.0</version>
//        </dependency>
//    </dependencies>
    public static void main(String[] args) {
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
    }
}
