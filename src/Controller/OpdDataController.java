/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.OpdDataDao;
import View.OpdDataView;
import Model.IPDModel;

public class OpdDataController {
    OpdDataDao oDataDao = new OpdDataDao();
    IPDModel ipdmodel;
    
    public void btnViewAllactionPerformed(OpdDataView oDataView) {
        try {
            ipdmodel = oDataView.getDataView();
            oDataDao.viewAll(oDataView);
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void btnViewactionPerformed(OpdDataView iDataView) {
        try {
            ipdmodel = iDataView.getDataView();
            oDataDao.view(iDataView,ipdmodel);
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

