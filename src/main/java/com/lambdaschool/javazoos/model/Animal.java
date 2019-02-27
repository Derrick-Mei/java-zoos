package com.lambdaschool.javazoos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "animal")
@Data
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long animalid;

    private String animaltype;

    @ManyToMany(mappedBy = "animals")
    @JsonIgnoreProperties("animals")
    private Set<Zoo> zoos = new HashSet<>();

    public Animal()
    {
    }
}
