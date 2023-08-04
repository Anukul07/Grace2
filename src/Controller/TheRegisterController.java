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
    PreparedStatement pst = null;

    public TheRegisterController(RegistrationPageView view, RegistrationDAO dao, TheRegistrationModel model) {
        this.view = view;
        this.model = model;
        this.dao = dao;
        view.LoginBtn.addActionListener(this);
        view.RegisterBtn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.LoginBtn) {
            LoginPageView login = new LoginPageView();
            view.dispose();
            login.setVisible(true);

        }

        if (e.getSource() == view.RegisterBtn) {
            model.setName(view.NameText.getText());
            model.setEmail(view.emailText4.getText());
            model.setPasswd(view.PasswordText.getText());
            model.setConf_pass(view.ConfirmpassText.getText());
            model.setContact(view.ContactText.getText());
            if (verifyField() && dataVerify()) {
                if (dao.RegisterData(model)) {
                    JOptionPane.showMessageDialog(null, "Registered sucessfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                    resetText();
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {

            }
        }
    }

    public boolean verifyField() {
        if (view.NameText.getText().isEmpty() || view.emailText4.getText().isEmpty()
                || view.PasswordText.getText().isEmpty() || view.ConfirmpassText.getText().isEmpty()
                || view.ContactText.getText().isEmpty()) {
            return false;
        } else {

        }
        return true;

    }

    public boolean dataVerify() {
        String password = view.PasswordText.getText().trim();
        String confPassword = view.ConfirmpassText.getText().trim();

        //check if the email contact correct format and correct length
        if (view.emailText4.getText().contains("@gmail.com") == false) {
            JOptionPane.showMessageDialog(null, "Invalid email", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (view.ContactText.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Invalid contact number", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!password.equals(confPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords not matching", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        //removes if the contact text field contains any spaces and returns the input text 
        String contact = view.ContactText.getText().trim();

        // Check if the contact number has exactly 10 digits and contains only numeric characters
        if (contact.matches("[0-9]{10}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid contact number", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public void resetText() {
        view.NameText.setText(" ");
        view.emailText4.setText(" ");
        view.PasswordText.setText(" ");
        view.ConfirmpassText.setText(" ");
        view.ContactText.setText(" ");

    }

}
