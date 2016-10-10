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
 * @author Daniel
 */
public class Wagon implements Serializable{
    
    private double speed;
    private double maxCapacity;
    private double currentCapacity;
    private double health;

    public Wagon() {
    }
    

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.maxCapacity) ^ (Double.doubleToLongBits(this.maxCapacity) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.currentCapacity) ^ (Double.doubleToLongBits(this.currentCapacity) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
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
        final Wagon other = (Wagon) obj;
        if (Double.doubleToLongBits(this.speed) != Double.doubleToLongBits(other.speed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxCapacity) != Double.doubleToLongBits(other.maxCapacity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentCapacity) != Double.doubleToLongBits(other.currentCapacity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wagon{" + "speed=" + speed + ", maxCapacity=" + maxCapacity + ", currentCapacity=" + currentCapacity + ", health=" + health + '}';
    }
    
    
    
}
