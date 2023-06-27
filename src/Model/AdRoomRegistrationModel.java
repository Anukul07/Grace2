/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anukul
 */
public class AdRoomRegistrationModel {
    String roomNo;
    String roomCharge;
    String roomId;
    
    public AdRoomRegistrationModel(String roomNo,String roomCharge){
        this.roomNo = roomNo;
        this.roomCharge = roomCharge;
    }
    public AdRoomRegistrationModel(String roomId,String roomNo,String roomCharge){
        this.roomId = roomId;
        this.roomNo = roomNo;
        this.roomCharge = roomCharge;
    }
    public void setRoomId(String roomId){
        this.roomId = roomId;
    }
    public String getRoomId(){
        return roomId;
    }
    public void setRoomNo(String roomNo){
        this.roomNo = roomNo;
    }
    public String getRoomNo(){
        return roomNo;
    }
    public void setRoomCharge(String roomCharge){
        this.roomCharge = roomCharge;
    }
    public String getRoomCharge(){
        return roomCharge;
    }
   
    
    
}
