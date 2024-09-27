package com.example.practicejpa.repo;

import com.example.practicejpa.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,Integer> {
}
