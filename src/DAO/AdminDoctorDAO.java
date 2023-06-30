/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.PreparedStatement;
import Model.AdminDoctorModel;
import java.util.ArrayList;
import java.util.List;
public class AdminDoctorDAO {
    PreparedStatement pst;
    
    public void createTable(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root", "");  
            String sql= "create table if not exists doctor(DoctorId int, DoctorName varchar(10), age int, BloodGroup varchar(10),Department varchar (10),DateofJoin varchar(10),sex varchar(10),dateofbirth varchar(10),  address varchar(10),contactno varchar(10),email varchar(30),  qualification varchar(100))";
            pst=conn.prepareStatement(sql);
            pst.executeUpdate();
             System.out.println("table created");
         }
         catch(Exception e){
             
         }
        
    }

    public boolean add(AdminDoctorModel mod) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root", "");   
            String sql = "insert into doctor (DoctorId, DoctorName, age, BloodGroup, Department, DateOfJoin, sex, dateofbirth, address, contactno, email, qualification) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
         
            pst.setInt(1, mod.getId());
            pst.setString(2, mod.getName());
            pst.setInt(3, mod.getAge());
            pst.setString(4, mod.getBloodGroup());
            pst.setString(5, mod.getDepartment());
            pst.setInt(6, mod.getDate());
            pst.setString(7,mod.getSex());
            pst.setString(8, mod.getDateofBirth());
            pst.setString(9,mod.getAddress());
            pst.setString(10,mod.getContactNo());
            pst.setString(11,mod.getEmail());
            pst.setString(12,mod.getQualification());
            
            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
       
        }
        
        return false; // Added a default return statement outside the try-catch block
    }
    public boolean update(AdminDoctorModel mod) {
           PreparedStatement pst = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root", "");

            String sql = "UPDATE doctor Set     DoctorId=? ,DoctorName=?, age=?, BloodGroup=?, Department=?, DateofJoin=?, sex=?, dateofbirth=?, address=?, contactno=?, email=?, qualification=? WHERE DoctorId=?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1, mod.getId());
            pst.setString(2, mod.getName());
            pst.setInt(3, mod.getAge());
            pst.setString(4, mod.getBloodGroup());
            pst.setString(5, mod.getDepartment());
            pst.setInt(6, mod.getDate());
            pst.setString(7,mod.getSex());
            pst.setString(8, mod.getDateofBirth());
            pst.setString(9,mod.getAddress());
            pst.setString(10,mod.getContactNo());
            pst.setString(11,mod.getEmail());
            pst.setString(12,mod.getQualification());
            pst.setInt(13, mod.getId());
            pst.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println(e);
        } 
        
        return false; // Added a default return statement outside the try-catch block
    }
    
    public boolean searchData(AdminDoctorModel mod) {
    PreparedStatement pst = null;
    ResultSet rs = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root", "");
         String sql = "SELECT * FROM doctor WHERE DoctorId=?";

        pst = conn.prepareStatement(sql);
        pst.setInt(1, mod.getId());
        rs = pst.executeQuery();
        
        if (rs.next()) {
            mod.setId(rs.getInt("DoctorId"));
            mod.setName(rs.getString("DoctorName"));
            mod.setAge(rs.getInt("age"));
            mod.setBloodGroup(rs.getString("BloodGroup"));
            mod.setDepartment(rs.getString("Department"));
            mod.setDate(rs.getInt("DateofJoin"));
            mod.setAge(rs.getInt("age"));
            mod.setSex(rs.getString("sex"));
            mod.setAddress(rs.getString("address"));
            mod.setEmail(rs.getString("email"));
            mod.setContactNo(rs.getString("contactno"));
            mod.setQualification(rs.getString("qualification"));
            mod.setDateofBirth(rs.getString("dateofbirth"));
            return true;
        }

        return false;

    } catch (Exception e) {
        System.err.println(e);
    } 
    
    return false; // Added a default return statement outside the try-catch block
}
     public boolean delete(AdminDoctorModel mod) {
        PreparedStatement ps = null;
   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root", "");
            String sql = "DELETE FROM doctor WHERE DoctorId=?";

            ps = conn.prepareStatement(sql);
            ps.setInt(1,mod.getId());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.err.println(e);
        } 
        
        return false; // Added a default return statement outside the try-catch block
    }
    
     
    public List<AdminDoctorModel> getAllData() {
    List<AdminDoctorModel> data = new ArrayList<>();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
   
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gracedb","root", "");
         String sql = "SELECT * FROM doctor";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            AdminDoctorModel modelData = new AdminDoctorModel();
            modelData.setId(rs.getInt("DoctorId"));
            modelData.setName(rs.getString("DoctorName"));
            modelData.setAge(rs.getInt("age"));
            modelData.setBloodGroup(rs.getString("BloodGroup"));
            modelData.setDate(rs.getInt("DateofJoin"));
            modelData.setDepartment(rs.getString("Department"));
            modelData.setSex(rs.getString("sex"));
            modelData.setAddress(rs.getString("address"));
            modelData.setEmail(rs.getString("email"));
            modelData.setContactNo(rs.getString("contactno"));
            modelData.setDateofBirth(rs.getString("dateofbirth"));
            data.add(modelData);
        }
    } catch (Exception e) {
        System.err.println(e);
    } 

    return data;
}
    

    
    
    
    
    
}
