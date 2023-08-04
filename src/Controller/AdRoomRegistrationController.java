/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.AdminRoomRegistrationView;
import Model.AdRoomRegistrationModel;
import DAO.*;




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
            checkDataRegistration(adModel);
            if(checkDataRegistration(adModel)){
                
                adDao.insertQuery(adModel.getRoomNo(), adModel.getRoomCharge());
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
    
    public void UpdateButtonActionPerformed(AdminRoomRegistrationView adView){
        try{
            adModel = adView.getDataUpdate();
            checkDataUpdation(adModel);
            if(checkDataUpdation(adModel)){
                System.out.println("Room updated successfully");
            }else{
                System.out.println("Room could not be updated");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong : "+e.getMessage());
            
        }
    }
    
    public boolean checkDataRegistration(AdRoomRegistrationModel data){
        try{
            if (data.getRoomNo().isEmpty() || data.getRoomNo().isEmpty()){
                System.out.println("Empty fields");
                return false; 
            }else{
                return true;
            }
            
        }
        catch (Exception e){
            System.out.println("Something went wrong : "+e.getMessage());
            return false;
        }
        
        
    }
    public boolean checkDataUpdation(AdRoomRegistrationModel data){
        try{
            if (data.getRoomId().isEmpty()||data.getRoomNo().isEmpty() || data.getRoomNo().isEmpty()){
                System.out.println("Empty fields");
                return false; 
            }
            adDao.updateQuery(data.getRoomId(), data.getRoomNo(),data.getRoomCharge());
            
        }
        catch (Exception e){
            System.out.println("Something went wrong : "+e.getMessage());
        }
        return false;
    }
    public void DeleteButtonActionPerformed(AdminRoomRegistrationView adView) {
        try{
            adModel = adView.getDataDelete();
            checkDataDeletion(adModel);
            if(checkDataDeletion(adModel)){
                
                adDao.deleteQuery(adModel.getRoomId());
            }else{
                System.out.println("Room could not be registered");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong : "+e.getMessage());
            
        }
        
    }
    public boolean checkDataDeletion(AdRoomRegistrationModel data){
        try{
            if (data.getRoomId().isEmpty()){
                System.out.println("Empty fields");
                return false; 
            }else{
                return true;
            } 
        }
        catch (Exception e){
            System.out.println("Something went wrong : "+e.getMessage());
        }
        return false;
    }
    public void ViewButtonActionPerformed(AdminRoomRegistrationView adView){
        try{
            adModel = adView.getDataView();
            adDao.viewQuery(adView);
        }catch(Exception e){
            System.out.println("Something went wrong : "+e.getMessage());
        }
    }
}
    

