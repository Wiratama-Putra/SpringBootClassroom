package com.springboot.springboot.controller.controllerImpl;

import com.springboot.springboot.controller.StudentController;
import com.springboot.springboot.controller.TeacherController;
import com.springboot.springboot.model.Student;
import com.springboot.springboot.model.Teacher;
import com.springboot.springboot.service.TeacherService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Tag(name = "Teacher API")
public class TeacherControllerImpl implements TeacherController {

    @Autowired
    TeacherService teacherService;

    @Override
    public ResponseEntity<Teacher> getTeacher(UUID uuid) {
        ResponseEntity<Teacher> response = new ResponseEntity<>(
                teacherService.getTeacher(uuid),
                HttpStatusCode.valueOf(200)
        );
        return response;
    }
}
