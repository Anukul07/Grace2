/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
/**
 *
 * @author anukul
 */
public class AdminRoomsDao {
    public void insertQuery(String roomNo, String roomCharge){
        try {
            try (Connection conn = DbConnection.connect()) {
                String query = "INSERT INTO rooms(RoomNo,RoomCharge) VALUES (?,?)";
                PreparedStatement pst = conn.prepareStatement(query);
                
                pst.setInt(1, Integer.parseInt(roomNo));
                pst.setInt(2,Integer.parseInt(roomCharge));
                pst.executeUpdate();
            }
        }catch(SQLException e) {
            System.out.println("Something went wrong : "+ e.getMessage());
        }
        
    }
    public void updateQuery(String roomId,String roomNo,String roomCharge){
        try{
            Connection conn = DbConnection.connect();
            String query = "UPDATE rooms set roomNo = ?, roomCharge = ? where roomId = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1,roomNo);
            pst.setString(2,roomCharge);
            pst.setString(3,roomId);
            pst.executeUpdate();
            
        }catch (SQLException e){
            System.out.println("Something went wrong :"+e.getMessage());
        }
        
    }
    public void deleteQuery(String roomId){
        try{
            Connection conn = DbConnection.connect();
            String query = "DELETE FROM rooms WHERE roomId = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1,Integer.parseInt(roomId));
            pst.executeUpdate();
            
        }catch (SQLException e){
            System.out.println("Something went wrong :"+e.getMessage());
        }
        
    }
    
}
