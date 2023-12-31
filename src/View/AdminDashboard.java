/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author Dilasha 
 * 
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();    
        setExtendedState(JFrame.MAXIMIZED_BOTH);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        ClinicName2 = new javax.swing.JLabel();
        ClinicName = new javax.swing.JLabel();
        AdminLogo = new javax.swing.JLabel();
        UserText = new javax.swing.JLabel();
        PatientButton = new javax.swing.JButton();
        DoctorButton = new javax.swing.JButton();
        StaffButton = new javax.swing.JButton();
        ServicesButton = new javax.swing.JButton();
        RoomsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(148, 175, 181));
        jPanel1.setLayout(null);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoNew.png"))); // NOI18N
        jPanel1.add(Logo);
        Logo.setBounds(24, 26, 149, 136);

        ClinicName2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ClinicName2.setText("CLINIC");
        jPanel1.add(ClinicName2);
        ClinicName2.setBounds(200, 120, 108, 36);

        ClinicName.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ClinicName.setText("GRACE CARE");
        jPanel1.add(ClinicName);
        ClinicName.setBounds(200, 70, 220, 40);

        AdminLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.png"))); // NOI18N
        jPanel1.add(AdminLogo);
        AdminLogo.setBounds(1330, 30, 114, 94);

        UserText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserText.setText("         ADMIN");
        UserText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(UserText);
        UserText.setBounds(1310, 130, 130, 25);

        PatientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminPatientButton.png"))); // NOI18N
        PatientButton.setBorder(null);
        PatientButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PatientButton);
        PatientButton.setBounds(510, 700, 490, 150);

        DoctorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDoctorButton.png"))); // NOI18N
        DoctorButton.setBorder(null);
        DoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DoctorButton);
        DoctorButton.setBounds(930, 330, 490, 160);

        StaffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminStaffButton.png"))); // NOI18N
        StaffButton.setBorder(null);
        StaffButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        StaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StaffButton);
        StaffButton.setBounds(110, 520, 470, 160);

        ServicesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminServicesButton.png"))); // NOI18N
        ServicesButton.setBorder(null);
        ServicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ServicesButton);
        ServicesButton.setBounds(930, 520, 490, 160);

        RoomsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminRoomsButton.png"))); // NOI18N
        RoomsButton.setBorder(null);
        RoomsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RoomsButton);
        RoomsButton.setBounds(110, 330, 470, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDesign.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 300, 400, 406);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientButtonActionPerformed
        // TODO add your handling code here:
        AdminPatientView adview = new AdminPatientView();
        adview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PatientButtonActionPerformed

    private void DoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorButtonActionPerformed
        // TODO add your handling code here:
        AdminDoctor admindoctor = new AdminDoctor();
        admindoctor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DoctorButtonActionPerformed

    private void StaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffButtonActionPerformed
        // TODO add your handling code here:
        AdminStaffView adv = new AdminStaffView();
        adv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StaffButtonActionPerformed

    private void ServicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicesButtonActionPerformed
        // TODO add your handling code here:
        AdminServicesRegistrationView adv = new AdminServicesRegistrationView();
        adv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ServicesButtonActionPerformed

    private void RoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsButtonActionPerformed
        // TODO add your handling code here:
        AdminRoomRegistrationView rv = new AdminRoomRegistrationView();
        rv.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_RoomsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLogo;
    private javax.swing.JLabel ClinicName;
    private javax.swing.JLabel ClinicName2;
    private javax.swing.JButton DoctorButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton PatientButton;
    private javax.swing.JButton RoomsButton;
    private javax.swing.JButton ServicesButton;
    private javax.swing.JButton StaffButton;
    private javax.swing.JLabel UserText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
