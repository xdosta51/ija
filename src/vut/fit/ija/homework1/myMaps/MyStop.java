package vut.fit.ija.homework1.myMaps;
import vut.fit.ija.homework1.maps.Street;
import vut.fit.ija.homework1.maps.Stop;
import vut.fit.ija.homework1.maps.Coordinate;
import java.util.Objects;

public class MyStop implements Stop {
    private String getId;
    private Coordinate c1;
    private Street s1;

    public MyStop(String getId,  Coordinate c1) {
        this.getId = getId;
        this.c1 = c1;
        
    }
    public MyStop(String getId) {
        this.getId = getId;
        
    } 
    
    public String getId() {
        if (getId != null)
            return getId;
        else 
            return null;
    }
    public Coordinate getCoordinate() {
        if (c1 != null) 
            return c1;
        else 
            return null;
    }

    public void setStreet(Street s) {
        s1 = s;
        return;
    }
    public Street getStreet() {
        if (s1 != null)
            return s1;
        else 
            return null;
    }

}