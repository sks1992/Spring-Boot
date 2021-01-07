package com.example.REST_API.Demo.repository;

import com.example.REST_API.Demo.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location,Long> {
}
