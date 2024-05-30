package com.springboot.springboot.controller;

import com.springboot.springboot.model.Classroom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ClassroomController {
    @PostMapping("/classroom/insert")
    public ResponseEntity<Classroom> insertClassroom(
            @RequestBody Classroom classroom
    );

    @GetMapping("/classroom")
    public ResponseEntity<List<Classroom>> getClassroom(
            @RequestParam(value = "className") String className
    );

    @GetMapping("/classroomList")
    public ResponseEntity<Page<Classroom>> getClassroomList(
            @RequestParam String name,
            Pageable pageable
    );
}
