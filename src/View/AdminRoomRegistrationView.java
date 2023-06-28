/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.AdRoomRegistrationModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Controller.AdRoomRegistrationController;
import java.awt.event.ActionListener;

/**
 *
 * @author anukul
 */
public class AdminRoomRegistrationView extends javax.swing.JFrame {
    AdRoomRegistrationModel adModel;
    /**
     * Creates new form AdminRoomRegistrationView
     */
    public AdminRoomRegistrationView() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public AdRoomRegistrationModel getData() {
        adModel = new AdRoomRegistrationModel(roomNoTxt.getText(),roomChargeTxt.getText());
        return adModel;
    }
     public AdRoomRegistrationModel getDataUpdate() {
        adModel = new AdRoomRegistrationModel(roomIdTxt.getText(),roomNoTxt.getText(),roomChargeTxt.getText());
        return adModel;
    }
    public AdRoomRegistrationModel getDataDelete() {
        adModel = new AdRoomRegistrationModel(roomIdTxt.getText());
        return adModel;
    }
    public void deleteRoomsListener(ActionListener log) {
        DeleteButton.addActionListener(log);
    }
  
    public void addRoomsListener(ActionListener log) {
        RegisterButton.addActionListener(log);
    }
    public void updateRoomsListener(ActionListener log) {
        UpdateButton.addActionListener(log);
    }
    private boolean isEmpty() {
        return roomNoTxt.getText().isEmpty() || roomChargeTxt.getText().isEmpty();
    }
     private boolean isEmptyUpdate() {
        return roomIdTxt.getText().isEmpty()||roomNoTxt.getText().isEmpty() || roomChargeTxt.getText().isEmpty();
    }
    private boolean isEmptyDelete() {
        return roomIdTxt.getText().isEmpty();
    }
    private void resetText(){
        roomIdTxt.setText("");
        roomNoTxt.setText("");
        roomChargeTxt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.WARNING: Do NOT modify this code.
     * The content of this method is always
 regenerated by the Form Editor.
     * @param log
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RoomRegistrationLogo = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        RoomNoLabel = new javax.swing.JLabel();
        roomChargeTxt = new javax.swing.JTextField();
        RoomChargeLabel = new javax.swing.JLabel();
        roomNoTxt = new javax.swing.JTextField();
        ByNumberLabel = new javax.swing.JLabel();
        roomIdTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 199, 180));

        RoomRegistrationLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RoomRegistrationLogo.png"))); // NOI18N

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png"))); // NOI18N
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        RegisterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RoomRegistrationRegister.png"))); // NOI18N
        RegisterButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegisterButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RoomRegistrationUpdate.png"))); // NOI18N
        UpdateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        ViewButton.setBackground(new java.awt.Color(95, 148, 115));
        ViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RoomRegistrationView.png"))); // NOI18N
        ViewButton.setText("jButton3");
        ViewButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RoomRegistrationDelete.png"))); // NOI18N
        DeleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        RoomNoLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        RoomNoLabel.setText("Room No.");

        roomChargeTxt.setBackground(new java.awt.Color(223, 230, 216));
        roomChargeTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        RoomChargeLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        RoomChargeLabel.setText("Room charge");

        roomNoTxt.setBackground(new java.awt.Color(223, 230, 216));
        roomNoTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        ByNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        ByNumberLabel.setText("By number");

        roomIdTxt.setBackground(new java.awt.Color(223, 230, 216));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RoomRegistrationLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ByNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roomIdTxt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(RoomNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roomNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(RoomChargeLabel)
                        .addGap(32, 32, 32)
                        .addComponent(roomChargeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoomRegistrationLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RoomNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(RoomChargeLabel)
                            .addComponent(roomNoTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(roomChargeTxt))
                        .addGap(79, 79, 79)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roomIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ByNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(77, 77, 77))
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

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Testing 'Back' button");

    }//GEN-LAST:event_BackButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        AdRoomRegistrationController adControl = new AdRoomRegistrationController();
        adControl.RegisterButtonActionPerformed(this);
        if(isEmpty()){
            JOptionPane.showMessageDialog(this, "Fields must be filled");
        }else {
            JOptionPane.showMessageDialog(this, "Rooms registered successfully");
            resetText();
        }

    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        if(isEmptyUpdate()){
            JOptionPane.showMessageDialog(this, "Fields must be filled");
        }else {
            JOptionPane.showMessageDialog(this, "Rooms updated successfully");
            resetText();
        }
        AdRoomRegistrationController adControl = new AdRoomRegistrationController();
        adControl.UpdateButtonActionPerformed(this);

    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Testing 'View' button");

    }//GEN-LAST:event_ViewButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        AdRoomRegistrationController adControl = new AdRoomRegistrationController();
        adControl.DeleteButtonActionPerformed(this);        
        if(isEmptyDelete()){
            JOptionPane.showMessageDialog(this, "By number field must be filled");
        }else {
            JOptionPane.showMessageDialog(this, "Rooms deleted successfully");
            resetText();
        }
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRoomRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRoomRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRoomRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRoomRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRoomRegistrationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ByNumberLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel RoomChargeLabel;
    private javax.swing.JLabel RoomNoLabel;
    private javax.swing.JLabel RoomRegistrationLogo;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton ViewButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField roomChargeTxt;
    private javax.swing.JTextField roomIdTxt;
    private javax.swing.JTextField roomNoTxt;
    // End of variables declaration//GEN-END:variables
}
