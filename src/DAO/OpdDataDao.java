/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import Model.IPDModel;
import javax.swing.table.DefaultTableModel;
import View.OpdDataView;
import javax.swing.JTable;

public class OpdDataDao {
    PreparedStatement pst = null;

    public void view(OpdDataView oDataView, IPDModel ipdmodel) {
        
        try {
            DefaultTableModel dtm = (DefaultTableModel)oDataView.opdTable.getModel();
            Connection conn = DbConnection.connect();
            Statement stmt = conn.createStatement();
            
            String sql = "select * from ipd_registration where IPD_No = ?";
            pst.setString(1, ipdmodel.getIPD_No());
            dtm.setRowCount(0);
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("IPD_No"),rs.getString("Patient_Name"),rs.getString("Age"),rs.getString("Blood_Grp"),rs.getString("Department"),rs.getString("Policy_No")});
            } 
        }
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void viewAll(OpdDataView oDataView) {     
        try {
            DefaultTableModel dtm = (DefaultTableModel)oDataView.opdTable.getModel(); 
            Connection conn = DbConnection.connect();
            Statement stmt = conn.createStatement();
            String sql = "select * from ipd_registration";
            dtm.setRowCount(0); 
            ResultSet rs = stmt.executeQuery(sql); 
            
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("IPD_No"),rs.getString("Patient_Name"),rs.getString("Age"),rs.getString("Blood_Grp"),rs.getString("Department"),rs.getString("Policy_No")}); 
            }
        }
        
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
