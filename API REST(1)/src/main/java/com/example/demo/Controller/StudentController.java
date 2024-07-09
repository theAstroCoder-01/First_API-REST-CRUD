package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private  StudentService studentService;

    @GetMapping("/{studentId}")
    public Optional<Student> getById(@PathVariable("studentId") Long studentId) {
        return studentService.getStudents(studentId);

    }

    @PostMapping
    public void saveUpdate(@RequestBody Student student) {
         studentService.saveOrUpdate(student);

    }

    @DeleteMapping ("/{studentId}")
    public void saveUpdate(@PathVariable("studentId") Long studentId) {
        studentService.delete(studentId);

    }

}
