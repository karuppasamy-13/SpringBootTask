package com.SpringLearning.SpringBootLearning.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class StudentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String department;
    private String result;
    private String location;

    public StudentDTO() {
    }

    public StudentDTO(Long id, String studentName, String department, String result, String location) {
        this.id = id;
        this.studentName = studentName;
        this.department = department;
        this.result = result;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

