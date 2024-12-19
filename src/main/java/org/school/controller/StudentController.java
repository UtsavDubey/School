package org.school.controller;

import org.school.pojo.Student;
import org.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    // Create a new student (Post)
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // Get all students (Get)
    @GetMapping("/getAllStudents")
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
