package com.satya.jdbc;

import java.sql.*; // Imports Connection, Statement, etc.

public class ExecuteAll {
    public static void main(String[] args) {
        Connection con = null;
        Statement statement = null;
        try {

            con =JdbcUtility.getConnection();

            if (con != null) {
                System.out.println("Connection Established with Docker MySQL!");
            }

             statement = con.createStatement();
//        String sql_query = "UPDATE studentInfo set sage = 20 where id = 2";
            String sql_query = "SELECT * FROM studentInfo";

            boolean status = statement.execute(sql_query);

            if (status) {
                ResultSet data = statement.getResultSet();//represents the table data from the database!
                System.out.println("Student details: ");
                while (data.next()) {
                    int id = data.getInt(1); // we have to write index of the column!
                    String name = data.getString("sname");
                    int age = data.getInt("sage");
                    String city = data.getString(4);
                    System.out.println("Student id : " + id + "\n name : " + name + ", age : " + age + ", City : " + city);
                }
            } else {
                int row_affect = statement.getUpdateCount();

                if (row_affect == 0) {
                    System.out.println("unable to perform  operation!");
                } else {
                    System.out.println("successfully performed and rows are effected : " + row_affect);
                }

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

                JdbcUtility.closeConnection(con,statement);
            }
        }
    }
