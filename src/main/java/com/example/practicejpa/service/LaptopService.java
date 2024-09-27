package com.example.practicejpa.service;

import com.example.practicejpa.model.Laptop;
import com.example.practicejpa.repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepo laptopRepo;


    public Laptop create(Laptop laptop) {
        return laptopRepo.save(laptop);
    }

    public List<Laptop> get() {
        return laptopRepo.findAll();
    }

    public Optional<Laptop> getById(int id) {
        return laptopRepo.findById(id);
    }

    public void delById(int id) {
        laptopRepo.deleteById(id);
    }
}
