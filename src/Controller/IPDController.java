/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author dell
 */
import View.IPDView;
import Model.IPDModel;
import java.sql.*;
import javax.swing.JOptionPane;
import DAO.IpdDao;

public class IPDController {
    IPDModel model;
    IPDView view;
    ResultSet rs;
    PreparedStatement pst;
    IpdDao ipdDao = new IpdDao();
    
   
    public void IpdBtnactionPerformed(IPDView ipdview){
         try {
            model = ipdview.getUser();
            ipdDao.insert(model);
                
            if (ipdDao.insert(model)) {
                ipdview.setMessage("Registered Successfully");
            }  
            else {
                System.out.println("error");
            }
        }
            

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());


        }
    }  
}




