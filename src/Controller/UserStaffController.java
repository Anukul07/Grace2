/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.UserStaffDAO;
import View.UserStaffView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aryan
 */
public class UserStaffController implements ActionListener{
    UserStaffView view;
    
    public UserStaffController(UserStaffView view){
        this.view=view;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.ViewAllButton) {
            DefaultTableModel model = (DefaultTableModel) view.ViewTable.getModel();
            model.setRowCount(0);
            UserStaffDAO staffAvailability = new UserStaffDAO();
            staffAvailability.viewQueryStaffAvailability(model);
        }

    }
    
    
}
