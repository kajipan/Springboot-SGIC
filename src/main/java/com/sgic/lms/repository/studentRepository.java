package com.sgic.lms.repository;


import com.sgic.lms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface studentRepository extends JpaRepository<Student, Long> {
}
