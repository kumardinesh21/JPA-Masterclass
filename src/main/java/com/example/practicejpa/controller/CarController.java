package com.example.practicejpa.controller;

import com.example.practicejpa.model.Car;

import com.example.practicejpa.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping
    public Car create(@RequestBody Car car) {
        return  carService.create(car);
    }

    @GetMapping
    public List<Car> get() {
        return  carService.get();
    }

    @GetMapping("{id}")
    public Optional<Car> getById(@PathVariable int id) {
        return  carService.getById(id);
    }

    @DeleteMapping("{id}")
    public void delById(@PathVariable int id) {
        carService.delById(id);

    }
}
