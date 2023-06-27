/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author dell
 */
import View.IPDView;
import Model.IPDModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;

public class IPDController {
    IPDModel model;
    IPDView view;
    ResultSet rs;
    PreparedStatement pst;
   
    public void IpdBtnactionPerformed(IPDView ipdview){
         try {
            model = ipdview.getUser();
            checkUser(model);
                
            if (checkUser(model)) {
                ipdview.setMessage("Registered Successfully");
            }  
            else {
                System.out.println("error");
            }
        }
            
        catch (Exception e1) {
                
        }
    }
    
    public boolean checkUser(IPDModel user) throws Exception{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
<<<<<<< HEAD
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root", "");  
=======
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root", "scooby019");  
>>>>>>> 3dc79e30ee702cf6e17fb7316108b49571f6ab70
               
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




