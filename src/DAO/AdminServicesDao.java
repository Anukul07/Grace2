/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import View.AdminServicesRegistrationView;
import java.sql.ResultSet;

/**
 *
 * @author anukul
 */
public class AdminServicesDao {
    public void insertQuery(String serviceName, String serviceCharge){
        try {
            try (Connection conn = DbConnection.connect()) {
                String query = "INSERT INTO services(ServiceName,ServiceCharge) VALUES (?,?)";
                PreparedStatement pst = conn.prepareStatement(query);
                
                pst.setString(1,serviceName);
                pst.setInt(2,Integer.parseInt(serviceCharge));
                pst.executeUpdate();
            }
        }catch(SQLException e) {
            System.out.println("Something went wrong : "+ e.getMessage());
        }     
    }
    public void deleteQuery(String ServicesId){
        try{
            Connection conn = DbConnection.connect();
            String query = "DELETE FROM services WHERE ServicesId = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1,Integer.parseInt(ServicesId));
            pst.executeUpdate();
            
        }catch (SQLException e){
            System.out.println("Something went wrong :"+e.getMessage());
        } 
    }
   
}
