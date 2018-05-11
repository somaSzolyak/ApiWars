package com.codecool.apiwars.model;

import javax.persistence.*;

@Entity
@Table(name = "`user`")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String psw;

    @Column(nullable = false, unique = true)
    private String name;

    public User(String name, String psw){
        this.name = name;
        this.psw = psw;
    }
}
