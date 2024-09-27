package com.example.practicejpa.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name ="Address")
public class Address {
    @Id
    private int aid;
    private String address;
    @ManyToMany
    private List<Student> student = new ArrayList<>();

}
