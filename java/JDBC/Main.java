package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/gestion", "root", "manu");
    }catch(ClassNotFoundException ex){
        System.out.println("Can not load the Driver");

    }
    
}
