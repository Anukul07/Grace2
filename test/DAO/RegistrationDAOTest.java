/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import Controller.TheRegisterController;
import Model.TheRegistrationModel;
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
public class RegistrationDAOTest {
    
    public RegistrationDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of RegisterData method, of class RegistrationDAO.
     */
    @Test
    public void testRegisterData() {
        System.out.println("RegisterData");
        
      
        RegistrationDAO instance = new RegistrationDAO();
        boolean expResult = true;
        TheRegistrationModel mod = new TheRegistrationModel();
        mod.setName("aryan");
        mod.setPasswd("password");
        mod.setConf_pass("password");
        mod.setEmail("email");
        mod.setContact("888");   //its a string value but we need int value for contact so it fails.
        
        
        boolean result = instance.RegisterData(mod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
