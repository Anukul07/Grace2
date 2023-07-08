/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aryan
 */
public class UserStaffDAO {
    
    
public void viewQueryStaffAvailability(DefaultTableModel model) {
    try (Connection conn = DbConnection.connect();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM staffs")) {

        while (rs.next()) {
            model.addRow(new Object[] {
                    rs.getString("StaffID"),
                    rs.getString("Name"),
                    rs.getString("Age"),
                    rs.getString("BloodGroup"),
                    rs.getString("Department"),
                    rs.getString("DateofJoin")
            });
        }
    } catch (SQLException e) {
        System.out.println("Something went wrong: " + e.getMessage());
        e.printStackTrace();
    }
}
    
    
}
