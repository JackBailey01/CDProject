package com.qa.tiers;

import com.qa.models.Artist;
import com.qa.models.CD;

import java.util.List;

public interface BusinessServices {
    CD cdGet(String Title);
    Artist artistGet(String name);
    void cdCreate(CD cd);
    void artistCreate(Artist art);
}
