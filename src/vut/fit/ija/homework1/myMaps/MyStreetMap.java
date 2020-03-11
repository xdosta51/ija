package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.maps.StreetMap;
import vut.fit.ija.homework1.maps.Coordinate;
import vut.fit.ija.homework1.maps.Street;
import java.util.List;
import java.util.ArrayList;

public class MyStreetMap implements StreetMap {
    List<Street> kocka;

    public MyStreetMap() {
        this.kocka = new ArrayList<>();
    }

    public Street getStreet(String id) {
        for (Street st : this.kocka) 
        {
            if (st.getId().equals(id))
                return st;
        } 
        return null;
    }



    public void addStreet(Street s) {
        kocka.add(s);
    }



}