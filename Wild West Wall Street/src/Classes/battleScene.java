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
public class battleScene implements Serializable {
    
    private double amountOfEnemies;
    private String typeOfEnemies;

    public battleScene() {
    }
    
    

    public double getAmountOfEnemies() {
        return amountOfEnemies;
    }

    public void setAmountOfEnemies(double amountOfEnemies) {
        this.amountOfEnemies = amountOfEnemies;
    }

    public String getTypeOfEnemies() {
        return typeOfEnemies;
    }

    public void setTypeOfEnemies(String typeOfEnemies) {
        this.typeOfEnemies = typeOfEnemies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.amountOfEnemies) ^ (Double.doubleToLongBits(this.amountOfEnemies) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.typeOfEnemies);
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
        final battleScene other = (battleScene) obj;
        if (Double.doubleToLongBits(this.amountOfEnemies) != Double.doubleToLongBits(other.amountOfEnemies)) {
            return false;
        }
        if (!Objects.equals(this.typeOfEnemies, other.typeOfEnemies)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "battleScene{" + "amountOfEnemies=" + amountOfEnemies + ", typeOfEnemies=" + typeOfEnemies + '}';
    }
    
    
    
}
