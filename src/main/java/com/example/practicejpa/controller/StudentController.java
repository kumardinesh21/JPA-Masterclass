package com.example.practicejpa.controller;

import com.example.practicejpa.model.Student;
import com.example.practicejpa.service.AddressService;
import com.example.practicejpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/std")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.create(student);
    }

    @GetMapping
    public List<Student> get() {
        return service.get();
    }

    @GetMapping("{id}")
    public Optional<Student> getById(@PathVariable int id) {
        return service.getById(id);
    }
    @DeleteMapping("{id}")
    public void delById(@PathVariable int id) {
        service.delById(id);
    }
}
