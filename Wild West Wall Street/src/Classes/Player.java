/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Point;
import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Kameron
 */
public class Player implements Serializable{
    
    private String name;
    private double highScore;
    private Point location;
    private ArrayList<Item> inventory = new ArrayList<>();
    
//No longe used    private ArrayList<Item> wagonInventory = new ArrayList<>();

   public Player() {
        
    }
    
    public Player(String name,double highScore, Point location) {
        this.name = "";
        this.highScore = 3000;
        this.location = new Point(0,0);
        this.inventory = new ArrayList<Item>(); 
        Item pineWood = new  Wood ;
    }
    private Point getLocation() {
        return location;
    }

    private void setLocation(Point location) {
        this.location = location;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHighScore() {
        return highScore;
    }

    public void setHighScore(double highScore) {
        this.highScore = highScore;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.highScore) ^ (Double.doubleToLongBits(this.highScore) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.highScore) != Double.doubleToLongBits(other.highScore)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", highScore=" + highScore + '}';
    }
    
    
    
}
