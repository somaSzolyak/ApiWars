package com.codecool.apiwars.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String album;

    @Column(nullable = false)
    private String artist;

    private String spotifyId;

    @ManyToMany
    @JoinTable(
            name = "Track_Label",
            joinColumns = { @JoinColumn(name = "track_id") },
            inverseJoinColumns = { @JoinColumn(name = "label_id") }
    )
    private List<Label> labels = new ArrayList<>();

    public Track(String title, String album, String artist, String spotifyId, List<Label> labels) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.spotifyId = spotifyId;
        this.labels.addAll(labels);
    }

    public void addLabel(Label label) {
        labels.add(label);
    }
}
