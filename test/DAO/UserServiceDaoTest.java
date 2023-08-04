/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.UserServiceModel;
import DAO.UserServiceDAO;
import org.junit.Assert;
import org.junit.Test;

public class UserServiceDaoTest {
    
    @Test
    public void test() {
        UserServiceModel model = new UserServiceModel("COVID Test"," 15/08/2021","123","Bob","500");
        UserServiceDAO dao = new UserServiceDAO();
        
        try {
            Assert.assertTrue(dao.insertData(model));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
