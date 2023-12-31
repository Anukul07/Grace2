/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.TheAppointmentModel;
import Controller.TheAppointmentController;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhisek Mgr
 */
public class TheAppointmentView extends javax.swing.JFrame {

    TheAppointmentModel model;

    public TheAppointmentView() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public TheAppointmentModel getAppointment() {
        model = new TheAppointmentModel(appoinmentName.getText(), appoinmentAge.getText(), appointmentSex.getSelectedItem().toString(), appoinmentContact.getText(), appoinmentEmail.getText(), appoinmentDepartment.getText(), appoinmentDoctor.getText(), appoinmentDate.getText(), appoinmentTime.getText());
        return model;
    }

    public void resetTextFields() {
        appoinmentName.setText("");
        appoinmentAge.setText("");
        appoinmentContact.setText("");
        appoinmentEmail.setText("");
        appoinmentDepartment.setText("");
        appoinmentDoctor.setText("");
        appoinmentDate.setText("  dd/mm/yyyy  ");
        appoinmentTime.setText("  hh/mm  ");
    }

private boolean fieldsEmpty() {
    return appoinmentName.getText().isEmpty()
            || appoinmentAge.getText().isEmpty()
            || appoinmentContact.getText().isEmpty()
            || appoinmentEmail.getText().isEmpty()
            || appoinmentDepartment.getText().isEmpty()
            || appoinmentDate.getText().trim().isEmpty() || appoinmentDate.getText().trim().equals("dd/mm/yyyy")
            || appoinmentTime.getText().trim().isEmpty() || appoinmentTime.getText().trim().equals("hh/mm");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        appoinmentName = new javax.swing.JTextField();
        appoinmentAge = new javax.swing.JTextField();
        appoinmentContact = new javax.swing.JTextField();
        appoinmentEmail = new javax.swing.JTextField();
        appoinmentDepartment = new javax.swing.JTextField();
        appoinmentDoctor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        appoinmentSex = new javax.swing.JLabel();
        appointmentSex = new javax.swing.JComboBox<>();
        appoinmentDate = new javax.swing.JTextField();
        appoinmentTime = new javax.swing.JTextField();
        appoinmentScheduleBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        appoinmentBack = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 198, 180));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("APPOINTMENT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel3.setText("Age");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setText("Contact");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setText("Department");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel7.setText("Consultant Doctor");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel8.setText("Date");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel9.setText("Time");

        appoinmentName.setBackground(new java.awt.Color(223, 230, 216));
        appoinmentName.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        appoinmentName.setForeground(new java.awt.Color(102, 102, 102));

        appoinmentAge.setBackground(new java.awt.Color(223, 230, 216));
        appoinmentAge.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        appoinmentAge.setForeground(new java.awt.Color(102, 102, 102));
        appoinmentAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appoinmentAgeActionPerformed(evt);
            }
        });

        appoinmentContact.setBackground(new java.awt.Color(223, 230, 216));
        appoinmentContact.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        appoinmentContact.setForeground(new java.awt.Color(102, 102, 102));
        appoinmentContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appoinmentContactActionPerformed(evt);
            }
        });

        appoinmentEmail.setBackground(new java.awt.Color(223, 230, 216));
        appoinmentEmail.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        appoinmentEmail.setForeground(new java.awt.Color(102, 102, 102));

        appoinmentDepartment.setBackground(new java.awt.Color(223, 230, 216));
        appoinmentDepartment.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        appoinmentDepartment.setForeground(new java.awt.Color(102, 102, 102));

        appoinmentDoctor.setBackground(new java.awt.Color(223, 230, 216));
        appoinmentDoctor.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        appoinmentDoctor.setForeground(new java.awt.Color(102, 102, 102));

        appoinmentSex.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        appoinmentSex.setText("Sex");

        appointmentSex.setBackground(new java.awt.Color(223, 230, 216));
        appointmentSex.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        appointmentSex.setForeground(new java.awt.Color(102, 102, 102));
        appointmentSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        appointmentSex.setBorder(null);
        appointmentSex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        appoinmentDate.setBackground(new java.awt.Color(223, 230, 216));
        appoinmentDate.setFont(new java.awt.Font("Candara Light", 0, 20)); // NOI18N
        appoinmentDate.setForeground(new java.awt.Color(102, 102, 102));
        appoinmentDate.setText("  dd/mm/yyyy  ");
        appoinmentDate.setToolTipText("");
        appoinmentDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                appoinmentDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                appoinmentDateFocusLost(evt);
            }
        });
        appoinmentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appoinmentDateActionPerformed(evt);
            }
        });

        appoinmentTime.setBackground(new java.awt.Color(223, 230, 216));
        appoinmentTime.setFont(new java.awt.Font("Candara Light", 0, 20)); // NOI18N
        appoinmentTime.setForeground(new java.awt.Color(102, 102, 102));
        appoinmentTime.setText("  hh/mm  ");
        appoinmentTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                appoinmentTimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                appoinmentTimeFocusLost(evt);
            }
        });
        appoinmentTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appoinmentTimeActionPerformed(evt);
            }
        });

        appoinmentScheduleBtn.setBackground(new java.awt.Color(62, 117, 83));
        appoinmentScheduleBtn.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        appoinmentScheduleBtn.setForeground(new java.awt.Color(255, 255, 255));
        appoinmentScheduleBtn.setText("SCHEDULE");
        appoinmentScheduleBtn.setToolTipText("");
        appoinmentScheduleBtn.setAlignmentY(1.0F);
        appoinmentScheduleBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        appoinmentScheduleBtn.setBorderPainted(false);
        appoinmentScheduleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appoinmentScheduleBtn.setMaximumSize(new java.awt.Dimension(150, 70));
        appoinmentScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appoinmentScheduleBtnActionPerformed(evt);
            }
        });

        appoinmentBack.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        appoinmentBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png"))); // NOI18N
        appoinmentBack.setBorder(null);
        appoinmentBack.setBorderPainted(false);
        appoinmentBack.setContentAreaFilled(false);
        appoinmentBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appoinmentBack.setDefaultCapable(false);
        appoinmentBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appoinmentBackActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo2.png"))); // NOI18N
        jLabel11.setText("Logo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(365, 365, 365)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appoinmentBack, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(appoinmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)
                                .addComponent(appoinmentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(appoinmentSex, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(appointmentSex, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(appoinmentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(appoinmentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(appoinmentDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(appoinmentDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8)
                                .addGap(28, 28, 28)
                                .addComponent(appoinmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel9)
                                .addGap(45, 45, 45)
                                .addComponent(appoinmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(482, 482, 482))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(appoinmentScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(appoinmentBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(appoinmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(appoinmentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appoinmentSex)
                    .addComponent(appointmentSex, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(appoinmentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(appoinmentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(appoinmentDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(appoinmentDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appoinmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appoinmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addComponent(appoinmentScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appoinmentAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appoinmentAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appoinmentAgeActionPerformed

    private void appoinmentContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appoinmentContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appoinmentContactActionPerformed

    private void appoinmentTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appoinmentTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appoinmentTimeActionPerformed

    private void appoinmentBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appoinmentBackActionPerformed
        PatientView pv = new PatientView();
        pv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appoinmentBackActionPerformed

    private void appoinmentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appoinmentDateActionPerformed

    }//GEN-LAST:event_appoinmentDateActionPerformed

    private void appoinmentDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_appoinmentDateFocusGained
        if (appoinmentDate.getText().equals("  dd/mm/yyyy  ")) {
            appoinmentDate.setText("");
            appoinmentDate.setForeground(new Color(102, 102, 102));
            appoinmentDate.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_appoinmentDateFocusGained

    private void appoinmentDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_appoinmentDateFocusLost
        if (appoinmentDate.getText().equals("")) {
            appoinmentDate.setText("  dd/mm/yyyy  ");
            appoinmentDate.setForeground(new Color(102, 102, 102));
            appoinmentDate.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        }    }//GEN-LAST:event_appoinmentDateFocusLost

    private void appoinmentTimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_appoinmentTimeFocusGained
        if (appoinmentTime.getText().equals("  hh/mm  ")) {
            appoinmentTime.setText("");
            appoinmentTime.setForeground(new Color(102, 102, 102));
            appoinmentTime.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_appoinmentTimeFocusGained

    private void appoinmentTimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_appoinmentTimeFocusLost
        if (appoinmentTime.getText().equals("")) {
            appoinmentTime.setText("  hh/mm  ");
            appoinmentTime.setForeground(new Color(102, 102, 102));
            appoinmentTime.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_appoinmentTimeFocusLost

    private void appoinmentScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appoinmentScheduleBtnActionPerformed
        TheAppointmentController appointment = new TheAppointmentController();
        appointment.appoinmentScheduleBtn(this);
        if (fieldsEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill all the fields", "Appointment Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registered Successfully", "Appointment Status", JOptionPane.INFORMATION_MESSAGE);
            resetTextFields();
        }

    }//GEN-LAST:event_appoinmentScheduleBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TheAppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheAppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheAppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheAppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheAppointmentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appoinmentAge;
    private javax.swing.JButton appoinmentBack;
    private javax.swing.JTextField appoinmentContact;
    private javax.swing.JTextField appoinmentDate;
    private javax.swing.JTextField appoinmentDepartment;
    private javax.swing.JTextField appoinmentDoctor;
    private javax.swing.JTextField appoinmentEmail;
    private javax.swing.JTextField appoinmentName;
    private javax.swing.JButton appoinmentScheduleBtn;
    private javax.swing.JLabel appoinmentSex;
    private javax.swing.JTextField appoinmentTime;
    private javax.swing.JComboBox<String> appointmentSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
