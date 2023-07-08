/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.AdminStaffRegistrationModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**

/**
 *
 * @author dilasha
 */
public class AdminStaffRegistrationDAO {
    public void insertQuery(String StaffID, String Name, String Age, String BloodGroup, String Department, String DateofJoin){
        try {
            try (Connection conn = DbConnection.connect()) {
                String query = "INSERT INTO staffs(StaffID, Name, Age, BloodGroup, Department, DateofJoin) VALUES (?,?,?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(query);
                
                pst.setInt(1, Integer.parseInt(StaffID));                
                pst.setString(2, Name);
                pst.setString(3, Age);
                pst.setString(4, BloodGroup);
                pst.setString(5, Department);
                pst.setString(6, DateofJoin);
                
                pst.executeUpdate();
                conn.commit();
            }
        }
        catch(SQLException e) 
        {
            System.out.println("Something went wrong : "+ e.getMessage());
        }     
    }
    
    
    public void updateQuery(String StaffID, String Name, String Age, String BloodGroup, String Department, String DateofJoin) {
        try (Connection conn = DbConnection.connect()) {
            String query = "UPDATE staffs SET Name = ?, Age = ?, BloodGroup = ?, Department = ?, DateofJoin = ? WHERE StaffID = ?";
            try (PreparedStatement pst = conn.prepareStatement(query)) {
                
                pst.setString(1, Name);
                pst.setString(2, Age);
                pst.setString(3, BloodGroup);
                pst.setString(4, Department);
                pst.setString(5, DateofJoin);
                pst.setString(6, StaffID);

                pst.executeUpdate();
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }


    public void deleteQuery(String StaffID){
        try{
            Connection conn = DbConnection.connect();
            String query = "DELETE FROM staffs WHERE StaffID = ?";
            
            PreparedStatement pst = conn.prepareStatement(query);
            
                pst.setInt(1, Integer.parseInt(StaffID));                
             
            pst.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println("Something went wrong :"+e.getMessage());
        } 
    }
    
    public AdminStaffRegistrationModel viewQuery(String StaffID) throws SQLException{
   
        try {
            Connection conn = DbConnection.connect();
            String query = "SELECT StaffID, Name, Age, BloodGroup, Department, DateofJoin FROM staffs WHERE StaffID = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, StaffID);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String id = rs.getString("StaffID");
                String name = rs.getString("Name");
                String age = rs.getString("Age");
                String bloodGroup = rs.getString("BloodGroup");
                String department = rs.getString("Department");
                String dateOfJoin = rs.getString("DateofJoin");

                return new AdminStaffRegistrationModel(id, name, age, bloodGroup, department, dateOfJoin);
            }
        }
        catch (SQLException e)
        {
            System.out.println("Something went wrong :"+e.getMessage());
        } 
        return null;
    }
}