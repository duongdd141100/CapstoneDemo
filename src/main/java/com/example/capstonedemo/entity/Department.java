package com.example.capstonedemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="department")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}
