package com.SpringLearning.SpringBootLearning.Controller;

import com.SpringLearning.SpringBootLearning.Model.StudentModel;
import com.SpringLearning.SpringBootLearning.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/student/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("getAllStudents")
    public ResponseEntity<List<StudentModel>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping("addStudent")
    public ResponseEntity<String> addStudent(@RequestBody StudentModel student) {
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
    }

    @PutMapping("modifyStudent/{id}")
    public ResponseEntity<List<StudentModel>> modifyStudent(@PathVariable long id, @RequestBody StudentModel student) {
        return new ResponseEntity<>(studentService.updateStudent(id, student), HttpStatus.OK);
    }

    @DeleteMapping("recordDelete/{id}")
    public ResponseEntity<List<StudentModel>> deleteStudent(@PathVariable long id) {
        return new ResponseEntity<>(studentService.deleteStudent(id), HttpStatus.OK);
    }
}
