package com.example.practicejpa.controller;

import com.example.practicejpa.model.Laptop;
import com.example.practicejpa.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lap")
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopService.create(laptop);
    }

    @GetMapping
    public List<Laptop> get() {
        return laptopService.get();
    }

    @GetMapping("{id}")
    public Optional<Laptop> getById(@PathVariable int id) {
        return laptopService.getById(id);
    }

    @DeleteMapping("{id}")
    public void delById(@PathVariable int id) {
        laptopService.delById(id);

    }
}
