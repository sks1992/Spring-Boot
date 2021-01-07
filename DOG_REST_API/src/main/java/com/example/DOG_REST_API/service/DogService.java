package com.example.DOG_REST_API.service;

import com.example.DOG_REST_API.entity.Dog;
import com.example.DOG_REST_API.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
* Spring @Service annotation is used with classes that provide some business functionalities. Spring context will
 autodetect these classes when annotation-based configuration and classpath scanning is used.*/
@Service
public class DogService implements DogServiceMapper {
    /*@Autowired. This eliminates the need for getters and setters.*/
    @Autowired
    DogRepository dogRepository;


    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    public String retrieveDogBreedById(Long id) {
        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;
    }

    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }
}
