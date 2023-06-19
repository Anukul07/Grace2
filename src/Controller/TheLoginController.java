/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;



import View.TheLoginView;
import Model.TheLoginModel;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TheLoginController {
    TheLoginView logview;
    TheLoginModel logmod;
    
    
    
    public void actionPerformed(TheLoginView logview){
        this.logview=logview;
        
            try{
                logmod=logview.getUser();   
                if(checkUser(logmod)){       
                    logview.setMessage("Login Successfully");
                    try{
                        logview.he();
                        logview.dispose();
                    }
                    catch(Exception e1){
                        
                    }
                }    
                  
                else{
                    logview.setMessage("Invalid User");
                    
                }
                           
        
            }
            catch(Exception e2){
                System.out.println(e2.getMessage());
                
            }
        }
        public boolean checkUser(TheLoginModel user) throws Exception{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","cerebralcorpse00");
            String query="select * from registration where email='"+user.getEmail()+"' AND Passwd='"+user.getPassword()+"'";
            try{
                Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(query);
                System.out.println(user.getEmail());
                System.out.println(user.getPassword());
                if (rs.next()){
                    return true;
                }
                conn.close();
                
            }
            catch(Exception e3){
                System.out.println(e3.getMessage());
                
            }
            return false;
         }


    }
