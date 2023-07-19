/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.OpdDataDao;
import View.OpdDataView;
import Model.OPDModel;
import org.junit.Assert;

public class OpdDataController {
    OpdDataDao oDataDao = new OpdDataDao();
    OPDModel opdmodel;
    
    public void btnViewAllactionPerformed(OpdDataView oDataView) {
        try {
            opdmodel = oDataView.getDataView();
            oDataDao.viewAll(oDataView);
            
            Assert.assertTrue(oDataDao.viewAll(oDataView)); 
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

