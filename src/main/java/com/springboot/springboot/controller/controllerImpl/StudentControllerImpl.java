package com.springboot.springboot.controller.controllerImpl;

import com.springboot.springboot.controller.StudentController;
import com.springboot.springboot.model.Student;
import com.springboot.springboot.service.StudentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Student API")
public class StudentControllerImpl implements StudentController {

    @Autowired
    StudentService studentService;

    @Override
    public ResponseEntity<List<Student>> getStudent(String name) {
        ResponseEntity<List<Student>> response = new ResponseEntity<>(
                studentService.getStudentByName(name),
                HttpStatusCode.valueOf(200)
        );
        return response;
    }

    @Override
    public ResponseEntity<Page<Student>> getStudentList(String name, Pageable pageable) {
        ResponseEntity<Page<Student>> response = new ResponseEntity<>(
                studentService.getStudentList(name,pageable),
                HttpStatusCode.valueOf(200)
        );
        return response;
    }

    @Override
    public ResponseEntity<String> insertStudent(Student student) {
        ResponseEntity<String> response = new ResponseEntity<>(
                studentService.insertStudent(student),
                HttpStatusCode.valueOf(200)
        );
        return response;
    }
}
