package com.springboot.springboot.controller;

import com.springboot.springboot.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface StudentController {
    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudent(
            @RequestParam(value = "name") String name
    );

    @GetMapping("/student/list")
    public ResponseEntity<Page<Student>> getStudentList(
            @RequestParam String name,
            Pageable pageable
    );

    @PostMapping("/student")
    public ResponseEntity<String> insertStudent(
            @RequestBody Student student
    );
}
