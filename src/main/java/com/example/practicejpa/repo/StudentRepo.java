package com.example.practicejpa.repo;

import com.example.practicejpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface StudentRepo extends JpaRepository<Student,Integer> {
}
