package io.jackfrost.department.controller;

import io.jackfrost.department.entity.DepartmentEntity;
import io.jackfrost.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
@CrossOrigin(origins = "http://localhost:9093")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/")
    public ResponseEntity<List<DepartmentEntity>> getAllDepartments(){
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }

}
