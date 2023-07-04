/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;



import View.TheLoginView;
import Model.TheLoginModel;
import Model.UserDashboardModel;
import DAO.LoginDAO;
import Model.TheRegistrationModel;
import View.LoginView1;
import View.TheRegistrationView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class TheLoginController implements ActionListener,MouseListener {
    public int count=0;
    LoginView1 logview;
    TheLoginModel logmod;
    LoginDAO logindao;
   
    
    public TheLoginController(LoginDAO dao,LoginView1 view, TheLoginModel mod){
        this.logview=view;
        this.logmod=mod;
        this.logindao=dao;
        logview.LoginBtn.addActionListener(this);
        logview.Signupbtn.addMouseListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==logview.LoginBtn){
            UserDashboardModel umod = new UserDashboardModel();
            logmod.setEmail(logview.EmailText.getText());
            String password = new String(logview.txtpassword.getPassword());
            logmod.setPassword(password);
            if(logindao.LoginVerify(logmod, logview)){
                System.out.println("Login successful");
                
            }
            else{
                System.out.println("Login failed");
            }
            
            
        }
 
        
    }
    
 
   

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==logview.Signupbtn){
            TheRegistrationView rv = new TheRegistrationView();
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
    
    }

