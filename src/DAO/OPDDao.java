/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author dilasha
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OPDDao {
    public void insertQuery(String OPD_No, String Patient_Name, String Age, String Blood_Grp, String Department, String Policy_No) {
        try {
            try (Connection conn = DbConnection.connect()) {
                String query = "insert into opd_registration (OPD_No, Patient_Name, Age, Blood_Grp, Department, Policy_No) values (?,?,?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(query);
                
                pst.setInt(1, Integer.parseInt(OPD_No));
                pst.setString(2, Patient_Name);
                pst.setString(3, Age);
                pst.setString(4, Blood_Grp);
                pst.setString(5, Department);
                pst.setString(6, Policy_No);

                pst.executeUpdate();
                
            }
        }
        catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
    
    public void viewByIdQueryOPD(DefaultTableModel model, String opdNo) {
        try (
                Connection conn = DbConnection.connect(); 
                PreparedStatement pst = conn.prepareStatement("SELECT * FROM opd_registration WHERE OPD_No = ?")) {

            pst.setString(1, opdNo);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("OPD_No"),
                    rs.getString("Patient_Name"),
                    rs.getString("Age"),
                    rs.getString("Blood_Grp"),
                    rs.getString("Department"),
                    rs.getString("Policy_No")
                });
            }
        } 
        
        catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
