/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aryan
 */
public class AdminDoctorModel {
    String name,bloodGroup,sex,Department,Email,ContactNo,Address,Qualification,DateofBirth;
    int Id,Age,Date;

    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(String DateofBirth) {
        this.DateofBirth = DateofBirth;
    }
     

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }
    
    
   

    
    
//    public AdminDoctorModel(String name,String bloodGroup,String Department, int age, int Id,int Date){
//        this.name=name;
//        this.bloodGroup=bloodGroup;
//        this.Department=Department;
//        this.Age=age;
//        this.Id=Id;
//        this.Date=Date;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    
    }
    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }
}
