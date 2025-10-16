package com.SpringLearning.SpringBootLearning.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentName")
    private String studentName;

    @Column(name = "department")
    private String department;

    @Column(name = "result")
    private String result;

    @Column(name = "location")
    private String location;

    public Student() {}

    public Student(Long id, String studentName, String department, String result, String location) {
        this.id = id;
        this.studentName = studentName;
        this.department = department;
        this.result = result;
        this.location = location;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
