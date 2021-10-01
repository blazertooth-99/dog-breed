package com.jspring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jspring.test.entity.DogEntity;
import com.jspring.test.service.DogService;
import java.util.List;

@RestController
public class DogController {

	private DogService dogService;
	@Autowired
    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }


    @GetMapping("/dog")
    public ResponseEntity<List<DogEntity>> getAllDogEntity() {
        List<DogEntity> list = dogService.retrieveDogEntity();
        return new ResponseEntity<List<DogEntity>>(list, HttpStatus.OK);
    }

    @GetMapping("/dog/breed")
    public ResponseEntity<List<String>> getDogBreeds() {
        List<String> list = dogService.retrieveDogBreed();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getBreedByID(@PathVariable Long id) {
        String breed = dogService.retrieveDogBreedById(id);
        return new ResponseEntity<String>(breed, HttpStatus.OK);
    }

    @GetMapping("/dog/subreed")
    public ResponseEntity<List<String>> getDogSubreeds() {
        List<String> list = dogService.retrieveDogSubreed();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

}