/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.AdminRoomRegistrationView;
import Model.AdRoomRegistrationModel;
import DAO.*;
import javax.swing.JOptionPane;
import java.sql.*;



/**
 *
 * @author anukul
 */
public class AdRoomRegistrationController {
    AdminRoomsDao adDao = new AdminRoomsDao();
    AdRoomRegistrationModel adModel;
    
    
    public void RegisterButtonActionPerformed(AdminRoomRegistrationView adView) {
        try{
            adModel = adView.getData();
            checkData(adModel);
            if(checkData(adModel)){
                System.out.println("Room registered successfully");
            }else{
                System.out.println("Room could not be registered");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong : "+e.getMessage());
            
        }
        
    }
    public boolean checkData(AdRoomRegistrationModel data){
        try{
            if (data.getRoomNo().isEmpty() || data.getRoomNo().isEmpty()){
                System.out.println("Empty fields");
                return false; 
            }
            
            adDao.insertQuery(data.getRoomNo(), data.getRoomCharge());
            
        }
        catch (Exception e){
            System.out.println("Something went wrong : "+e.getMessage());
        }
        return false;
    }
}
    

