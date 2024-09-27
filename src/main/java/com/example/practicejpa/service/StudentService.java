package com.example.practicejpa.service;

import com.example.practicejpa.model.Student;
import com.example.practicejpa.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student create(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> get() {
        return studentRepo.findAll();
    }

    public Optional<Student> getById(int id) {
        return studentRepo.findById(id);
    }

    public void delById(int id) {
        studentRepo.deleteById(id);

    }
}
