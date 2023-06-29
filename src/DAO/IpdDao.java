/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
import Model.IPDModel;

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
}
