/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import View.TheLoginView;
import Model.TheLoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 *
 * @author anukul
 */
public class TheLoginController {
    TheLoginView logview;
    TheLoginModel logmod;
    ResultSet rs;
    Statement stmt;
    public TheLoginController(TheLoginView logview){
        this.logview=logview;
        logview.addLoginListener(new LoginListener());
    }
    
    class LoginListener implements ActionListener{
        
       
        @Override
        public void actionPerformed(ActionEvent e){
            
            try{
                logmod=logview.getUser();   
                if(checkUser(logmod)){       
                    logview.setMessage("Login Successfully");
                }
                else{
                    logview.setMessage("Invalid User");
                    
                }
                           
        
            }
            catch(Exception e1){
                System.out.println(e1.getMessage());
                
            }
        }
         public boolean checkUser(TheLoginModel user) throws Exception{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","calm");
            String query="select * from registration where email='"+user.getEmail()+"' AND Passwd='"+user.getPassword()+"'";
            try{
                stmt=conn.createStatement();
                rs=stmt.executeQuery(query);
                if (rs.next()){
                    return true;
                }
                conn.close();
                
            }
            catch(Exception e2){
                System.out.println(e2.getMessage());
                
            }
           return false;
         }


    }
    
    
}

