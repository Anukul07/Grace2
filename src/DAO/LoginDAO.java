/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Controller.UserDashboardController;
import Model.TheLoginModel;
import View.AdminDashboard;
import View.TheLoginView;
import View.UserDashboardView1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aryan
 */
public class LoginDAO {
    public int count=0;
    
    public boolean LoginVerify(TheLoginModel model, TheLoginView view) {

        try {
            if (model.getEmail().equals("aryan@gmail.com") && model.getPassword().equals("ishiki123")) {
                JOptionPane.showMessageDialog(null, "Logged in as an admin");
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
                        JOptionPane.showMessageDialog(null, "Logged in as an user!");
                        UpdateUserdisplay(model);
                        UserDashboardView1 dash= new UserDashboardView1();
                        dash.changeUsername(model);
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
    public boolean checkData(TheLoginModel user) throws Exception {

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
        return false;
    
    
    }
    
    
      public List<TheLoginModel> UpdateUserdisplay(TheLoginModel mod) {
        List<TheLoginModel> data = new ArrayList<>();
        try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb", "root", "ishiki123");
            String query3 = "select userName from registration where email=?";
            pst = conn.prepareStatement(query3);
            pst.setString(1, mod.getEmail());
            System.out.println(mod.getEmail());
            rs = pst.executeQuery();

            if (rs.next()) {
                mod.setUsername(rs.getString("userName"));
                System.out.println(mod.getUsername());
                data.add(mod);

            }

        } catch (Exception f) {

        }
        return data;

    }
      
   

}
