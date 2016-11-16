/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Point;
import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author Kameron
 */
public enum Location implements Serializable {
    
    City1("city1"),
    City2("city2"),
    City3("city3"),
    City4("city4"),
    City5("city5");
    
    private final String description;
    private final Point coordinates;
   
   
    
    Location(String description) {
    this.description = description;
    coordinates = new Point(1,1);
    }

    public Point getCoordinates() {
        return coordinates;
    }


    public String getDescription() {
        return description;
}

     @Override
    public String toString() {
        return "Character{ coordinates=" + coordinates+ ", description=" + description + '}';
    }
    }
    
    
    
    

