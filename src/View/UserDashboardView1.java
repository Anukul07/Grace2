/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Statement;
import Model.TheLoginModel;
import Controller.UserDashboardController;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;


/**
 *
 * @author ghimi
 */
public class UserDashboardView1 extends javax.swing.JFrame {
    public ResultSet rs;
    TheLoginModel logm;
   UserDashboardController usc=new UserDashboardController();
   
    public UserDashboardView1() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
    
    public void addBtnListener(ActionListener Log){
        Logout.addActionListener(Log);
        
    }
   

  
      public void closeWin(){
        WindowEvent winclose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }
     
   
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        ClinicName = new javax.swing.JLabel();
        ClinicName2 = new javax.swing.JLabel();
        UserLogo = new javax.swing.JLabel();
        Patient = new javax.swing.JButton();
        DoctorBtn = new javax.swing.JButton();
        Services = new javax.swing.JButton();
        UserText = new javax.swing.JLabel();
        Rooms = new javax.swing.JButton();
        Billing = new javax.swing.JButton();
        Staff = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        Refreshbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 199, 180));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        ClinicName.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ClinicName.setText("GRACE CARE");

        ClinicName2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ClinicName2.setText("CLINIC");

        UserLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N

        Patient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Patient1.png"))); // NOI18N
        Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientActionPerformed(evt);
            }
        });

        DoctorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Doctor1.png"))); // NOI18N
        DoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorBtnActionPerformed(evt);
            }
        });

        Services.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Services1.png"))); // NOI18N
        Services.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicesActionPerformed(evt);
            }
        });

        UserText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserText.setText("USER");

        Rooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms1.png"))); // NOI18N
        Rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsActionPerformed(evt);
            }
        });

        Billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Billing1.png"))); // NOI18N
        Billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingActionPerformed(evt);
            }
        });

        Staff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Staff1.png"))); // NOI18N
        Staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffActionPerformed(evt);
            }
        });

        Logout.setText("LOGOUT");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        Refreshbtn.setText("Refresh");
        Refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClinicName2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(UserLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(UserText)
                                .addGap(84, 84, 84))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Refreshbtn)
                        .addGap(18, 18, 18)
                        .addComponent(Logout)
                        .addGap(26, 26, 26))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Patient, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(218, 218, 218)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Billing, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Services, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Staff, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ClinicName)
                        .addGap(6, 6, 6)
                        .addComponent(ClinicName2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UserLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Logout)
                            .addComponent(Refreshbtn))))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Patient, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Services, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Billing, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Staff, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Testing 'Patient' button");

    }//GEN-LAST:event_PatientActionPerformed

    private void DoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Testing 'Doctor' button");
    }//GEN-LAST:event_DoctorBtnActionPerformed

    private void ServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Testing 'Service' button");
    }//GEN-LAST:event_ServicesActionPerformed

    private void RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Testing 'Rooms' button");
    }//GEN-LAST:event_RoomsActionPerformed

    private void BillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Testing 'Billing' button");
    }//GEN-LAST:event_BillingActionPerformed

    private void StaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Testing 'Staff' button");
    }//GEN-LAST:event_StaffActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        UserDashboardController controller = new UserDashboardController();
        controller.LogoutactionPerformed(this);
        UserText.setText(" ");
        
    //        closeWin();
        
    }//GEN-LAST:event_LogoutActionPerformed

    private void RefreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshbtnActionPerformed
        this.setVisible(false);
       this.setVisible(true);
        UserDashboardController usc=new UserDashboardController();
        usc.UpdateUserDisplay(UserText);
    }//GEN-LAST:event_RefreshbtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UserDashboardView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboardView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboardView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboardView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new UserDashboardView1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Billing;
    private javax.swing.JLabel ClinicName;
    private javax.swing.JLabel ClinicName2;
    private javax.swing.JButton DoctorBtn;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Patient;
    private javax.swing.JButton Refreshbtn;
    private javax.swing.JButton Rooms;
    private javax.swing.JButton Services;
    private javax.swing.JButton Staff;
    private javax.swing.JLabel UserLogo;
    private javax.swing.JLabel UserText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
