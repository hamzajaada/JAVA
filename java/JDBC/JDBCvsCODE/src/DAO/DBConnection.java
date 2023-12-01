package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 3306;
    private static final String DB_NAME = "JDBC";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "";

    private static Connection connection ;

    // connection with database :
    public static Connection getConnection(){
        try{
             connection = DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s", HOST ,PORT,DB_NAME), USER_NAME, PASSWORD);
       
        } catch(SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
