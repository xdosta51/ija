package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.maps.Street;
import vut.fit.ija.homework1.maps.Coordinate;
import vut.fit.ija.homework1.maps.Stop;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class MyStreet implements Street {
    private String getIde;
    private Coordinate c1;
    private Coordinate c2;
    List<Stop> stoper = new ArrayList<Stop>();
    

    public MyStreet(String getIde,  Coordinate c1, Coordinate c2) {
        this.getIde = getIde;
        this.c1 = c1;
        this.c2 = c2;
        
    }

    public String getId() {
        return getIde;
    }
    public List<Coordinate> getCoordinates() {
        List<Coordinate> turbo = new ArrayList<Coordinate>();
        turbo.add(this.c1);
        turbo.add(this.c2);
        return turbo;
    }

    

    public List<Stop> getStops() {
        return stoper;
    }
    public void addStop(Stop stop) {
        stop.setStreet(this);
        stoper.add(stop);
        return;
    }

}