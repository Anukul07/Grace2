package Model;

public class TheAppointmentModel {
    private String name;
    private String age;
    private String sex;
    private String contact;
    private String email;
    private String department;
    private String doctor;

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDoctor() {
        return doctor;
    }

    public TheAppointmentModel(String name, String age, String sex, String contact, String email, String department, String doctor) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.contact = contact;
        this.email = email;
        this.department = department;
        this.doctor = doctor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }
}
