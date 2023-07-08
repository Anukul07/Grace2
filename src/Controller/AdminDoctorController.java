/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Aryan
 */
import DAO.AdminDoctorDAO;
import Model.AdminDoctorModel;
import View.AdminDoctor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class AdminDoctorController implements ActionListener {
    AdminDoctorDAO doctor;
    AdminDoctor view;
    AdminDoctorModel model;
    JButton button;
    JTable jTable;
    public  AdminDoctorController(AdminDoctorDAO dao,AdminDoctorModel mod, AdminDoctor view){
        this.doctor=dao;
        this.view=view;
        this.model=mod;
//        this.button=view.ClearBtn;
        this.view.RegisterBtn.addActionListener(this);
        this.view.UpdateBtn.addActionListener(this);
        this.view.DeleteBtn.addActionListener(this);
//        this.view.ClearBtn.addActionListener(this);
        this.view.ViewBtn.addActionListener(this);
        this.jTable=view.Table;
        
        
    }
    
      public void start()
    {
        view.setTitle("Doctor Registration");
        view.setLocationRelativeTo(null);
        refreshTable(); // Refresh the table initially
        reset();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==view.RegisterBtn){
            model.setName(view.NameText.getText());
            model.setId(Integer.parseInt(view.DIDtext.getText().trim()));
            model.setAge(Integer.parseInt(view.AgeText.getText().trim()));
            model.setSex(view.comboSex.getSelectedItem().toString());
            model.setEmail(view.EmailText.getText());
            model.setDateofBirth(view.DOBtext.getText());
            model.setAddress(view.AddressText.getText());
            model.setContactNo(view.ContactText.getText());
            model.setDepartment(view.comboDep.getSelectedItem().toString());
            model.setDate(Integer.parseInt(view.DateofJoinText.getText().trim()));
            model.setBloodGroup(view.comboBldGrp.getSelectedItem().toString());
          
//              if(doctor.add(model))
//                {
//                    JOptionPane.showMessageDialog(null, "Added Successfully");
//                    reset();
//                    refreshTable();
//                    
//                } else {
//                    JOptionPane.showMessageDialog(null, "Cannot be Added");
//                    reset();
//                }
            
        }
        
        if(e.getSource()==view.UpdateBtn){
            model.setName(view.NameText.getText());
            model.setId(Integer.parseInt(view.DIDtext.getText().trim()));
            model.setAge(Integer.parseInt(view.AgeText.getText().trim()));
            model.setSex(view.comboSex.getSelectedItem().toString());
            model.setEmail(view.EmailText.getText());
            model.setDateofBirth(view.DOBtext.getText());
            model.setAddress(view.AddressText.getText());
            model.setContactNo(view.ContactText.getText());
            model.setDepartment(view.comboDep.getSelectedItem().toString());
            model.setDate(Integer.parseInt(view.DateofJoinText.getText().trim()));
            model.setBloodGroup(view.comboBldGrp.getSelectedItem().toString());
          
//            if(doctor.update(model)){
//                 JOptionPane.showMessageDialog(null, "Updated Successfully");
//                    reset();
//                    refreshTable();
//            }
                
            
        }
        if(e.getSource()==view.DeleteBtn){
            if (CheckID()) {
                model.setId(Integer.parseInt(view.SearchID.getText().trim()));
                
                
                if(doctor.delete(model))
                {
                    JOptionPane.showMessageDialog(null, "Deleted Successfully");
                    refreshTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Error in Deleting");
                    
                }   
            }
        }
         if(e.getSource() == view.ViewBtn)
        {
           if (CheckID()) {
                model.setId(Integer.parseInt(view.SearchID.getText().trim())); 
                
                if(doctor.searchData(model))
                {
                    view.DIDtext.setText(String.valueOf(model.getId()));
                    view.NameText.setText(model.getName());
                    view.AgeText.setText(String.valueOf(model.getAge()));
                    view.comboDep.setSelectedItem(model.getDepartment());
                    view.comboBldGrp.setSelectedItem(String.valueOf(model.getBloodGroup()));
                    view.DateofJoinText.setText(String.valueOf(model.getDate()));
                    view.AddressText.setText(model.getAddress());
                    view.ContactText.setText(model.getContactNo());
                    view.EmailText.setText(model.getEmail());
                    view.DOBtext.setText(model.getDateofBirth());
                    view.comboSex.setSelectedItem(model.getSex());
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No Record Found");
                    reset();
                }   
                refreshTable();
           }   
        }
            
        
//         if(e.getSource()==view.ClearBtn){
//             view.Idtext.setText(" ");
//             view.NameText.setText(" ");
//             view.AgeText.setText(" ");
//             view.Date.setText(" ");
//             view.Department.setText(" ");
//             view.BloodGroupText.setText(" ");
//             view.AddressText.setText(" ");
//             view.ContactText.setText(" ");
//             view.EmailText.setText(" ");
//             view.SexText.setText(" ");
//             view.DateofBirthText.setText(" ");
//         }
        
        
    }
    private boolean CheckID() {
        if (view.SearchID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter ID.");
            return false;
        }
        else{
            
        }
        
        return true;
    }
    
      
    public boolean verifyField() {
        if (view.NameText.getText().isEmpty() || view.AgeText.getText().isEmpty()||view.comboSex.getSelectedItem().equals(" ")
                || view.comboBldGrp.getSelectedItem().equals(" ") || view.comboDep.getSelectedItem().equals(" ")
                || view.DIDtext.getText().isEmpty() || view.DateofJoinText.getText().isEmpty() ||view.ContactText.getText().isEmpty()
                || view.EmailText.getText().isEmpty() || view.AddressText.getText().isEmpty() || view.DOBtext.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty.");
            return false;
         }
        return true;
     }
     
    public void reset(){
             view.DIDtext.setText(" ");
             view.NameText.setText(" ");
             view.AgeText.setText(" ");
             view.DateofJoinText.setText(" ");
             view.comboBldGrp.setSelectedItem(" ");
             view.comboDep.setSelectedItem(" ");
             view.AddressText.setText(" ");
             view.ContactText.setText(" ");
             view.EmailText.setText(" ");
             view.comboSex.setSelectedItem(" ");
             view.DOBtext.setText(" ");
    }
    
    
     public boolean refreshTable() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0); 

        AdminDoctorDAO dao = new AdminDoctorDAO();
        List<AdminDoctorModel> datas = dao.getAllData(); 
        if (datas.isEmpty()){
            return false;
        }

        for (AdminDoctorModel data : datas) {
            Object[] row = {data.getId(), data.getName(), data.getAge(),
                    data.getBloodGroup(),
                    data.getDepartment(), data.getDate()};
            model.addRow(row);
            
        
        }
        return true;
    }
    
}
