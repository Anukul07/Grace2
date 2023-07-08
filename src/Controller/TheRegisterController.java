/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Aryan
 */
import DAO.RegistrationDAO;
import Model.TheRegistrationModel;
import View.LoginPageView;
import View.RegistrationPageView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;


public class TheRegisterController implements ActionListener {
    TheRegistrationModel model;
    RegistrationPageView view;
    RegistrationDAO dao;
    ResultSet rs;
    PreparedStatement pst=null;
        public TheRegisterController(RegistrationPageView view , RegistrationDAO dao,TheRegistrationModel model)
        {
            this.view=view;
            this.model=model;
            this.dao=dao;
            view.LoginBtn.addActionListener(this);
            view.RegisterBtn.addActionListener(this);
 
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.LoginBtn){
            LoginPageView login = new LoginPageView();
            view.dispose();
            login.setVisible(true);
            
        }
        
        if(e.getSource()==view.RegisterBtn){
            model.setName(view.NameText.getText());
            model.setEmail(view.emailText4.getText());
            model.setPasswd(view.PasswordText.getText());
            model.setConf_pass(view.ConfirmpassText.getText());
            model.setContact(view.ContactText.getText());
//            if(dao.RegisterData(model)){
//                JOptionPane.showMessageDialog(null, "Registered sucessfully", "Message", JOptionPane.INFORMATION_MESSAGE);
//            }
//            else{
//                JOptionPane.showMessageDialog(null,"Registration failed", "ERROR", JOptionPane.ERROR_MESSAGE);
//            }
        }
    }

    
}

