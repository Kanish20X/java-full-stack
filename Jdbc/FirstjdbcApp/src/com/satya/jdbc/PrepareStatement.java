package com.satya.jdbc;

import java.sql.*; // Imports Connection, Statement, etc.
import java.util.Scanner;

public class PrepareStatement {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement preState =null;
        try {

            con =JdbcUtility.getConnection();

            if (con != null) {
                System.out.println("Connection Established with Docker MySQL!");
            }

            JdbcUtility.preState(con);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

            JdbcUtility.closeConnection(con,preState);
        }
    }
}
