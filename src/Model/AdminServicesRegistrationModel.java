/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anukul
 */
public class AdminServicesRegistrationModel {
    public String servicesId;
    public String serviceName;
    public String serviceCharge;
    
    public AdminServicesRegistrationModel(String servicesId, String serviceName, String serviceCharge){
        this.servicesId = servicesId;
        this.serviceName = serviceName;
        this.serviceCharge = serviceCharge;
    }
    public AdminServicesRegistrationModel(String serviceName, String serviceCharge){
        this.serviceName = serviceName;
        this.serviceCharge = serviceCharge;
    }
    public AdminServicesRegistrationModel(String servicesId){
        this.servicesId = servicesId;
    }
    public void setServicesId(String servicesId){
        this.servicesId= servicesId;
    }
    public void setServiceName(String serviceName){
        this.serviceName= serviceName;
    }
    public void setServiceCharge(String serviceCharge){
        this.serviceCharge= serviceCharge;
    }
    public String getServicesId(){
        return servicesId;
    }
    public String getServiceName(){
        return serviceName;
    }
    public String getServiceCharge(){
        return serviceCharge;
    }
   
   
    
}
