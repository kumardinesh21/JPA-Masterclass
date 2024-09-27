package com.example.practicejpa.service;

import com.example.practicejpa.model.Car;

import com.example.practicejpa.repo.CarRepo;
import com.example.practicejpa.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private StudentRepo studentRepo;

    public Car create(Car car) {
        return carRepo.save(car);
    }

    public List<Car> get() {
        return carRepo.findAll();
    }

    public Optional<Car> getById(int id) {
        return carRepo.findById(id);
    }

    public void delById(int id) {
        carRepo.deleteById(id);
    }
}
