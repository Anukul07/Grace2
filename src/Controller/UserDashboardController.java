/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import java.sql.*;
import Model.TheLoginModel;
import View.UserDashboardView1;
import javax.swing.JLabel;
import DAO.UserDashboardDAO;
import View.PatientView;
import View.TheDoctorView;
import View.UserServiceView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Aryan
 */
public class UserDashboardController implements ActionListener{
    PreparedStatement pst;
    TheLoginModel mod;
    UserDashboardDAO dao;
    UserDashboardView1 view;
    static public ResultSet rs;
    
     public  UserDashboardController(UserDashboardDAO dao,TheLoginModel logmod,UserDashboardView1 view){
        this.dao=dao;
        this.view=view;
        this.mod=logmod;
        this.view.PatientBtn.addActionListener(this);
        this.view.DoctorBtn.addActionListener(this);
        this.view.Staffbtn.addActionListener(this);
        this.view.Servicesbtn.addActionListener(this);
        this.view.Roomsbtn.addActionListener(this);
        this.view.Billingbtn.addActionListener(this);
        this.view.Logout.addActionListener(this);
       
        
       
       
        
        
    }
     @Override
     public void actionPerformed(ActionEvent e){
         if(e.getSource()==view.PatientBtn){
             view.dispose();
             PatientView patient= new PatientView();
             patient.setVisible(true);
             
         }
         if(e.getSource()==view.DoctorBtn){
             TheDoctorView dview = new TheDoctorView();
             dview.setVisible(true);
             view.dispose();
                    
             
         }
         if(e.getSource()==view.Staffbtn){
             
         }
         if(e.getSource()==view.Servicesbtn){
             UserServiceView serviceview =new UserServiceView();
             serviceview.setVisible(true);
             view.dispose();
             
         }
         if(e.getSource()==view.Roomsbtn){
             
         }
         if(e.getSource()==view.Billingbtn){
             
         }
         if(e.getSource()==view.Logout){
             int choice=JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO LOGOUT?", "MESSAGE", JOptionPane.YES_NO_OPTION);
             if(choice==0){
                 view.dispose();
             }
             else{
                 
             }
             
         }
     }
     


}
    

    

