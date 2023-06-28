package Model;

public class TheAppointmentModel {
    private String name;
    private String age;
    private String sex;
    private String contact;
    private String email;
    private String department;
    private String doctor;
    private String date;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public TheAppointmentModel(String name, String age, String sex, String contact, String email, String department, String doctor, String date, String time) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.contact = contact;
        this.email = email;
        this.department = department;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
