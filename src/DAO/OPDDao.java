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
import javax.swing.JOptionPane;

public class OPDDao {
    public void insertQuery(String OPD_No, String Patient_Name, String Age, String Blood_Grp, String Department, String Policy_No) {
        try {
            try (Connection conn = DbConnection.connect()) {
                String query = "insert into opd_registration (OPD_No, Patient_Name, Age, Blood_Grp, Department, Policy_No) values (?,?,?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(query);
                
                pst.setString(1, OPD_No);
                pst.setString(2, Patient_Name);
                pst.setString(3, Age);
                pst.setString(4, Blood_Grp);
                pst.setString(5, Department);
                pst.setString(6, Policy_No);

                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Data registered Successfully!");
            }
        }
        catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
