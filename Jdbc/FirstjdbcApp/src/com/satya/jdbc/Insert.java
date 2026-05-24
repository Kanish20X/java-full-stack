package com.satya.jdbc;

import java.sql.*; // Imports Connection, Statement, etc.

public class Insert {
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
            System.out.println("Connection Established with Docker MySQL!");
        }
        //creating a statement is our next job
        Statement statement = con.createStatement();

        // execute the query
        String sql_query = "INSERT INTO studentInfo(id,sname,sage,scity)VALUES(9,'Hepsi-bro',22,'HYDERABAD')";
        int row_affected =statement.executeUpdate(sql_query);// returns a integer value that actually defines the no the rows effected.
        if(row_affected !=0){
            System.out.println("Successfully inserted");
        }
        else{
            System.out.println("unable to insert the data");
        }
        // process the result
        // Close connection when done
        statement.close();
        con.close();
    }
}