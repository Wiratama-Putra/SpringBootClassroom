package com.springboot.springboot.service;

import com.springboot.springboot.model.Student;
import com.springboot.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public String insertStudent(Student student){
        studentRepository.saveAndFlush(student);
        return student.toString();
    }

    public List<Student> getStudentByName(String name){
        return studentRepository.findByNameContaining(name);
    }

    public Page<Student> getStudentList(String name, Pageable page){
        return studentRepository.findByNameContainingPage(name,page);
    }


}
