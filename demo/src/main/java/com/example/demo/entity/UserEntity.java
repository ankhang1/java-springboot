package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="test")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

}
