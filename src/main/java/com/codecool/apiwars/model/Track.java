package com.codecool.apiwars.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String artist;

    @Column(nullable = false)
    private String album;

    private String spotifyId;

    @ManyToMany
    private ArrayList<Label> labels;
}
