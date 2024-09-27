package com.example.practicejpa.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "Student")

public class Student {
    @Id
    private int sid;
    private String name;
    private String job;
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    @JsonIgnore
    private Laptop laptop;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Car> carList=new ArrayList<>();
    @ManyToMany(mappedBy = "student", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Address> addresses = new ArrayList<>();

}
