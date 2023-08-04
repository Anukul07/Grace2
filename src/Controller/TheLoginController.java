/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.TheLoginModel;
import DAO.LoginDAO;
import View.LoginPageView;
import View.RegistrationPageView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class TheLoginController implements ActionListener {

    public int count = 0;
    LoginPageView logview;
    TheLoginModel logmod;
    LoginDAO logindao;


       public TheLoginController(LoginDAO dao, LoginPageView view, TheLoginModel mod) {
        this.logview = view;
        this.logmod = mod;
        this.logindao = dao;
        logview.LoginBtn.addActionListener(this);
        logview.Signupbtn.addActionListener(this);

    }
       
       

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == logview.LoginBtn) {
            if (checkEmpty()) {
                logmod.setEmail(logview.EmailText.getText());
                logmod.setPassword(logview.txtpassword.getText());
                if (logindao.LoginVerify(logmod, logview)) {
                    System.out.println("Login successful");
                   
                }

                 else {
                JOptionPane.showMessageDialog(null, "Invalid credentials","Error",JOptionPane.ERROR_MESSAGE);
                }

            }

        }
         if (e.getSource() == logview.Signupbtn) {
            RegistrationPageView rv = new RegistrationPageView();
            rv.setVisible(true);
            logview.dispose();
        }
    }

   

  

    public boolean checkEmpty() {

     if (logview.txtpassword.getText().isEmpty() || logview.EmailText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty","Error" , JOptionPane.ERROR_MESSAGE);
            return false;

        }
     return true;

    }

}
