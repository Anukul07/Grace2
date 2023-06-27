/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author dilasha
 */

import View.OPDView;
import Model.OPDModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;

public class OPDController {
    OPDModel model;
    OPDView view;
    ResultSet rs;
    PreparedStatement pst;
   
    public void OpdBtnactionPerformed(OPDView opdview){
         try {
            model = opdview.getUser();
            checkUser(model);
                
            if (checkUser(model)) {
                opdview.setMessage("Registered Successfully");
            }  
            else {
                System.out.println("error");
            }
        }
            
        catch (Exception e1) {
                
        }
    }
    
    public boolean checkUser(OPDModel user) throws Exception{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root", "Root1234");  
               
            String sql = "insert into opd_registration (OPD_No, Patient_Name, Age, Blood_Grp, Department, Policy_No) values (?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
                      
            pst.setString(1, user.getOPD_No());
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

