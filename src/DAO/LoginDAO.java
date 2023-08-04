/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.TheLoginModel;
import View.AdminDashboard;
import View.LoginPageView;
import View.UserDashboardView1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author Aryan
 */
public class LoginDAO {
    public int count=0;
    
    public boolean LoginVerify(TheLoginModel model, LoginPageView view) {

        try {
            if (model.getEmail().equals("aryan@gmail.com") && model.getPassword().equals("ishiki123") || 
       model.getEmail().equals("anukul@gmail.com") && model.getPassword().equals("anukul123") ||
       model.getEmail().equals("dilasha@gmail.com") && model.getPassword().equals("dilasha123") ||
       model.getEmail().equals("diya@gmail.com") && model.getPassword().equals("diya123")||
       model.getEmail().equals("abhishek@gmail.com") && model.getPassword().equals("abhishek123")){
                JOptionPane.showMessageDialog(null, "Logged in as an admin","Sucess",JOptionPane.INFORMATION_MESSAGE);
                AdminDashboard Ad = new AdminDashboard();
                Ad.setVisible(true);
                view.dispose();
                count -= 1;
                return true;

            } else {
                count += 2;

            }
            System.out.println(count);
            if (count >= 1) {

                if (checkData(model)) {
                    try {
                        setUserstatus(model);
                JOptionPane.showMessageDialog(null, "Logged in as a user","Sucess",JOptionPane.INFORMATION_MESSAGE);

                        UserDashboardView1 dash= new UserDashboardView1();
                        dash.setVisible(true);
                        view.dispose();
                        

                    } catch (Exception e1) {
                        System.out.println(e1);

                    }
                    return true;
                } else {

                }
            } else {

            }

        } catch (Exception e2) {
            System.out.println(e2.getMessage());

        }
        return false;

    }
    public boolean checkData(TheLoginModel user) {
     try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb", "root", "ishiki123");

        String query = "select * from registration where email='" + user.getEmail() + "' AND Passwd='" + user.getPassword() + "'";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(user.getEmail());
            System.out.println(user.getPassword());
            if (rs.next()) {
                return true;

            }
            conn.close();

        } catch (Exception e3) {
            System.out.println(e3.getMessage());

        }
     }
     catch(Exception e){
         
     }
        return false;
    
    
    }
    
    
          public void setUserstatus(TheLoginModel mod) {
        try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb", "root", "ishiki123");
            String query3 = "update registration set status=1 where email=?";
            pst = conn.prepareStatement(query3);
            pst.setString(1, mod.getEmail());
            pst.executeUpdate();


        } catch (Exception f) {

        }

    }
      
   

}
