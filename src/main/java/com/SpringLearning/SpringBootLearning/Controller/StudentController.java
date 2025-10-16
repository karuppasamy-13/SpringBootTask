package com.SpringLearning.SpringBootLearning.Controller;

import com.SpringLearning.SpringBootLearning.Model.StudentDTO;
import com.SpringLearning.SpringBootLearning.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/add")
    public StudentDTO addStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.addStudent(studentDTO);
    }

    @PutMapping("/update/{id}")
    public StudentDTO updateStudent(@PathVariable Long id, @RequestBody StudentDTO studentDTO) {
        return studentService.updateStudent(id, studentDTO);
    }

    @PatchMapping("/patch/{id}")
    public StudentDTO patchStudent(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        return studentService.patchStudent(id, updates);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}
