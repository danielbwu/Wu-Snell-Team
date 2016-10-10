/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Objects;
import java.io.Serializable;


/**
 *
 * @author Kameron
 */
public class scene implements Serializable {
    
    private String description;
    private double travelTime;
    private Character displaySymbol;
    private Character trap;

    public scene() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public Character getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(Character displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public Character getTrap() {
        return trap;
    }

    public void setTrap(Character trap) {
        this.trap = trap;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.displaySymbol);
        hash = 97 * hash + Objects.hashCode(this.trap);
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
        final scene other = (scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        if (!Objects.equals(this.trap, other.trap)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "scene{" + "description=" + description + ", travelTime=" + travelTime + ", displaySymbol=" + displaySymbol + ", trap=" + trap + '}';
    }
    
    
    
    
}
