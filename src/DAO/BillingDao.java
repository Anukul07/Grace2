/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import View.BillingView;

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
    public String viewPatientName(BillingView view){
        String n1 = null ;
        Connection conn = DbConnection.connect();
        try{
            String sql1 = "select Patient_Name from ipd_registration where IPD_No = '" +view.IpdTxt.getText()+"'";
            Statement stmt = conn.prepareStatement(sql1);
            PreparedStatement pst = conn.prepareStatement(sql1);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               n1= rs.getString("Patient_Name");
            }
        }catch(SQLException e){
            System.out.println("Something went wrong : "+ e.getMessage());
        }
        return n1;
    }
    public String viewOpdPatientName(BillingView view){
        String n2 = null ;
        Connection conn = DbConnection.connect();
        try{
            String sql = "select Patient_Name from opd_registration where OPD_No = '" +view.OpdTxt.getText()+"'";
            Statement stmt = conn.prepareStatement(sql);
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               n2= rs.getString("Patient_Name");
            }
        }catch(SQLException e){
            System.out.println("Something went wrong : "+ e.getMessage());
        }
        return n2;
    }
    public String viewRoomCharge(BillingView view){
        String n3 = null ;
        Connection conn = DbConnection.connect();
        try{
            String selectedItem = (String) BillingView.roomCombo.getSelectedItem();
            String sql = "select RoomCharge from rooms where RoomNo = '" +selectedItem+"'";
            Statement stmt = conn.prepareStatement(sql);
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               n3= rs.getString("RoomCharge");
            }
        }catch(SQLException e){
            System.out.println("Something went wrong : "+ e.getMessage());
        }
        return n3;
    }
    public String viewServiceCharge(BillingView view){
        String n4 = null ;
        Connection conn = DbConnection.connect();
        try{
            String selectedItem = (String) BillingView.serviceCombo.getSelectedItem();
            String sql = "select ServiceCharge from services where ServiceName = '" +selectedItem+"'";
            Statement stmt = conn.prepareStatement(sql);
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               n4= rs.getString("ServiceCharge");
            }
        }catch(SQLException e){
            System.out.println("Something went wrong : "+ e.getMessage());
        }
        return n4;
    }
    public String viewIpdAge(BillingView view){
        String n5 = null ;
        Connection conn = DbConnection.connect();
        try{
            String sql = "select age from ipd_registration where IPD_No = '" +view.IpdTxt.getText()+"'";
            Statement stmt = conn.prepareStatement(sql);
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               n5= rs.getString("age");
            }
        }catch(SQLException e){
            System.out.println("Something went wrong : "+ e.getMessage());
        }
        return n5;
    }
    public String viewOpdAge(BillingView view){
        String n6 = null ;
        Connection conn = DbConnection.connect();
        try{
            String sql = "select age from opd_registration where OPD_No = '" +view.OpdTxt.getText()+"'";
            Statement stmt = conn.prepareStatement(sql);
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               n6= rs.getString("age");
            }
        }catch(SQLException e){
            System.out.println("Something went wrong : "+ e.getMessage());
        }
        return n6;
    }
    public String viewOpdCharge(BillingView view){
        String n7 = null ;
        Connection conn = DbConnection.connect();
        try{
            String sql = "select OPD_Charge from opd_registration where OPD_No = '" +view.OpdTxt.getText()+"'";
            Statement stmt = conn.prepareStatement(sql);
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               n7= rs.getString("OPD_Charge");
            }
        }catch(SQLException e){
            System.out.println("Something went wrong : "+ e.getMessage());
        }
        return n7;
    }
    public String viewIpdCharge(BillingView view){
        String n8 = null ;
        Connection conn = DbConnection.connect();
        try{
            String sql = "select IPD_Charge from ipd_registration where IPD_No = '" +view.IpdTxt.getText()+"'";
            Statement stmt = conn.prepareStatement(sql);
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
               n8= rs.getString("IPD_Charge");
            }
        }catch(SQLException e){
            System.out.println("Something went wrong : "+ e.getMessage());
        }
        return n8;
    }
    
    
  
}
  