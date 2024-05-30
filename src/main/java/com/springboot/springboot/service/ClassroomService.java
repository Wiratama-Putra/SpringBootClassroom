package com.springboot.springboot.service;

import com.springboot.springboot.model.Classroom;
import com.springboot.springboot.model.Student;
import com.springboot.springboot.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {

    @Autowired
    ClassroomRepository classroomRepository;

    public Classroom insertClassroom(Classroom classroom){
        classroomRepository.save(classroom);
        return classroom;
    }

    public List<Classroom> getClassroomByName(String name){
        return classroomRepository.findByNameContaining(name);
    }

    public Page<Classroom> getClassroomList(String name, Pageable page){
        return classroomRepository.findByNameContainingPage(name,page);
    }

}
