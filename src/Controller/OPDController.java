/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author dilasha
 */

import DAO.OPDDao;
import View.OPDView;
import Model.OPDModel;
import java.sql.*;

public class OPDController {
    OPDDao opddao = new OPDDao();
    OPDModel model;
    OPDView view;
    ResultSet rs;
    PreparedStatement pst;
   
    public void OpdBtnactionPerformed(OPDView opdview){
         try {
            model = opdview.getUser();
            checkUser(model);
                
            if (checkUser(model)) {
                opddao.insertQuery(model.getOPD_No(),model.getPatient_Name(),model.getAge(),model.getBlood_Grp(),model.getDepartment(),model.getPolicy_No());
                opdview.setMessage("Registered Successfully");
            }  
            else {
                System.out.println("error");
            }
        }
            
        catch (Exception e1) {
            System.out.println("Something went wrong: " + e1.getMessage());
        }
    }
    
    public boolean checkUser(OPDModel data){
        try {
            if (data.getOPD_No().isEmpty() || data.getPatient_Name().isEmpty() || data.getAge().isEmpty() || data.getBlood_Grp().isEmpty() || data.getDepartment().isEmpty() || data.getPolicy_No().isEmpty()) {
                System.out.println("Empty fields");
                return false;
            }
            else {
                return true;
            }
        }
        catch (Exception e2) {
            System.out.println(e2.getMessage());
        }
        return false;
    }
}

