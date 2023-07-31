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
import DAO.IpdDao;
import org.junit.Assert;

public class IPDController {
    IPDModel model;
    IpdDao ipdDao = new IpdDao();
    
    public void IpdBtnactionPerformed(IPDView ipdview){
        try {
            model = ipdview.getUser();
            ipdDao.insert(model);
        }
            

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());


        }
    }  
}




