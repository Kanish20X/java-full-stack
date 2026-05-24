package com.satya.jdbc;

import java.sql.*; // Imports Connection, Statement, etc.

public class Retrive {
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
        String sql_query = "SELECT * FROM studentInfo";

        ResultSet data = statement.executeQuery(sql_query);//represents the table data from the database!
        System.out.println("Student details: ");
// we didn't use executeUpdate here because we need the data to be displaced not an affected update from the database!
// we also execute() which return boolean status as true(selection operation) and false(non-selection or row affected operations)
        while(data.next()){
            int id = data.getInt(1); // we have to write index of the column!
            String name = data.getString("sname");
            int age = data.getInt("sage");
            String city = data.getString(4);
            System.out.println("Student id : "+ id +"\n name : " +name + ", age : " +age + ", City : "+city);
        }


        // process the result
        // Close connection when done
        data.close();
        statement.close();
        con.close();
    }
}