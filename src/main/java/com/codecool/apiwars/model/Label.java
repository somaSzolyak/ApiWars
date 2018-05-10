package com.codecool.apiwars.model;

import javax.persistence.*;

@Entity
@Table(name = "Label")
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToMany(mappedBy = "labels")
    @JoinTable(
            name = "Track_Label",
            joinColumns = { @JoinColumn(name = "track_id") },
            inverseJoinColumns = { @JoinColumn(name = "label_id") }
    )
    private int id;

    private String name;
}
