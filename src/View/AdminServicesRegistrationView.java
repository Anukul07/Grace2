/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import Controller.AdServicesRegistrationController;
import Model.AdminServicesRegistrationModel;
import OptionPaneUI.ByIDFieldEmpty;
import OptionPaneUI.DeletedSuccessfully;
import OptionPaneUI.FieldsEmpty;
import OptionPaneUI.RegisteredSuccessfully;
import OptionPaneUI.UpdatedSuccessfully;
import javax.swing.JFrame;
/**
 *
 * @author anukul
 */
public class AdminServicesRegistrationView extends javax.swing.JFrame {
    AdminServicesRegistrationModel adModel;
    /**
     * Creates new form AdminServicesRegistration
     */
    public AdminServicesRegistrationView() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);


        ViewTable.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 16));
        ViewTable.getTableHeader().setOpaque(false);
        ViewTable.getTableHeader().setForeground(new Color(44,107,120));
    }
    public AdminServicesRegistrationModel getInsertData(){
        adModel = new AdminServicesRegistrationModel(serviceNameTxt.getText(),serviceChargeTxt.getText());
        return adModel;
    }
    public AdminServicesRegistrationModel getUpdateData(){
        adModel = new AdminServicesRegistrationModel(byNumberTxt.getText(),serviceNameTxt.getText(),serviceChargeTxt.getText());
        return adModel;
    }
    public AdminServicesRegistrationModel getDeleteData(){
         adModel = new AdminServicesRegistrationModel(byNumberTxt.getText());
         return adModel;
    }
    public AdminServicesRegistrationModel getViewData(){
        adModel = new AdminServicesRegistrationModel(byNumberTxt.getText(),serviceNameTxt.getText(),serviceChargeTxt.getText());
        return adModel;
    }
    public void insertServicesListener(ActionListener log) {
        RegisterButton.addActionListener(log);
    }
    public void deleteServicesListener(ActionListener log) {
        DeleteButton.addActionListener(log);
    }
    public void updateServicesListener(ActionListener log) {
        UpdateButton.addActionListener(log);
    }
    public void viewServicesListener(ActionListener log){
        ViewButton.addActionListener(log);
    }
     private void resetText(){
        serviceNameTxt.setText("");
        byNumberTxt.setText("");
        serviceChargeTxt.setText("");
    }
    private boolean isEmptyInsert() {
        return serviceNameTxt.getText().isEmpty() || serviceChargeTxt.getText().isEmpty();
    }
     private boolean isEmptyUpdate() {
        return serviceNameTxt.getText().isEmpty()||byNumberTxt.getText().isEmpty() || serviceChargeTxt.getText().isEmpty();
    }

    private boolean isEmptyDelete() {
        return byNumberTxt.getText().isEmpty();
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
        RegisterButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        serviceNameTxt = new javax.swing.JTextField();
        serviceChargeTxt = new javax.swing.JTextField();
        byNumberTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ViewTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(162, 186, 190));

        RegisterButton.setBackground(new java.awt.Color(24, 85, 98));
        RegisterButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton.setText("REGISTER");
        RegisterButton.setBorder(null);
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        UpdateButton.setBackground(new java.awt.Color(24, 85, 98));
        UpdateButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        ViewButton.setBackground(new java.awt.Color(24, 85, 98));
        ViewButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        ViewButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewButton.setText("VIEW");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(24, 85, 98));
        DeleteButton.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin-Services.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Service Charge");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel3.setText("By ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setText("Service Name");

        serviceNameTxt.setBackground(new java.awt.Color(174, 200, 204));

        serviceChargeTxt.setBackground(new java.awt.Color(174, 200, 204));
        serviceChargeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceChargeTxtActionPerformed(evt);
            }
        });

        byNumberTxt.setBackground(new java.awt.Color(174, 200, 204));
        byNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byNumberTxtActionPerformed(evt);
            }
        });

        ViewTable.setBackground(new java.awt.Color(174, 200, 204));
        ViewTable.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        ViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Service ID", "Service Name", "Service Charge"
            }
        ));
        jScrollPane2.setViewportView(ViewTable);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(serviceNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(serviceChargeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(byNumberTxt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serviceNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(serviceChargeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(byNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteButton)
                    .addComponent(ViewButton))
                .addGap(134, 134, 134))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void serviceChargeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceChargeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceChargeTxtActionPerformed

    private void byNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byNumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_byNumberTxtActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        if(isEmptyInsert()){
                FieldsEmpty view = new FieldsEmpty();
                view.setVisible(true);        
        }
        else {
            AdServicesRegistrationController adControl = new AdServicesRegistrationController();
            adControl.RegisterButtonActionPerformed(this);
            RegisteredSuccessfully view = new RegisteredSuccessfully();
            view.setVisible(true);            
            resetText();
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        if(isEmptyDelete()){
            ByIDFieldEmpty view = new ByIDFieldEmpty();
            view.setVisible(true);      
        }
        else{
            AdServicesRegistrationController adControl = new AdServicesRegistrationController();
            adControl.DeleteButtonActionPerformed(this);
            DeletedSuccessfully view = new DeletedSuccessfully();
            view.setVisible(true);        
        }
        resetText();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        if(isEmptyUpdate()){
                FieldsEmpty view = new FieldsEmpty();
                view.setVisible(true);        
        }
        else{
            AdServicesRegistrationController adControl = new AdServicesRegistrationController();
            adControl.UpdateButtonActionPerformed(this);
            UpdatedSuccessfully view = new UpdatedSuccessfully();
            view.setVisible(true);
        }
        resetText();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        // TODO add your handling code here:
        AdServicesRegistrationController adControl = new AdServicesRegistrationController();
        adControl.ViewButtonActionPerformed(this);
        
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminServicesRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminServicesRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminServicesRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminServicesRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminServicesRegistrationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton ViewButton;
    public javax.swing.JTable ViewTable;
    private javax.swing.JTextField byNumberTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField serviceChargeTxt;
    private javax.swing.JTextField serviceNameTxt;
    // End of variables declaration//GEN-END:variables
}
