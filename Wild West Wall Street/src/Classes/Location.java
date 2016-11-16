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
    
    bank("The place to get the money"),
    store("the place to sell the goods.");
    
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
    
    
    
    

