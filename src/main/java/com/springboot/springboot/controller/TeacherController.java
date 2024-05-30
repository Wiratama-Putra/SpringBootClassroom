package com.springboot.springboot.controller;

import com.springboot.springboot.model.Teacher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

public interface TeacherController {
    @GetMapping("/teacher")
    public ResponseEntity<Teacher> getTeacher(
            @RequestParam(value = "teacherId") UUID id
    );
}
