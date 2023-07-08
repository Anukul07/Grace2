/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import DAO.LoginDAO;
import DAO.RegistrationDAO;
import Model.TheLoginModel;
import Model.TheRegistrationModel;
import View.LoginPageView;
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
public class TheRegisterControllerTest {
     RegistrationPageView lview = new RegistrationPageView();
    RegistrationDAO dao = new RegistrationDAO();
    TheRegistrationModel mod=new TheRegistrationModel();
    public TheRegisterControllerTest() {
    }
 
    @Test
    public void testActionPerformed() {
         TheRegisterController controller = new TheRegisterController( lview,    dao,  mod);
         lview.NameText.setText("aryan@");
          lview.ContactText.setText("777");
          lview.PasswordText.setText("wda");
          lview.ConfirmpassText.setText(" adawd");
          lview.emailText4.setText("AWDAWD");
          lview.RegisterBtn.doClick();

         

        Boolean expResult=true;
        
        Boolean Result=dao.RegisterData(mod);
        assertEquals(expResult, Result);
      
    }
    
}
