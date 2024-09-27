package com.example.practicejpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Car")
public class Car {
    @Id
    private int cid;
    private String model;
    private String brand;
    @ManyToOne
    private Student student;
}
