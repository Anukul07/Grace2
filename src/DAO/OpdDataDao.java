/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import View.OpdDataView;

public class OpdDataDao {
    PreparedStatement pst = null;
  
    public boolean viewAll(OpdDataView oDataView) {     
        try {
            DefaultTableModel dtm = (DefaultTableModel)oDataView.opdTable.getModel(); 
            Connection conn = DbConnection.connect();
            Statement stmt = conn.createStatement();
            String sql = "select * from opd_registration";
            dtm.setRowCount(0); 
            ResultSet rs = stmt.executeQuery(sql); 
            
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString("OPD_No"),rs.getString("Patient_Name"),rs.getString("Age"),rs.getString("Blood_Grp"),rs.getString("Department"),rs.getString("Policy_No")}); 
            }
        }
        
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}
