package com.codeclan.example.workservice.controllers;

import com.codeclan.example.workservice.models.Department;
import com.codeclan.example.workservice.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    DepartmentRepository   departmentRepository;

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Department> getDepartmentById(@PathVariable long id){
        return departmentRepository.findById(id);
    }

}
