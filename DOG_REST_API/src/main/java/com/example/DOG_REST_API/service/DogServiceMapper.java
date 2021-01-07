package com.example.DOG_REST_API.service;


import com.example.DOG_REST_API.entity.Dog;

import java.util.List;

public interface DogServiceMapper {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
