package com.qa.tiers;

import com.qa.models.Artist;
import com.qa.models.ArtistRepository;
import com.qa.models.CD;
import com.qa.models.CDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesImpl implements BusinessServices{

    @Autowired
    private CDRepository cdRepo;
    @Autowired
    private ArtistRepository artRepo;

    public void cdCreate(CD cd) {
            cdRepo.save(cd);
    }

    public void artistCreate(Artist art){
        artRepo.save(art);
    }

    public CD cdGet(String title){
        return cdRepo.findByTitle(title);
    }

    public Artist artistGet(String name){
        return artRepo.findByName(name);
    }



}

