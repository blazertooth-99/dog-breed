package com.jspring.test.service;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.jspring.test.entity.DogEntity;

public interface DogService {
	
    List<DogEntity> retrieveDogEntity();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogSubreed();
}
