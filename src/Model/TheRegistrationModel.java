/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aryan
 */
public class TheRegistrationModel {
    String name,contact,email,passwd,conf_pass
    ;
    public TheRegistrationModel(String name,String contact,String email,String passwd,String conf_pass){
        this.name=name;
        this.contact=contact;
        this.email=email;
        this.passwd=passwd;
        this.conf_pass=conf_pass;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String password) {
        this.passwd = password;
    }

    public String getConf_pass() {
        return conf_pass;
    }

    public void setConf_pass(String conf_pass) {
        this.conf_pass = conf_pass;
    }
   
    
    
    
}
