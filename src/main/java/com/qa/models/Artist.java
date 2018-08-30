package com.qa.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="artists")
public class Artist {
    public Artist(){}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="artistId")
    private long id;

    @Column(name="name")
    private String name;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
