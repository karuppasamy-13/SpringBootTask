package com.SpringLearning.SpringBootLearning.Controller;

import com.SpringLearning.SpringBootLearning.Model.StudentDTO;
import com.SpringLearning.SpringBootLearning.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student/")
@CrossOrigin(origins = "http://localhost:3000") // Optional for React
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("showAllStudents")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudentList();
    }

    @GetMapping("searchbyid/{id}")
    public StudentDTO getStudentById(@PathVariable long id) {
        return studentService.getStudentlistSearchByID(id);
    }

    @PostMapping("addStudent")
    public StudentDTO addStudent(@RequestBody StudentDTO student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
        return "Student deleted with ID: " + id;
    }
}



