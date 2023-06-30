/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.TheLoginModel;
import View.UserDashboardView1;
import javax.swing.JLabel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
\ */
public class UserDashboardDAO {
     PreparedStatement pst;
//    public List<TheLoginModel> UpdateUserdisplay(TheLoginModel mod,UserDashboardView1 view,JLabel label){
//         List<TheLoginModel> data = new ArrayList<>();
//        try{
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","ishiki123");
//         String query3="select userName from registration where email=?";
//         pst=conn.prepareStatement(query3);
//         pst.setString(1, mod.getEmail());
//         rs=pst.executeQuery();
//         
//         
//        while(rs.next()) {
//            TheLoginModel model = new TheLoginModel();
//            model.setEmail(rs.getString("userName"));
//            data.add(model);
////            view.setLocationRelativeTo(null);
////                String labelText = rs.getString("userName");
////                System.out.println(labelText);
////                label.setText(labelText);
//                
//            }
//       
//         
//        }
//        catch(Exception f){
//            
//        }
//        return data;
//    }
//         public void LogoutactionPerformed(TheLoginModel mod){
//        
//         try{
//            PreparedStatement pst=null;
//            ResultSet rs = null;
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","ishiki123");
//            String query3="select * from registration where status= 1";
//            pst=conn.prepareStatement(query3);
//            pst.set
//            rs=pst.executeQuery();
//         
//         
//            if (rs.next()) {
//                String query="update registration set status='"+0+"' ";
//                pst=conn.prepareStatement(query);
//                pst.executeUpdate(query);
//               
//            }   
//         }
//         catch(Exception f){
//            
//         }
//    
//    }
  

   

}
