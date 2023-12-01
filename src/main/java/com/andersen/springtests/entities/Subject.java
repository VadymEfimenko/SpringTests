package com.andersen.springtests.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject extends BaseEntity {

    private String name;

    private Integer credits;

    @ManyToMany(mappedBy = "subjects")
    private Set<Student> students = new HashSet<>();

}
