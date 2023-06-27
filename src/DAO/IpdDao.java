/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

<<<<<<< HEAD
import MyConnection.*;
=======
/*import MyConnection.*;
>>>>>>> 3dc79e30ee702cf6e17fb7316108b49571f6ab70
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
<<<<<<< HEAD
import Model.IPDModel;
=======
import Model.IPDModel;*/
>>>>>>> 3dc79e30ee702cf6e17fb7316108b49571f6ab70

//public class IpdDao extends DbConnection{
//    Connection conn = null;
//    PreparedStatement pst=null;
//    DbConnection db = new DbConnection();
                 
//    public boolean checkUser(IPDModel user) throws Exception{
//        try {
//               
//            String sql = "insert into ipd_registration (IPD_No, Patient_Name, Age, Blood_Grp, Department, Policy_No) values (?,?,?,?,?,?)";
//            pst=conn.prepareStatement(sql);
//                      
//            pst.setString(1, user.getIPD_No());
//            pst.setString(2, user.getPatient_Name());
//            pst.setString(3, user.getAge());
//            pst.setString(4, user.getBlood_Grp());
//            pst.setString(5, user.getDepartment());
//            pst.setString(6, user.getPolicy_No());
//                
//            pst.executeUpdate();
//              
//                
//            JOptionPane.showMessageDialog(null, "Data registered Successfully!");
//        }
//            
//        catch (Exception e2) {
//            System.out.println(e2.getMessage());
//        }
//        return false;
//    }
//}
