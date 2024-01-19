package com.example.nbastats;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class test {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/nbastats";
        String user = "user1";
        String password = "Champ0213!";
    
    try{
        Connection conn=DriverManager.getConnection(url, user, password);
        System.out.println("Connected to the MySQL server successfully.");
        conn.close();

    }catch(SQLException e){
        System.out.println("Error connecting to MySQL database");
        e.printStackTrace();
    }

}
}