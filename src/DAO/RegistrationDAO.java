/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.TheRegistrationModel;
import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author Aryan
 */
public class RegistrationDAO {
    PreparedStatement pst;
    
        public boolean RegisterData(TheRegistrationModel mod) {
        try {
         
            Connection conn = DbConnection.connect();
            String sql="insert into registration(userName,Passwd,conf_password,email,contact_no) values(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, mod.getName());
            pst.setString(2, mod.getPasswd());
            pst.setString(3, mod.getConf_pass());
            pst.setString(4, mod.getEmail());
            pst.setString(5, mod.getContact());
            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            

        }

        return false; // Added a default return statement outside the try-catch block
    }
    
}
