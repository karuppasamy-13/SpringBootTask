package com.SpringLearning.SpringBootLearning.Service;

import com.SpringLearning.SpringBootLearning.Model.StudentModel;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class StudentService {
    private final List<StudentModel> database = new ArrayList<>();
    private int nextId = 1;
    public boolean createStudent(StudentModel student) {
        if (student.getStudentid() == 0) {  // auto-generate ID
            student.setStudentid(nextId++);
        }
        return database.add(student);
    }
    public List<StudentModel> retrieveAll() {
        return new ArrayList<>(database);
    }
    public Optional<StudentModel> findById(int id) {
        return database.stream()
                .filter(s -> s.getStudentid() == id)
                .findFirst();
    }

    public boolean removeStudent(int id) {
        return database.removeIf(s -> s.getStudentid() == id);
    }
}
