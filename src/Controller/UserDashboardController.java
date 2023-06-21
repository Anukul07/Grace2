/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import Model.TheLoginModel;

/**
 *
 * @author Aryan
 */
public class UserDashboardController {
    PreparedStatement pst;
    public TheLoginModel logmod;
    public void userLogout(){
         try{
         System.out.println(logmod.getEmail());
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","ishiki123");
         String query="update registration set status='"+0+"' where email='"+logmod.getEmail()+"'";

         pst=conn.prepareStatement(query);
         pst.executeUpdate(query);
//         stat=conn.createStatement();
//         String sql ="update registration set status='"+true+"' where email='"+logmod.getEmail()+"'";
//         stat.executeUpdate(sql);
        }
        catch(Exception f){
            
        }
    }
    
}
