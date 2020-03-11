package vut.fit.ija.homework1.myMaps;
import vut.fit.ija.homework1.maps.Street;
import vut.fit.ija.homework1.maps.Stop;
import vut.fit.ija.homework1.maps.Coordinate;
import java.util.Objects;

public class MyStop implements Stop {
    private String getIde;
    private Coordinate c1;
    private Street s1;

    public MyStop(String getIde,  Coordinate c1) {
        this.getIde = getIde;
        this.c1 = c1;
        
    }
    
    public boolean equals(Object s) { 
        
        MyStop c = (MyStop) s;

        int pes =  this.getId().compareTo(c.getIde); 
        if (pes == 0)
            return true;
        return false;
      
    } 

    @Override
    public int hashCode() {
        return Objects.hash();
    }
    
    public MyStop(String getIde) {
        this.getIde = getIde;
    
    }     
    public String getId() {
        if (getIde != null)
            return getIde;
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