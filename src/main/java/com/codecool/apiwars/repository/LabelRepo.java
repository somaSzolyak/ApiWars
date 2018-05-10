package com.codecool.apiwars.repository;

import com.codecool.apiwars.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepo extends JpaRepository<Label, Integer> {
}
