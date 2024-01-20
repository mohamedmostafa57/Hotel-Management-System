package com.example.login2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author hocin
 */
public class DbConnect {



    private static String HOST = "127.0.0.1";

    private static int PORT = 3306;
    private static String DB_NAME = "hotel_manager";
    private static String USERNAME = "root";
    private static final String url = "jdbc:mysql://localhost:3306/" + DB_NAME;
    private static String PASSWORD = "";
    private static Connection connection;

    public static Connection connectDB;

    public static void database_connect(){
        connectDB=DbConnect.getConnect();
    }

    public static Connection getConnect() {
        try {
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }


}