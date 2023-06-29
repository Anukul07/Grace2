/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import Model.IPDModel;
import javax.swing.table.DefaultTableModel;
import View.IpdDataView;
import javax.swing.JTable;

public class IpdDataDao extends DbConnection {
//    public boolean view(IPDModel model) {
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//        Connection conn = DbConnection.connect();
//        
//        try {
//            String sql = "SELECT * FROM ipd_registration WHERE IPD_No = ?";
//            
//            pst = conn.prepareStatement(sql);
//            rs = pst.executeQuery();
//            
//            if (rs.next()) {
//                model.setIPD_No(rs.getString("IPD No"));
//                model.setPatient_Name(rs.getString("Patient Name"));
//                model.setAge(rs.getString("Age"));
//                model.setBlood_Grp(rs.getString("Blood Group"));
//                model.setDepartment(rs.getString("Department"));
//                model.setPolicy_No(rs.getString("Policy No."));
//                
//            }
//            
//        }
//        catch(Exception e) {
//            
//        }
//        return false;
//    }
    
    public void viewAll(IpdDataView iDataView) {
        
        DefaultTableModel dtm = (DefaultTableModel)iDataView.ipdTable.getModel(); 
        Connection conn = DbConnection.connect();
      
        try {
            Statement stmt = conn.createStatement();
            String sql = "select * from ipd_registration";
            dtm.setRowCount(0); 
            ResultSet rs = stmt.executeQuery(sql); 
            
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("IPD_No"),rs.getString("Patient_Name"),rs.getString("Age"),rs.getString("Blood_Grp"),rs.getString("Department"),rs.getString("Policy_No")}); // object used because
            }
        }
        
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
