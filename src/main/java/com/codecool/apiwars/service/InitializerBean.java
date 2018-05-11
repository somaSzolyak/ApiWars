package com.codecool.apiwars.service;

import com.codecool.apiwars.repository.LabelRepo;
import com.codecool.apiwars.repository.TrackRepo;
import com.codecool.apiwars.repository.UserRepo;
import org.springframework.stereotype.Component;

import com.codecool.apiwars.model.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitializerBean {

    public InitializerBean(LabelRepo labelRepo, TrackRepo trackRepo, UserRepo userRepo) {

        User u1 = new User("name", "psw");
        userRepo.save(u1);

        Track t1 = new Track("Nocturnal", "Nocturnal", "The Black Dahlia Murder", "430xmK8Tw4J4VG8PxCqO4I", new ArrayList<Label>());
        Label l1 = new Label("energetic");

        List<Label> labels = new ArrayList<>();
        labels.add(l1);
        t1.addLabel(l1);

        labelRepo.save(l1);
        trackRepo.save(t1);
    }
}
