package com.example.REST_API.Demo.controller;

import com.example.REST_API.Demo.entity.Location;
import com.example.REST_API.Demo.service.LocationServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*@RestController	This marks a class as a REST API. @RestController is a convenience annotation
 that combines @Controller and @ResponseBody.*/

@RestController
public class LocationController {

    /*@Autowired. This eliminates the need for getters and setters.*/
    @Autowired
    LocationServiceMapper locationServiceMapper;

    /*@GetMapping	This annotation handles HTTP GET requests and acts as a shortcut for
    @RequestMapping(method = RequestMethod.GET).*/

    @GetMapping("/location")
    public ResponseEntity<List<Location>> getAllLocations(){
        List<Location> list = locationServiceMapper.retrieveLocations();
        return new ResponseEntity<List<Location>>(list, HttpStatus.OK);
    }
}
