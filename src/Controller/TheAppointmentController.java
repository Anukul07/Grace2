/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.TheAppointmentModel;
import View.TheAppointment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * TheAppointmentController class
 * Handles appointment scheduling and user data insertion into the database.
 * Author: Abhisek Mgr
 */
public class TheAppointmentController {

    TheAppointmentModel model;
    TheAppointment view;
    ResultSet rs;
    PreparedStatement pst;

    public void appoinmentScheduleBtn(TheAppointment theappointment) {
        try {
            model = theappointment.getAppointment();
            
            if (checkUser(model)) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public boolean checkUser(TheAppointmentModel user) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb", "root", "");

            // Perform validation checks
            if (user.getName().isEmpty() || user.getAge().isEmpty() || user.getSex().isEmpty()
                    || user.getContact().isEmpty() || user.getEmail().isEmpty()
                    || user.getDepartment().isEmpty() || user.getDoctor().isEmpty()) {
                System.out.println("Empty fields");
                return false; 
            }

            String sql = "INSERT INTO appointment(Name, Age, Sex, Contact, Email, Department, Doctor) VALUES (?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, user.getName());
            pst.setString(2, user.getAge());
            pst.setString(3, user.getSex());
            pst.setString(4, user.getContact());
            pst.setString(5, user.getEmail());
            pst.setString(6, user.getDepartment());
            pst.setString(7, user.getDoctor());

            pst.executeUpdate();
            pst.close();
            conn.close();

            return true;
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
            return false;
        }
    }
}
