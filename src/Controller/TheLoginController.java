/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;



import View.TheLoginView;
import Model.TheLoginModel;
import View.AdminDashboard;
import View.UserDashboardView;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import DAO.LoginDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TheLoginController implements ActionListener {
    public int count=0;
    TheLoginView logview;
    TheLoginModel logmod;
    LoginDAO logindao;
   
    
    public TheLoginController(LoginDAO dao,TheLoginView view, TheLoginModel mod){
        this.logview=view;
        this.logmod=mod;
        this.logindao=dao;
        logview.loginButton.addActionListener(this);
        logview.registerButton.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==logview.loginButton){
            logmod.setEmail(logview.emailText.getText());
            logmod.setPassword(logview.passwordText.getText());
            if(logindao.LoginVerify(logmod, logview)){
                System.out.println("Login successful");
                
            }
            else{
                System.out.println("Login failed");
            }
            
            
        }
        if(e.getSource()==logview.registerButton){
            
        }
       
        
        
        
    }
    public void msgpopUp(String Message){
        JOptionPane.showMessageDialog(null, Message);
    }
   
    
    
//    public void UpdateStatus(TheLoginModel logmod){
//        try{
//         Class.forName("com.mysql.cj.jdbc.Driver");
//         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","ishiki123");
//         String query="update registration set status='"+1+"' where email='"+logmod.getEmail()+"'";
//         pst=conn.prepareStatement(query);
//         pst.executeUpdate(query);
//
//        }
//        catch(Exception f){
//            
//        }
//     }
    
    }

