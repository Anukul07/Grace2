/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dilasha
 */
public class AdminStaffRegistrationModel {
    String StaffID;
    String Name;
    String Age;
    String BloodGroup;
    String Department;
    String DateofJoin;
    
    public AdminStaffRegistrationModel (String StaffID, String Name, String Age, String BloodGroup, String Department, String DateofJoin) {
        this.StaffID = StaffID;
        this.Name = Name;
        this.Age = Age;
        this.BloodGroup = BloodGroup;
        this.Department = Department;
        this.DateofJoin = DateofJoin;
    }
    
    public AdminStaffRegistrationModel (String StaffID) {
        this.StaffID = StaffID;
    }

    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String StaffID) {
        this.StaffID = StaffID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String BloodGroup) {
        this.BloodGroup = BloodGroup;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getDateofJoin() {
        return DateofJoin;
    }

    public void setDateofJoin(String DateofJoin) {
        this.DateofJoin = DateofJoin;
    }
}
