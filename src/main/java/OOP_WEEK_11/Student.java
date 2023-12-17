package OOP_WEEK_11;

public class Student {


    private int id;
    private String name;

    private String university;

    private String department;

    private double gpa;


    public Student(int id, String name, String university, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getUniversity() {
        return university;
    }

    public void setUniversity(java.lang.String university) {
        this.university = university;
    }

    public java.lang.String getDepartment() {
        return department;
    }

    public void setDepartment(java.lang.String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString(){
        return this.name;
    }

    public String toString_ID(){
        return "ID : " + getId();
    }

    public String getAllInfo(){
        return "Name: " + this.name + ",    ID : " + this.id + ",   University: " + this.university + ",   Department: " + this.department + ",   GPA: " + this.gpa;
    }
}
