package com.SpringLearning.SpringBootLearning.Service;

import com.SpringLearning.SpringBootLearning.Model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private List<StudentModel> students = new ArrayList<>();

    public StudentService() {
        students.add(new StudentModel(1, "Karuppasamy", "ECE", "Chennai", 22));
        students.add(new StudentModel(2, "Kapil", "CIVIL", "Coimbatore", 22));
        students.add(new StudentModel(3, "Suresh", "ECE", "Madurai", 22));
    }

    public List<StudentModel> getAllStudents() {
        return students;
    }

    public String addStudent(StudentModel student) {
        students.add(student);
        return "Student added successfully!";
    }

    public List<StudentModel> updateStudent(long id, StudentModel updatedStudent) {
        for (StudentModel s : students) {
            if (s.getId() == id) {
                s.setName(updatedStudent.getName());
                s.setDepartment(updatedStudent.getDepartment());
                s.setAddress(updatedStudent.getAddress());
                s.setAge(updatedStudent.getAge());
                break;
            }
        }
        return students;
    }

    public List<StudentModel> deleteStudent(long id) {
        students = students.stream()
                .filter(s -> s.getId() != id)
                .collect(Collectors.toList());
        return students;
    }
}
