package com.jspring.test.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jspring.test.entity.DogEntity;
import com.jspring.test.repo.DogRepo;
@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogRepo dogRepository;

    public List<DogEntity> retrieveDogEntity() {
        return (List<DogEntity>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    public String retrieveDogBreedById(Long id) {
        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
        String breed = optionalBreed.orElseThrow(DogNotFound::new);
        return breed;
    }

    public List<String> retrieveDogSubreed() {
        return (List<String>) dogRepository.findAllSubreed();
    }
}
