package com.example.REST_API.Demo.service;

import com.example.REST_API.Demo.entity.Location;
import com.example.REST_API.Demo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* Spring @Service annotation is used with classes that provide some business functionalities. Spring context will
 autodetect these classes when annotation-based configuration and classpath scanning is used.*/
@Service
public class LocationService implements LocationServiceMapper {

    /*@Autowired. This eliminates the need for getters and setters.*/
    @Autowired
    LocationRepository locationRepository;


    public List<Location> retrieveLocations() {
        return (List<Location>) locationRepository.findAll();
    }
}
