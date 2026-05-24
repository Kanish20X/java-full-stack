package com.satya.jdbc;

import java.sql.*; // Imports Connection, Statement, etc.

public class update {
    // We add 'throws Exception' because JDBC operations can fail (wrong password, server down)
    public static void main(String[] args) throws Exception {

        // Step 1: Load and register the driver
        // This tells Java how to talk to MySQL
//        Class.forName("com.mysql.cj.jdbc.Driver"); it loads the static blocks of the driver
        // another way is DriverManager.registerDriver(new .com.sql.jdbc.Driver())....
//        System.out.println("Driver loaded successfully!");

        // Step 2: Establish the connection
        // Use the credentials for the sql server
        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String password = "Satya.k123!";

        Connection con = DriverManager.getConnection(url, user, password);

        if(con != null) {
            System.out.println("Connection Established with MySQL!");
        }
        //creating a statement is our next job
        Statement statement = con.createStatement();
        // execute the query
        String sql_query = "UPDATE studentInfo set sage = 22 where id =1";

        int row_affect = statement.executeUpdate(sql_query);

        if(row_affect==0){
            System.out.println("unable to update the value!");
        }
        else{
            System.out.println("successfully updated!");
        }

        // process the result
        // Close connection when done
        statement.close();
        con.close();
    }
}