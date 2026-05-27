package org.example;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlienDb {


    static List<Alien> aliens;

    static Connection con =null;

    static { // initially it is use to be a constructor so we have to create a object for that it is a headache process so i just make it static so that i can be easily used in the sub classes
        String URL = "jdbc:mysql://localhost:3306/Student";
        String USER = "root";
        String PASSWORD = "Satya.k123!";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Nonnull
    public static List<Alien> getAliens() { // similarly it is use to be a instance bit changed to static later so that it avoid a 0bj creation..
        List<Alien> aliens = new ArrayList<>();
        String sql_query ="Select * from alien_info";
        try {
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(sql_query);
            while(set.next()){
                Alien a = new Alien();
                a.setId(set.getInt(1));
                a.setName(set.getString(2));
                aliens.add(a);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return aliens;
    }


    public static Alien getAlien(int id) {

        Alien a = new Alien();
        String sql_query ="Select * from alien_info where id="+id;
        try {
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(sql_query);
            if(set.next()){
                a.setId(set.getInt(1));
                a.setName(set.getString(2));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return a;
    }
    public static void create(Alien alien){
//        aliens.add(alien);
        String sql_query ="insert into alien_info(id,name) values(?,?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql_query);
            stmt.setInt(1,alien.getId());
            stmt.setString(2,alien.getName());
           int result = stmt.executeUpdate();
            if(result!=0){
            System.out.println("inserted successfully!");}
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void update(Alien alien){
//        aliens.add(alien);
        String sql_query ="update alien_info set name=? where id = ? ";
        try {
            PreparedStatement stmt = con.prepareStatement(sql_query);
            stmt.setString(1,alien.getName());
            stmt.setInt(2,alien.getId());

            int result = stmt.executeUpdate();
            if(result!=0){
                System.out.println("Updation successfully!");}
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static Alien deleteAlien(int id) {

        Alien a = new Alien();
        String sql_query ="DELETE FROM alien_info WHERE id = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql_query);
            stmt.setInt(1,id);
            stmt.executeUpdate();
            System.out.println("Successfully delete a row / record");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return a;
    }


}

//    Class.forName("com.mysql.cj.jdbc.Driver");
//    private static final String URL = "jdbc:mysql://localhost:3306/your_database_name";
//    private static final String USER = "root";
//    private static final String PASSWORD = "Satya.k123!";
//
//    Connection con;
//
//    {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            con = DriverManager.getConnection(URL,USER,PASSWORD);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }


