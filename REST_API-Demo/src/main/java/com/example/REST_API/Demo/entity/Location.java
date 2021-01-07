package com.example.REST_API.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* @Entity	This marks a Java class as an entity, which means it will be persisted to the database. Typically,
            an entity maps to a database table and the table contains rows that represent that given entity. */
@Entity
public class Location {
/*In a Object Relational Mapping context, every object needs to have a unique identifier. You use the
@Id annotation to specify the primary key of an entity.

The @GeneratedValue annotation is used to specify how the primary key should be generated. In your example you
are using an Identity strategy which Indicates that the persistence provider must assign primary keys for the entity
using a database identity column.*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;

    public Location() {
    }

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Location(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
