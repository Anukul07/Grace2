/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import DAO.AdminDoctorDAO;
import DAO.RegistrationDAO;
import Model.AdminDoctorModel;
import Model.TheRegistrationModel;
import View.AdminDoctor;
import View.RegistrationPageView;
import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aryan
 */
public class AdminDoctorControllerTest {
     AdminDoctor view = new AdminDoctor();
    AdminDoctorDAO dao = new AdminDoctorDAO();
    AdminDoctorModel mod=new AdminDoctorModel();
    
    public AdminDoctorControllerTest() {
        AdminDoctorController controller = new AdminDoctorController( dao,    mod,  view);
    }
    
    @Test
    public void AddDoctorActionPerformed() {
            view.NameText.setText("ryan");
            view.DIDtext.setText("1");
            view.AgeText.setText("5");
            view.comboSex.setSelectedItem("Male");
            view.EmailText.setText("aryan@");
            view.DOBtext.setText("990");
            view.AddressText.setText("jhapa");
            view.ContactText.setText("99990");
            view.comboDep.setSelectedItem("5");
            view.DateofJoinText.setText("999");
            view.comboBldGrp.setSelectedItem("A+");
            view.RegisterBtn.doClick();
            
            boolean ExpResult=true;
            boolean result=dao.add(mod);
            assertEquals("Registration test successful", ExpResult, result);

            
    }

    /**
     * Test of verifyField method, of class AdminDoctorController.
     */
    @Test
    public void UpdateBtnTest() {
          view.NameText.setText("aryan");
            view.DIDtext.setText("1");
            view.AgeText.setText("6");
            view.comboSex.setSelectedItem("Male");
            view.EmailText.setText("aryan@");
            view.DOBtext.setText("990");
            view.AddressText.setText("jhapa");
            view.ContactText.setText("99990");
            view.comboDep.setSelectedItem("d");
            view.DateofJoinText.setText("999");
            view.comboBldGrp.setSelectedItem("A+");
            view.UpdateBtn.doClick();
            
            boolean ExpResult=true;
            boolean result=dao.update(mod);
            assertEquals("UpdateBtn test sucessful",ExpResult, result);

        
    }

    
    @Test
    public void testDelete() {
        view.SearchID.setText("0");
        view.DeleteBtn.doClick();
        boolean ExpResult=true;
        boolean result=dao.delete(mod);
        assertEquals("Delete test Successful",ExpResult, result);


    }
    
    @Test
    public void testView(){
        view.SearchID.setText("1123");
        view.ViewBtn.doClick();
        boolean ExpResult=true;
        boolean result=dao.searchData(mod);
        assertEquals("ViewTest Successful" ,ExpResult, result);

    }
    
    @Test
    public void testTable(){
       AdminDoctorController controller = new AdminDoctorController( dao,    mod,  view);
        boolean ExpResult=true;
        boolean result=        controller.refreshTable();
        assertEquals("ViewTest Successful" ,ExpResult, result);
}
}
    
  
