package com.SpringLearning.SpringBootLearning.Service;

import com.SpringLearning.SpringBootLearning.Entity.Student;
import com.SpringLearning.SpringBootLearning.Model.StudentDTO;
import com.SpringLearning.SpringBootLearning.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO addStudent(StudentDTO dto) {
        Student s = new Student(null, dto.getStudentName(), dto.getDepartment(), dto.getResult(), dto.getLocation());
        Student saved = studentRepository.save(s);
        return new StudentDTO(saved.getId(), saved.getStudentName(), saved.getDepartment(), saved.getResult(), saved.getLocation());
    }

    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(s -> new StudentDTO(s.getId(), s.getStudentName(), s.getDepartment(), s.getResult(), s.getLocation()))
                .collect(Collectors.toList());
    }

    public StudentDTO getStudentById(Long id) {
        Student s = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        return new StudentDTO(s.getId(), s.getStudentName(), s.getDepartment(), s.getResult(), s.getLocation());
    }

    public StudentDTO updateStudent(Long id, StudentDTO dto) {
        Student s = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        s.setStudentName(dto.getStudentName());
        s.setDepartment(dto.getDepartment());
        s.setResult(dto.getResult());
        s.setLocation(dto.getLocation());
        Student updated = studentRepository.save(s);
        return new StudentDTO(updated.getId(), updated.getStudentName(), updated.getDepartment(), updated.getResult(), updated.getLocation());
    }

    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Student deleted with ID: " + id;
    }

    public StudentDTO patchStudent(Long id, Map<String, Object> updates) {
        Student s = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));

        if (updates.containsKey("studentName")) {
            s.setStudentName((String) updates.get("studentName"));
        }
        if (updates.containsKey("department")) {
            s.setDepartment((String) updates.get("department"));
        }
        if (updates.containsKey("result")) {
            s.setResult((String) updates.get("result"));
        }
        if (updates.containsKey("location")) {
            s.setLocation((String) updates.get("location"));
        }

        Student updated = studentRepository.save(s);
        return new StudentDTO(updated.getId(), updated.getStudentName(), updated.getDepartment(), updated.getResult(), updated.getLocation());
    }
}
