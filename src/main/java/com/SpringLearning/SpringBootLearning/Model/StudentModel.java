package com.SpringLearning.SpringBootLearning.Model;

import jakarta.persistence.*;

public class StudentModel {

    private long studentId;
    private String studentName;
    private String department;
    private String address;
    private int age;

    public StudentModel() {}

    public StudentModel(long studentId, String studentName, String department, String address, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.address = address;
        this.age = age;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Entity
    @Table(name = "student")
    public static class StudentDTO {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String studentName;
        private String department;
        private String result;
        private String location;

        public StudentDTO() {}

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
}
