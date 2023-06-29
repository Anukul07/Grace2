/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnection {
    public void dbConnect() {
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root", "cerebralcorpse00");     
        }
        
        catch (Exception e1) {
            
        }
        
    }
}
