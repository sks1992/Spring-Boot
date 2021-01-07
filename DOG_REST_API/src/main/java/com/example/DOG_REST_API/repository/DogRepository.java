package com.example.DOG_REST_API.repository;


import com.example.DOG_REST_API.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog,Long> {
    /*In order to define SQL to execute for a Spring Data repository method, we can annotate the method with the
    @Query annotation — its value attribute contains the JPQL or SQL to execute.*/
    @Query("select d.id, d.breed from Dog d where d.id=:id")
    String findBreedById(Long id);

    @Query("select d.id, d.breed from Dog d")
    List<String> findAllBreed();

    @Query("select d.id, d.name from Dog d")
    List<String> findAllName();
}
