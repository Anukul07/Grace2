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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class TheLoginController implements ActionListener, MouseListener {

    public int count = 0;
    LoginPageView logview;
    TheLoginModel logmod;
    LoginDAO logindao;
    boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

//    public TheLoginController(LoginDAO dao, LoginPageView view, TheLoginModel mod) {
//        this.logview = view;
//        this.logmod = mod;
//        this.logindao = dao;
//        logview.LoginBtn.addActionListener(this);
//        logview.Signupbtn.addMouseListener(this);
//
//    }
       public TheLoginController(LoginDAO dao, LoginPageView view, TheLoginModel mod) {
        this.logview = view;
        this.logmod = mod;
        this.logindao = dao;
        logview.LoginBtn.addActionListener(this);
        logview.Signupbtn.addMouseListener(this);

    }
       
       

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == logview.LoginBtn) {
            if (checkEmpty()) {
                logmod.setEmail(logview.EmailText.getText());
                logmod.setPassword(logview.txtpassword.getText());
//                if (logindao.LoginVerify(logmod, logview)) {
//                    System.out.println("Login successful");
//                   
//                }
//
//                 else {
//                JOptionPane.showMessageDialog(null, "Invalid credentials");
//                }

            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == logview.Signupbtn) {
            RegistrationPageView rv = new RegistrationPageView();
            rv.setVisible(true);
            logview.dispose();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public boolean checkEmpty() {

     if (logview.txtpassword.getText().isEmpty() || logview.EmailText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
            return false;

        }
     return true;

    }

}
