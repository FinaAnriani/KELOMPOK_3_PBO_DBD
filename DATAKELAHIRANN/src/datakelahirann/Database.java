/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datakelahirann;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ASUS
 */
public class Database {
    public Connection connection;
    public Statement statement;
    public ResultSet resultset;
    
    public static Connection mysqlconfig;
    public static Connection configDB(){
        try {
             String url = "jdbc:mysql://localhost:3306/keluarga";
            String user = "root";
            String password = "";
            Database.mysqlconfig = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Koneksi gagal"+e.getMessage());                    
        }
        return Database.mysqlconfig;
    } 
    
        public static void main(String[] args) {
        Database db = new Database();
        }

}
