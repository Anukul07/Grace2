/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.TheLoginModel;
import Controller.TheLoginController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author anukul
 */

public class TheLoginView extends javax.swing.JFrame {

    TheLoginModel logMod;
    TheLoginView viewlog;

    public TheLoginView() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void delay() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void he() {
        UserDashboardView1 dv = new UserDashboardView1();  //creating object to call method
      
        try {
            delay();
//            dv.msgboxPop();
        } catch (Exception e) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        emailText = new javax.swing.JTextArea();
        loginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        passwordText = new javax.swing.JTextArea();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(192, 199, 180));
        setSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(null);

        bgPanel.setBackground(new java.awt.Color(192, 199, 180));
        bgPanel.setForeground(new java.awt.Color(95, 148, 115));
        bgPanel.setMaximumSize(new java.awt.Dimension(1440, 1024));
        bgPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        bgPanel.setName(""); // NOI18N
        bgPanel.setPreferredSize(new java.awt.Dimension(1440, 1024));
        bgPanel.setLayout(null);

        loginLabel.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        loginLabel.setText("LOGIN");
        bgPanel.add(loginLabel);
        loginLabel.setBounds(790, 160, 117, 84);

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        emailLabel.setText("Email");
        bgPanel.add(emailLabel);
        emailLabel.setBounds(580, 300, 94, 40);

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        passwordLabel.setText("Password");
        bgPanel.add(passwordLabel);
        passwordLabel.setBounds(570, 400, 166, 40);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        emailText.setBackground(new java.awt.Color(223, 230, 216));
        emailText.setColumns(20);
        emailText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        emailText.setRows(5);
        jScrollPane5.setViewportView(emailText);

        bgPanel.add(jScrollPane5);
        jScrollPane5.setBounds(890, 300, 313, 43);

        loginButton.setBackground(new java.awt.Color(62, 117, 83));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(217, 217, 217));
        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        bgPanel.add(loginButton);
        loginButton.setBounds(710, 650, 246, 59);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("If you are a new user:");
        bgPanel.add(jLabel2);
        jLabel2.setBounds(570, 500, 197, 53);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("CLINIC");
        bgPanel.add(jLabel3);
        jLabel3.setBounds(220, 110, 108, 36);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("GRACE CARE");
        bgPanel.add(jLabel7);
        jLabel7.setBounds(220, 60, 220, 40);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        passwordText.setBackground(new java.awt.Color(223, 230, 216));
        passwordText.setColumns(20);
        passwordText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        passwordText.setRows(5);
        jScrollPane6.setViewportView(passwordText);

        bgPanel.add(jScrollPane6);
        jScrollPane6.setBounds(890, 400, 313, 43);

        registerButton.setBackground(new java.awt.Color(62, 117, 83));
        registerButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        registerButton.setForeground(new java.awt.Color(223, 230, 216));
        registerButton.setText("REGISTER");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        bgPanel.add(registerButton);
        registerButton.setBounds(890, 500, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        bgPanel.add(jLabel1);
        jLabel1.setBounds(40, 40, 151, 135);

        getContentPane().add(bgPanel);
        bgPanel.setBounds(0, 0, 1550, 1030);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//validating user
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        TheLoginController lc = new TheLoginController();
        lc.actionPerformed(this);
    }//GEN-LAST:event_loginButtonActionPerformed

    public TheLoginModel getUser() {
        logMod = new TheLoginModel(emailText.getText(), passwordText.getText());
        return logMod;
    }

    public void setMessage(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void addLoginListener(ActionListener log) {
        loginButton.addActionListener(log);
    }

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        TheRegistrationView rv = new TheRegistrationView();
        rv.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_registerButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TheLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheLoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextArea emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextArea passwordText;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
