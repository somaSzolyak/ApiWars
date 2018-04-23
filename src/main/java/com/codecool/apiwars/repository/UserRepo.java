package com.codecool.apiwars.repository;

import com.codecool.apiwars.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
