package com.codecool.apiwars.repository;

import com.codecool.apiwars.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepo extends JpaRepository<Track, Integer> {
}
