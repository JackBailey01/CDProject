package com.qa.tiers;

import com.google.gson.Gson;
import com.qa.models.Artist;
import com.qa.models.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cds")
public class intro {

    @Autowired
    private BusinessServices service;

    @GetMapping(path= "cdGet/{title}")
    public CD getCd(@PathVariable String title){
        CD cd = service.cdGet(title);
        return cd;
    }
    @GetMapping(path= "artGet/{name}")
    public Artist getArt(@PathVariable String name){
        Artist art= service.artistGet(name);
        return art;
    }

    @PostMapping(path = "cdCreate")
    public String addCd(@RequestBody String data) {
        CD cd = new Gson().fromJson(data, CD.class);
        service.cdCreate(cd);
        return "Success";
    }

    @PostMapping(path = "artistCreate")
    public String addArtist(@RequestBody String data) {
        Artist art = new Gson().fromJson(data, Artist.class);
        service.artistCreate(art);
        return "Success";
    }

}
