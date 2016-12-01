/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kameron
 */
public class Actor implements Serializable{

    public static Actor[] values() {
        Actor[] values = null;
      return values;
    }
    
    public Point location;
    public String name;
    public Point coordinates;
   
    
    public Actor() {
        
    }

    public Actor(Point location, String name) {
        this.location = location;
        this.name = name;
    }

    public Point getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.location);
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actor{" + "location=" + location + ", name=" + name + '}';
    }


    
    
    
}
