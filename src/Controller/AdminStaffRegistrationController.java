/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AdminStaffRegistrationDAO;
import Model.AdminStaffRegistrationModel;
import View.AdminStaffRegistrationView;

/**
 *
 * @author dilasha
 */
public class AdminStaffRegistrationController {
    AdminStaffRegistrationDAO addao = new AdminStaffRegistrationDAO();
    AdminStaffRegistrationModel admodel;
    
    public void RegisterButtonActionPerformed(AdminStaffRegistrationView adview) {
    try {
            admodel = adview.getUser();
            checkUserRegistration(admodel);
            if (checkUserRegistration(admodel)) 
            {
                addao.insertQuery(admodel.getStaffID(), admodel.getName(), admodel.getAge(), admodel.getBloodGroup(), admodel.getDepartment(), admodel.getDateofJoin());
                System.out.println("Staff registered successfully");
            }
            else
            {
                System.out.println("Staff could not be registered");
            }
        }
    catch(Exception e)
        {
            System.out.println("Something went wrong : "+e.getMessage());
        }
    }
    
    public boolean checkUserRegistration(AdminStaffRegistrationModel check){
        try {
            if (check.getStaffID().isEmpty() || check.getName().isEmpty() || check.getAge().isEmpty() || check.getBloodGroup().isEmpty() || check.getDepartment().isEmpty() || check.getDateofJoin().isEmpty()){
                System.out.println("Empty fields");
                return false; 
            }
            else
            {
                return true;
            }
            
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong : "+e.getMessage());
            return false;
        }
        
        
    }
    public void UpdateButtonActionPerformed(AdminStaffRegistrationView adview){
        try{
            admodel = adview.getUserUpdate();
            checkUserUpdation(admodel);
            if(checkUserUpdation(admodel)){
                System.out.println("Staff updated successfully");
            }else{
                System.out.println("Staff could not be updated");
            }
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong : "+e.getMessage());
        }
    }

    public boolean checkUserUpdation(AdminStaffRegistrationModel check){
        try{
            if (check.getStaffID().isEmpty() || check.getName().isEmpty() || check.getAge().isEmpty() || check.getBloodGroup().isEmpty() || check.getDepartment().isEmpty() || check.getDateofJoin().isEmpty()){
                System.out.println("Empty fields");
                return false; 
            }
            addao.updateQuery(check.getStaffID(), check.getName(), check.getAge(), check.getBloodGroup(), check.getDepartment(), check.getDateofJoin());
        }
        catch (Exception e){
            System.out.println("Something went wrong : "+e.getMessage());
        }
        return false;
    }
    
    public void DeleteButtonActionPerformed(AdminStaffRegistrationView adview) {
        try{
            admodel = adview.getUserDelete();
            checkUserDeletion(admodel);
            if(checkUserDeletion(admodel)){
                
                addao.deleteQuery(admodel.getStaffID());
            }
            else{
                System.out.println("Staff could not be deleted");
            }
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong : "+e.getMessage());
        }
    }
    
    public boolean checkUserDeletion(AdminStaffRegistrationModel check){
        try{
            if (check.getStaffID().isEmpty()){
                System.out.println("Empty fields");
                return false; 
            }
            else
            {
                return true;
            } 
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong : "+e.getMessage());
        }
        return false;
    }
}
