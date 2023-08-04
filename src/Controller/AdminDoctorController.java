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
import OptionPaneUI.*;
import View.AdminDoctor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public AdminDoctorController(AdminDoctorDAO dao, AdminDoctorModel mod, AdminDoctor view) {
        this.doctor = dao;
        this.view = view;
        this.model = mod;
//        this.button=view.ClearBtn;
        this.view.RegisterBtn.addActionListener(this);
        this.view.UpdateBtn.addActionListener(this);
        this.view.DeleteBtn.addActionListener(this);
        this.view.ViewBtn.addActionListener(this);
        this.jTable = view.Table;
        view.comboBldGrp.setSelectedIndex(-1);
        view.comboDep.setSelectedIndex(-1);
        view.comboSex.setSelectedIndex(-1);

    }

    public void start() {
        view.setTitle("Doctor Registration");
        view.setLocationRelativeTo(null);
        refreshTable(); // Refresh the table initially
        reset();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.RegisterBtn) {
            if (verifyField() && dataVerify()) {
                model.setName(view.NameText.getText());
                model.setId(view.DIDtext.getText().trim());
                model.setAge(view.AgeText.getText().trim());
                model.setSex(view.comboSex.getSelectedItem().toString());
                model.setEmail(view.EmailText.getText());
                model.setDateofBirth(view.DOBtext.getText());
                model.setAddress(view.AddressText.getText());
                model.setContactNo(view.ContactText.getText());
                model.setDepartment(view.comboDep.getSelectedItem().toString());
                model.setDate(view.DateofJoinText.getText().trim());
                model.setBloodGroup(view.comboBldGrp.getSelectedItem().toString());

                if (doctor.add(model)) {
                    RegisteredSuccessfully register = new RegisteredSuccessfully();
                    register.setVisible(true);
                    reset();
                    refreshTable();

                } else {
                    JOptionPane.showMessageDialog(null, "Cannot be Added");

                }

            } else {

            }
        }

            if (e.getSource() == view.UpdateBtn) {
                if (verifyField() && dataVerify()) {
                    model.setName(view.NameText.getText());
                    model.setId(view.DIDtext.getText().trim());
                    model.setAge(view.AgeText.getText().trim());
                    model.setSex(view.comboSex.getSelectedItem().toString());
                    model.setEmail(view.EmailText.getText());
                    model.setDateofBirth(view.DOBtext.getText());
                    model.setAddress(view.AddressText.getText());
                    model.setContactNo(view.ContactText.getText());
                    model.setDepartment(view.comboDep.getSelectedItem().toString());
                    model.setDate(view.DateofJoinText.getText().trim());
                    model.setBloodGroup(view.comboBldGrp.getSelectedItem().toString());

                    if (doctor.update(model)) {
                        UpdatedSuccessfully update = new UpdatedSuccessfully();
                        update.setVisible(true);
                        reset();
                        refreshTable();

                    } else {

                    }

                } else {

                }
            }
            if (e.getSource() == view.DeleteBtn) {
                if (CheckID()) {
                    model.setId(view.SearchID.getText().trim());

                    if (doctor.delete(model)) {
                        DeletedSuccessfully delete = new DeletedSuccessfully();
                        delete.setVisible(true);
                        refreshTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error in Deleting");

                    }
                }
            }
            if (e.getSource() == view.ViewBtn) {
                if (CheckID()) {
                    model.setId(view.SearchID.getText().trim());

                    if (doctor.searchData(model)) {
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

        
    }

    private boolean CheckID() {
        if (view.SearchID.getText().isEmpty()) {
            ByIDFieldEmpty id = new ByIDFieldEmpty();
            id.setVisible(true);
            return false;
        }

        return true;
    }

    public boolean verifyField() {
        if (view.NameText.getText().isEmpty() || view.AgeText.getText().isEmpty() || view.comboSex.getSelectedIndex() == -1
                || view.comboBldGrp.getSelectedIndex() == -1 || view.comboDep.getSelectedIndex() == -1
                || view.DIDtext.getText().isEmpty() || view.DateofJoinText.getText().isEmpty() || view.ContactText.getText().isEmpty()
                || view.EmailText.getText().isEmpty() || view.AddressText.getText().isEmpty() || view.DOBtext.getText().isEmpty()) {
            FieldsEmpty field = new FieldsEmpty();
            field.setVisible(true);
            return false;

        } else {

        }
        return true;
    }

    public void reset() {
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
        if (datas.isEmpty()) {
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


    public boolean dataVerify() {
        String contact = view.ContactText.getText().trim();
        String id = view.DIDtext.getText().trim();
        String age = view.AgeText.getText().trim();
        String bldgrp = (String) view.comboBldGrp.getSelectedItem();
        String sex = (String) view.comboSex.getSelectedItem();
        String department = (String) view.comboDep.getSelectedItem();
        String dob = view.DOBtext.getText().trim();
        String joinDate = view.DateofJoinText.getText().trim();

        if (!view.EmailText.getText().contains("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Invalid email", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (contact.length() != 10 || !isValidNumber(contact)) {
            JOptionPane.showMessageDialog(null, "Invalid contact number", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (bldgrp == null) {
            JOptionPane.showMessageDialog(null, "Please select a blood group", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (sex == null) {
            JOptionPane.showMessageDialog(null, "Please select your gender", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (department == null) {
            JOptionPane.showMessageDialog(null, "Please select your department", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!isValidNumber(id)) {
            JOptionPane.showMessageDialog(null, "Invalid ID number", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!isValidNumber(age)) {
            JOptionPane.showMessageDialog(null, "Invalid age", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if(!dob.contains("-")){
            JOptionPane.showMessageDialog(null, "Invalid DOB format", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if(!joinDate.contains("-")){
            JOptionPane.showMessageDialog(null, "Invalid Date of join format", "Warning", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        

        // If none of the above conditions are met, all validations are successful
        return true;
    }

// Helper method to check if a string contains only digits
    private boolean isValidNumber(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}
