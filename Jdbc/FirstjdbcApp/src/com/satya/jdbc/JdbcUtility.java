package com.satya.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcUtility {

    static {
        try {
            // Step 1: Load and register the driver
            // This tells Java how to talk to MySQL
            Class.forName("com.mysql.cj.jdbc.Driver"); //it loads the static blocks of the driver
//another way is DriverManager.registerDriver(new .com.sql.jdbc.Driver())....
            System.out.println("Driver loaded successfully!");
        } catch (Exception e) {
            throw new RuntimeException("Error occurred!");

        }
    }

    public static Connection getConnection() {
        // Step 2: Establish the connection
        // Use the credentials for the sql server
        try{
        String url = "jDBC:mysql://localhost:3306/Student";
        String user = "root";
        String password = "Satya.k123!";

        Connection con = DriverManager.getConnection(url, user, password);
        return con;
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void preState(Connection con) {
        String query = "INSERT INTO studentInfo(id, sname, sage, scity) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preState = con.prepareStatement(query);
             Scanner sc = new Scanner(System.in)) {

            System.out.println("--- Entering Student Data ---");
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter city: ");
            String city = sc.next();

            // Mapping the values to the placeholders
            preState.setInt(1, id);
            preState.setString(2, name);
            preState.setInt(3, age);
            preState.setString(4, city);

            int affect = preState.executeUpdate();

            if (affect > 0) {
                System.out.println(" Operation successful! Affected rows: " + affect);
            } else {
                System.out.println("❌ Unable to proceed with the operation.");
            }

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
    public static void closeConnection(Connection con ,Statement statement)  {

        try {
            if(statement != null) statement.close();
            if(con != null) con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

// we also have something called batch syntax is preState.addBatch() multiple updates are followed one after another..