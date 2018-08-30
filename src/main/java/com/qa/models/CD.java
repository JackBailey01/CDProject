package com.qa.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="cds")
public class CD {
    public CD(){}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cdId")
    private long id;

    @Column(name="title")
    private String title;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "CD_Artists",
            joinColumns = @JoinColumn(name = "cds_id"),
            inverseJoinColumns = @JoinColumn(name = "artists_id"))
    private List<Artist> artist = new ArrayList<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public List<Artist> getArtist() {
        return artist;
    }

    public void setArtist(List<Artist> artist) {
        this.artist = artist;
    }
}

