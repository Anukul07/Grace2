/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.IpdDataDao;
import View.IpdDataView;
import Model.IPDModel;

public class IpdDataController {
    IpdDataDao iDataDao = new IpdDataDao();
    IPDModel ipdmodel;
    
    public void btnViewAllactionPerformed(IpdDataView iDataView) {
        try {
            ipdmodel = iDataView.getDataView();
            iDataDao.viewAll(iDataView);
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void btnViewactionPerformed(IpdDataView iDataView) {
        try {
            ipdmodel = iDataView.getDataView();
            iDataDao.view(iDataView,ipdmodel);
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
