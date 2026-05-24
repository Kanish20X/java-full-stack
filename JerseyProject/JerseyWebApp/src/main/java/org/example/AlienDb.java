package org.example;

import jakarta.annotation.Nullable;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlienDb {

    static List<Alien> aliens;

    static{

        aliens = new ArrayList<>();
        Alien obj = new Alien();
        obj.setId(1);
        obj.setName("Satya");
        Alien obj1 = new Alien();
        obj1.setId(2);
        obj1.setName("Sam");
        aliens.add(obj);
        aliens.add(obj1);


    }

    public List<Alien> getAliens() {
        return aliens;
    }

    @Nullable
    public static Alien getAlien(int id) {
        for (Alien a : aliens) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
    public static void create(Alien alien){
        aliens.add(alien);

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


