/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JFrame;
import Model.TheLoginModel;
import Controller.UserDashboardController;
import DAO.UserDashboardDAO;
import Model.UserDashboardModel;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


/**
 *
 * @author ghimi
 */
public class UserDashboardView1 extends javax.swing.JFrame {
    public UserDashboardView1(){
     initComponents();
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setVisible(true);
     TheLoginModel logm = new TheLoginModel();
    UserDashboardModel model = new UserDashboardModel();
    UserDashboardDAO udao = new UserDashboardDAO(this,UserText,model);
    UserDashboardController usc=new UserDashboardController(udao,logm,this);
    this.revalidate();
    this.repaint();
   
       
        
    }
   
    
     public UserDashboardModel changeUsername(UserDashboardModel mod) {
        System.out.println(mod.getUsername());
        UserText.setText(mod.getUsername());
        return mod;
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
        PatientBtn = new javax.swing.JButton();
        DoctorBtn = new javax.swing.JButton();
        Servicesbtn = new javax.swing.JButton();
        UserText = new javax.swing.JLabel();
        Roomsbtn = new javax.swing.JButton();
        Billingbtn = new javax.swing.JButton();
        Staffbtn = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 199, 180));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        ClinicName.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ClinicName.setText("GRACE CARE");

        ClinicName2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ClinicName2.setText("CLINIC");

        UserLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N

        PatientBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Patient1.png"))); // NOI18N
        PatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientBtnActionPerformed(evt);
            }
        });

        DoctorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Doctor1.png"))); // NOI18N
        DoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorBtnActionPerformed(evt);
            }
        });

        Servicesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Services1.png"))); // NOI18N
        Servicesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicesbtnActionPerformed(evt);
            }
        });

        UserText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserText.setText("USER");

        Roomsbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rooms1.png"))); // NOI18N
        Roomsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsbtnActionPerformed(evt);
            }
        });

        Billingbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Billing1.png"))); // NOI18N
        Billingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingbtnActionPerformed(evt);
            }
        });

        Staffbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Staff1.png"))); // NOI18N
        Staffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffbtnActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(62, 117, 83));
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("LOGOUT");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
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
                        .addComponent(Logout)
                        .addGap(67, 67, 67))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Roomsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(218, 218, 218)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Billingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Servicesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Staffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(Logout)))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Servicesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Roomsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Billingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Staffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void PatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientBtnActionPerformed
       

    }//GEN-LAST:event_PatientBtnActionPerformed

    private void DoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorBtnActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_DoctorBtnActionPerformed

    private void ServicesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicesbtnActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_ServicesbtnActionPerformed

    private void RoomsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsbtnActionPerformed
        // TODO add your handling code here:
        TheRoomAvailability userview = new TheRoomAvailability();
        userview.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_RoomsbtnActionPerformed

    private void BillingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingbtnActionPerformed
        // TODO add your handling code here:
        BillingView view = new BillingView();
        view.setVisible(true);
        this.dispose();
   
    }//GEN-LAST:event_BillingbtnActionPerformed

    private void StaffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffbtnActionPerformed
        
    }//GEN-LAST:event_StaffbtnActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
       
        
   
        
    }//GEN-LAST:event_LogoutActionPerformed

  
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
    public javax.swing.JButton Billingbtn;
    private javax.swing.JLabel ClinicName;
    private javax.swing.JLabel ClinicName2;
    public javax.swing.JButton DoctorBtn;
    private javax.swing.JLabel Logo;
    public javax.swing.JButton Logout;
    public javax.swing.JButton PatientBtn;
    public javax.swing.JButton Roomsbtn;
    public javax.swing.JButton Servicesbtn;
    public javax.swing.JButton Staffbtn;
    private javax.swing.JLabel UserLogo;
    public javax.swing.JLabel UserText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
