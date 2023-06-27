/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import Model.TheLoginModel;
import View.UserDashboardView1;
import javax.swing.JLabel;

/**
 *
 * @author Aryan
 */
public class UserDashboardController {
    PreparedStatement pst;
    public TheLoginModel logmod;
    static public ResultSet rs;
     
    static public void UpdateUserDisplay(JLabel field){
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","scooby019");
         Statement stmt=conn.createStatement();
         String query3="select userName from registration where status= 1";
         rs=stmt.executeQuery(query3);
         
         
        if (rs.next()) {
                String labelText = rs.getString("userName");
                System.out.println(labelText);
                field.setText(labelText);
                
            }
       
         
        }
        catch(Exception f){
            
        }
    }
    public void LogoutactionPerformed(UserDashboardView1 ud){
        
         try{
               
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","scooby019");
            Statement stmt=conn.createStatement();
            String query3="select * from registration where status= 1";
            rs=stmt.executeQuery(query3);
         
         
            if (rs.next()) {
                String query="update registration set status='"+0+"' ";
                pst=conn.prepareStatement(query);
                pst.executeUpdate(query);
               
            }   
         }
         catch(Exception f){
            
         }
    
    }
}
    

    

