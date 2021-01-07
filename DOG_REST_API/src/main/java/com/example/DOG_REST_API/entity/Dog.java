package com.example.DOG_REST_API.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/* @Entity	This marks a Java class as an entity, which means it will be persisted to the database. Typically,
            an entity maps to a database table and the table contains rows that represent that given entity. */
@Entity
public class Dog {

    /*In a Object Relational Mapping context, every object needs to have a unique identifier. You use the
@Id annotation to specify the primary key of an entity.

The @GeneratedValue annotation is used to specify how the primary key should be generated. In your example you
are using an Identity strategy which Indicates that the persistence provider must assign primary keys for the entity
using a database identity column.*/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String breed;
    private String origin;

    public Dog() {
    }

    public Dog(Long id, String name, String breed, String origin) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.origin = origin;
    }

    public Dog(String name, String breed, String origin) {
        this.name = name;
        this.breed = breed;
        this.origin = origin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}

