/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import View.BillingView;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anukul
 */
public class BillingDao {
    public void updateQueryForRoomsCombo(){
        Connection conn = DbConnection.connect();
        String query = "SELECT * from rooms";
        try{
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                BillingView.roomCombo.addItem(rs.getString("RoomNo"));
            }
        }catch(SQLException e){
            System.out.println("Something went wrong : "+ e.getMessage());
        }
    }
    public void updateQueryForServicesCombo(){
        Connection conn = DbConnection.connect();
        String query = "SELECT * from services";
        try{
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                BillingView.serviceCombo.addItem(rs.getString("ServiceName"));
            }
        }catch(SQLException e){
            System.out.println("Something went wrong : "+ e.getMessage());
        }
    }
}
  