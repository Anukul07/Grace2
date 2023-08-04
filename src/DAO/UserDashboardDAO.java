/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.UserDashboardModel;
import View.UserDashboardView1;
import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
\ */
public class UserDashboardDAO {
      UserDashboardView1 view;
    JLabel label;
    UserDashboardModel model;
    
    public UserDashboardDAO(UserDashboardView1 view,JLabel label,UserDashboardModel mod){
        this.view=view;
        this.label=label;
        this.model=mod;
        UpdateUsername(mod);
        
    }

       public void UpdateUsername(UserDashboardModel mod) {
        try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb", "root", "ishiki123");
            String query3 = "select userName from registration where status=1";
            pst = conn.prepareStatement(query3);
           
            rs = pst.executeQuery();

            if (rs.next()) {
                mod.setUsername(rs.getString("userName"));
                view.changeUsername(mod);

            }

        } catch (Exception f) {

        }
        

    }
       
           public void setOffline(){
            try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb", "root", "ishiki123");
            String query3 = "Update registration set status=0 where status=1";
            pst = conn.prepareStatement(query3);
            pst.executeUpdate();
            }
            catch(Exception e){
                
            }
       }


   

}
