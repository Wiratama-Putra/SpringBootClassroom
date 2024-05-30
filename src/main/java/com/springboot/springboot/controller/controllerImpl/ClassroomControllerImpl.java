package com.springboot.springboot.controller.controllerImpl;

import com.springboot.springboot.controller.ClassroomController;
import com.springboot.springboot.controller.StudentController;
import com.springboot.springboot.model.Classroom;
import com.springboot.springboot.model.Student;
import com.springboot.springboot.service.ClassroomService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Classroom API")
public class ClassroomControllerImpl implements ClassroomController {

    @Autowired
    ClassroomService classroomService;

    @Override
    public ResponseEntity<Classroom> insertClassroom(Classroom classroom) {
        ResponseEntity<Classroom> response = new ResponseEntity<>(
                classroomService.insertClassroom(classroom),
                HttpStatusCode.valueOf(200)
        );
        return response;
    }

    @Override
    public ResponseEntity<List<Classroom>> getClassroom(String className) {
        ResponseEntity<List<Classroom>> response = new ResponseEntity<>(
                classroomService.getClassroomByName(className),
                HttpStatusCode.valueOf(200)
        );
        return response;
    }

    @Override
    public ResponseEntity<Page<Classroom>> getClassroomList(String name, Pageable pageable) {
        ResponseEntity<Page<Classroom>> response = new ResponseEntity<>(
                classroomService.getClassroomList(name,pageable),
                HttpStatusCode.valueOf(200)
        );
        return response;
    }
}
