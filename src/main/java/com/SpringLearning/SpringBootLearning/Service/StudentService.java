package com.SpringLearning.SpringBootLearning.Service;

import com.SpringLearning.SpringBootLearning.Model.StudentDTO;
import com.SpringLearning.SpringBootLearning.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentDTO> getAllStudentList() {
        return studentRepository.findAll();
    }

    public StudentDTO getStudentlistSearchByID(long id) {
        Optional<StudentDTO> student = studentRepository.findById(id);
        return student.orElse(null);
    }

    public StudentDTO addStudent(StudentDTO student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
