/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
import Model.IPDModel;
import javax.swing.table.DefaultTableModel;

public class IpdDao {

                 
    public boolean insert(IPDModel user) throws Exception{
        
        try {
            Connection conn = DbConnection.connect();
            PreparedStatement pst=null;
            
            String sql = "insert into ipd_registration (IPD_No, Patient_Name, Age, Blood_Grp, Department, Policy_No) values (?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
                      
            pst.setString(1, user.getIPD_No());
            pst.setString(2, user.getPatient_Name());
            pst.setString(3, user.getAge());
            pst.setString(4, user.getBlood_Grp());
            pst.setString(5, user.getDepartment());
            pst.setString(6, user.getPolicy_No());
                
           pst.executeUpdate();
             
                
           JOptionPane.showMessageDialog(null, "Data registered Successfully!");
        }
            
        catch (Exception e2) {
           System.out.println(e2.getMessage());
        }
        return false;
    }
    
    public void viewByIdQueryIPD(DefaultTableModel model, String ipdNo) {
        try (
                Connection conn = DbConnection.connect(); 
                PreparedStatement pst = conn.prepareStatement("SELECT * FROM ipd_registration WHERE IPD_No = ?")) {

            pst.setString(1, ipdNo);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("IPD_No"),
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
