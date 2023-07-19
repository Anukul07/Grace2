/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.UserServiceModel;
import View.UserServiceView;
import DAO.UserServiceDAO;
import org.junit.Assert;

public class UserServiceController {
    UserServiceModel model;
    UserServiceDAO dao = new UserServiceDAO();
    
    public void btnUserServiceactionPerformed (UserServiceView serviceView) {
        try {
            model = serviceView.getData();
            dao.insertData(model);
            
            Assert.assertTrue(dao.insertData(model));
            
            if (dao.insertData(model)) {
                serviceView.setMessage("Registered Successfully");
            }
            else {
                System.out.println("error");
            }
        }
        
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
