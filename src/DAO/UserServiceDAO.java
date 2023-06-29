/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.PreparedStatement;
import Model.UserServiceModel;
import javax.swing.JOptionPane;

public class UserServiceDAO extends DbConnection {
    public boolean insertData(UserServiceModel user) {
        PreparedStatement pst = null;
        
        try {

            try(Connection conn = DbConnection.connect()) {

                String sql = "INSERT INTO user_service (service_name, service_date, patient_id, patient_name, patient_charge) VALUES(?,?,?,?,?)";
            
                pst = conn.prepareStatement(sql);
                pst.setString(1, user.getService());
                pst.setString(2, user.getDate());
                pst.setString(3, user.getPatient_ID());
                pst.setString(4, user.getPatient_name());
                pst.setString(5, user.getCharge());
            
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data saved!");
            }
        }
        
        catch(Exception e) {
            System.err.println(e);
        }
        
        return false;
    }
}
