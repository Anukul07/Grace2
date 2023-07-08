/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ControllerTest;

import Controller.TheLoginController;
import DAO.LoginDAO;
import Model.TheLoginModel;
import View.LoginPageView;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
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
public class TheLoginControllerTest {
    LoginPageView lview = new LoginPageView();
    LoginDAO dao = new LoginDAO();
    TheLoginModel mod=new TheLoginModel();
    
 
    public TheLoginControllerTest() {
        
    }
  

    /**
     * Test of actionPerformed method, of class TheLoginController.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
         

        TheLoginController controller = new TheLoginController( dao,    lview,  mod);
         lview.EmailText.setText("aryan@");
          lview.txtpassword.setText("aryan321");
        lview.LoginBtn.doClick();
//        mod.setEmail("aryan@");
//        mod.setPassword("aryan321");
         

        Boolean expResult=true;
        
        Boolean Result=dao.checkData(mod);
        assertEquals(expResult, Result);
        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mouseClicked method, of class TheLoginController.
     */
//    @Test
//    public void testMouseClicked() {
//        System.out.println("mouseClicked");
//        MouseEvent e = null;
//        TheLoginController instance = null;
//        instance.mouseClicked(e);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of mousePressed method, of class TheLoginController.
//     */
//
//    /**
//     * Test of mouseReleased method, of class TheLoginController.
//     */
//
//
//    /**
//     * Test of checkEmpty method, of class TheLoginController.
//     */
//    @Test
//    public void testCheckEmpty() {
//        System.out.println("checkEmpty");
//        TheLoginController instance = null;
//        boolean expResult = false;
//        boolean result = instance.checkEmpty();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
