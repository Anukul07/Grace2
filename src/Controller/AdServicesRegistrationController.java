/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAO.*;
import DAO.AdminServicesDao;
import Model.AdminServicesRegistrationModel;
import View.AdminServicesRegistrationView;
import java.sql.*;

/**
 *
 * @author anukul
 */
public class AdServicesRegistrationController {
    AdminServicesDao adDao = new AdminServicesDao();
    AdminServicesRegistrationModel adModel;
    
    public void RegisterButtonActionPerformed(AdminServicesRegistrationView adView){
        adModel = adView.getInsertData();
        adDao.insertQuery(adModel.getServiceName(), adModel.getServiceCharge());
    }
    
    public void DeleteButtonActionPerformed(AdminServicesRegistrationView adView){
        adModel = adView.getDeleteData();
        adDao.deleteQuery(adModel.getServicesId());
    }
    public void UpdateButtonActionPerformed(AdminServicesRegistrationView adView){
        adModel = adView.getUpdateData();
        adDao.updateQuery(adModel.getServicesId(),adModel.getServiceName(),adModel.getServiceCharge());
    }
    public void ViewButtonActionPerformed(AdminServicesRegistrationView adView){
        adModel = adView.getViewData();
        adDao.viewQuery(adView);
    }
}
