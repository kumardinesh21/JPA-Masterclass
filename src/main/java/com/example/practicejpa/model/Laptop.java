package com.example.practicejpa.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Laptop")
public class Laptop {
    @Id
    private int lid;
    private String model;
    private String brand;
    @OneToOne
    private Student student;
}
