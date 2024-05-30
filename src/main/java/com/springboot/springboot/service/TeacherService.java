package com.springboot.springboot.service;

import com.springboot.springboot.model.Teacher;
import com.springboot.springboot.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public Teacher getTeacher(UUID teacherId){
        return teacherRepository.findById(teacherId).get();
    }
}
