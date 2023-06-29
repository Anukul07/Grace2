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
    private int servicesId;
    private String serviceName;
    private int serviceCharge;
    
    AdminServicesRegistrationModel(int servicesId, String serviceName, int serviceCharge){
        this.servicesId = servicesId;
        this.serviceName = serviceName;
        this.serviceCharge = serviceCharge;
    }
    AdminServicesRegistrationModel(String serviceName, int serviceCharge){
        this.serviceName = serviceName;
        this.serviceCharge = serviceCharge;
    }
    AdminServicesRegistrationModel(int servicesId){
        this.servicesId = servicesId;
    }
    public void setServicesId(int servicesId){
        this.servicesId= servicesId;
    }
    public void setServiceName(String serviceName){
        this.serviceName= serviceName;
    }
    public void setServiceCharge(int serviceCharge){
        this.serviceCharge= serviceCharge;
    }
    public int getServicesId(){
        return servicesId;
    }
    public String getServiceName(){
        return serviceName;
    }
    public int getServiceCharge(){
        return serviceCharge;
    }
   
   
    
}
