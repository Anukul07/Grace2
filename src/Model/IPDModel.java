/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dell
 */
public class IPDModel {
    String IPD_No;
    String Patient_Name;
    String Age;
    String Blood_Grp;
    String Department;
    String Policy_No;
    
    public IPDModel (String IPD_No, String Patient_Name, String Age, String Blood_Grp, String Department, String Policy_No) {
        this.IPD_No = IPD_No;
        this.Patient_Name = Patient_Name;
        this.Age = Age;
        this.Blood_Grp = Blood_Grp;
        this.Department = Department;
        this.Policy_No = Policy_No;
    }
    
    public String getIPD_No() {
    return IPD_No;
    }

    public void setIPD_No(String IPD_No) {
        this.IPD_No = IPD_No;
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getBlood_Grp() {
        return Blood_Grp;
    }

    public void setBlood_Grp(String Blood_Grp) {
        this.Blood_Grp = Blood_Grp;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getPolicy_No() {
        return Policy_No;
    }

    public void setPolicy_No(String Policy_No) {
        this.Policy_No = Policy_No;
    }    
}
