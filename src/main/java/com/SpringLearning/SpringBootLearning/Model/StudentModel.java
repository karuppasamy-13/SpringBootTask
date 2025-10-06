package com.SpringLearning.SpringBootLearning.Model;
import jakarta.validation.constraints.*;
public class StudentModel {
    private int studentid;
    @NotBlank(message = "Student name must not be empty")
    @Size(max = 50, message = "Student name must not exceed 50 characters")
    private String studentname;
    @NotBlank(message = "Department must not be empty")
    @Size(max = 10, message = "Department name must not exceed 10 characters")
    private String studentdept;
    @Min(value = 0, message = "Grade must be at least 0")
    @Max(value = 100, message = "Grade must be at most 100")
    private int studentgrade;
    @NotBlank(message = "College name must not be empty")
    private String collegename;
    public StudentModel() {}
    public StudentModel(int studentid, String studentname, String studentdept, int studentgrade, String collegename) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentdept = studentdept;
        this.studentgrade = studentgrade;
        this.collegename = collegename;
    }
    public int getStudentid() { return studentid; }
    public void setStudentid(int studentid) { this.studentid = studentid; }
    public String getStudentname() { return studentname; }
    public void setStudentname(String studentname) { this.studentname = studentname; }
    public String getStudentdept() { return studentdept; }
    public void setStudentdept(String studentdept) { this.studentdept = studentdept; }
    public int getStudentgrade() { return studentgrade; }
    public void setStudentgrade(int studentgrade) { this.studentgrade = studentgrade; }
    public String getCollegename() { return collegename; }
    public void setCollegename(String collegename) { this.collegename = collegename; }
}
