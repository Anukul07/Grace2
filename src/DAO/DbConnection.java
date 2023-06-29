/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author anukul
 */
public class DbConnection {
    static Connection conn = null;
    public static Connection connect(){
        String userName = "root";
        String password = "cerebralcorpse00";

        
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gracedb",userName,password);
        } catch (SQLException ex) {
            System.out.println("Something went wrong" + ex.getMessage());
        }
        return conn;
         
    }
}
