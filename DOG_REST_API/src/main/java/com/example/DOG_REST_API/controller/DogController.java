package com.example.DOG_REST_API.controller;


import com.example.DOG_REST_API.entity.Dog;
import com.example.DOG_REST_API.service.DogServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*@RestController	This marks a class as a REST API. @RestController is a convenience annotation
 that combines @Controller and @ResponseBody.*/
@RestController
public class DogController {

    /*@Autowired. This eliminates the need for getters and setters.*/
    @Autowired
    DogServiceMapper dogServiceMapper;

           /*@GetMapping	This annotation handles HTTP GET requests and acts as a shortcut for
    @RequestMapping(method = RequestMethod.GET).*/

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs() {
        List<Dog> list = dogServiceMapper.retrieveDogs();
        return new ResponseEntity<List<Dog>>(list, HttpStatus.OK);
    }

    @GetMapping("/dogs/breed")
    public ResponseEntity<List<String>> getDogBreeds() {
        List<String> list = dogServiceMapper.retrieveDogBreed();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getBreedByID(@PathVariable Long id) {
        String breed = dogServiceMapper.retrieveDogBreedById(id);
        return new ResponseEntity<String>(breed, HttpStatus.OK);
    }

    @GetMapping("/dogs/name")
    public ResponseEntity<List<String>> getDogNames() {
        List<String> list = dogServiceMapper.retrieveDogNames();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }
}
