package com.lambdaschool.javazoos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "zoo")
@Data
public class Zoo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long zooid;

    private String zooname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zoo")
    @JsonIgnoreProperties("zoo")
    private Set<Telephone> telephones;

    @ManyToMany
    @JoinTable(name = "zooanimals",
        joinColumns = {@JoinColumn(name = "zooid")},
        inverseJoinColumns = {@JoinColumn(name = "animalid")})
    @JsonIgnoreProperties("zoos")
    private Set<Animal> animals = new HashSet<>();

    public Zoo()
    {
    }
}
