package com.sgic.lms.controller;

import com.sgic.lms.entity.Student;
import com.sgic.lms.service.studentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Student")
public class studentApi {

    private final studentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student>getAllStudent(){
        return service.getAllStudent();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable long id){
        return service.getStudentById(id);
    }

}
