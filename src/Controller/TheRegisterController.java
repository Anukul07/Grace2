/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Aryan
 */
import View.TheRegistrationView;
import Model.TheRegistrationModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;


public class TheRegisterController {
    TheRegistrationModel model;
    TheRegistrationView view;
    ResultSet rs;
    PreparedStatement pst=null;
        public TheRegisterController(TheRegistrationView view)
        {
            this.view=view;
            
            view.addLoginListner(new RegisetrListener());
        }
        
    public void myreset()
    {
      
      
    
    }
    class RegisetrListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                model=view.getUser();
                if(checkUser(model))
                {
                    view.setMessage("Registered Successfully");
                    
                }
                
            }
            catch(Exception e1)
            {
                
            }

        }
       
        public boolean checkUser(TheRegistrationModel user) throws Exception
        {
            
try
          {
         Class.forName("com.mysql.cj.jdbc.Driver");

               Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","");
               

               

String sql="insert into registration(userName,Passwd,conf_password,email,contact_no) values(?,?,?,?,?)";
pst = conn.prepareStatement(sql);

// String sql="select * from patient where pname='"+user.getUsername()+"' AND paddress='"+user.getPassword()+"'";
pst.setString(1,user.getName());
pst.setString(2,user.getPasswd());
pst.setString(3,user.getConf_pass());
pst.setString(4,user.getEmail());
pst.setString(5,user.getContact());



pst.executeUpdate();
              System.out.println("Data inserted");
JOptionPane.showMessageDialog(null,"Data Registered Successfully");
          
          }
          catch(Exception e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }
    
}
    
}

