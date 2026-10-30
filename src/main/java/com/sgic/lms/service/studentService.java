package com.sgic.lms.service;


import com.sgic.lms.entity.Student;

import com.sgic.lms.repository.studentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class studentService {
    private final studentRepository repository;


    public Student saveStudent (Student student){
        return repository.save(student);

    }
    public List<Student>getAllStudent(){
        return repository.findAll();
    }

    public Student getStudentById (long id){
        return repository.findById(id).orElse(null);
    }

    public Student updateStudent (Student student){
        return repository.save(student);
    }

}
