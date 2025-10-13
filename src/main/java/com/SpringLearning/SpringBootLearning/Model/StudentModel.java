package com.SpringLearning.SpringBootLearning.Model;

public class StudentModel {

    private long id;
    private String name;
    private String department;
    private String address;
    private int age;

    public StudentModel() {}

    public StudentModel(long id, String name, String department, String address, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.address = address;
        this.age = age;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
