/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;



import View.TheLoginView;
import Model.TheLoginModel;
import View.TheRegistrationView;
import View.UserDashboardView;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class TheLoginController {
    public int count=0;
    TheLoginView logview;
    public TheLoginModel logmod;
    UserDashboardView uv;
    PreparedStatement pst;
    Statement stat;
    
    
    public void UpdateStatus(){
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","ishiki123");
         String query="update registration set status='"+1+"' where email='"+logmod.getEmail()+"'";
         pst=conn.prepareStatement(query);
         pst.executeUpdate(query);
//         stat=conn.createStatement();
//         String sql ="update registration set status='"+true+"' where email='"+logmod.getEmail()+"'";
//         stat.executeUpdate(sql);
        }
        catch(Exception f){
            
        }
     }
    
   
    
    public void actionPerformed(TheLoginView logview){
        this.logview=logview;
        
            try{
               
                logmod=logview.getUser();
                
                if (logmod.getEmail().equals("aryan@gmail.com") && logmod.getPassword().equals("ISHIKI123")){
                    JOptionPane.showMessageDialog(null, "Logged in as an admin");
                    TheRegistrationView rv= new TheRegistrationView();
                    rv.setVisible(true);
                    count-=1;
                   
                }
                else{
                    count+=2;
                    
                    
                }
                System.out.println(count);
                if(count>=1){
                       
                    if(checkUser(logmod)){       
                        logview.setMessage("Login Successfully");
                    
                    try{
                        logview.he();
                        logview.dispose();
                        UpdateStatus();
                        
                    }
                    catch(Exception e1){
                        
                    }
                }    
                  
                    else{
                        logview.setMessage("Invalid User");
                    
                    }
                }
                else{
                    
                }
        
            }
            catch(Exception e2){
                System.out.println(e2.getMessage());
                
            }
      
    }
        public boolean checkUser(TheLoginModel user) throws Exception{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root","ishiki123");
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
