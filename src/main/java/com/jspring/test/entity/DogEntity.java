package com.jspring.test.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.*;
@Entity
public class DogEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String breed;
    private String subreed;

    public DogEntity(Long id, String breed, String subreed) {
        this.id = id;
        this.breed = breed;
        this.subreed = subreed;
   
    }


    public DogEntity(String breed, String subreed) {
        this.breed = breed;
        this.subreed = subreed;
        
    }

    public DogEntity() {}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSubreed() {
        return subreed;
    }

    public void setSubreed(String subreed) {
        this.subreed = subreed;
    }


}
