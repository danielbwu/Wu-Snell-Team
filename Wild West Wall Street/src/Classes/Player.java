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
    private double money;
    private Point location;
    private ArrayList<Item> inventory = new ArrayList<>();

    




   public Player() {
        
    }
    
    public Player(String name,double money, Point location) {
        this.name = "";
        this.money = 3000;
        this.location = new Point(0,0);
        this.inventory = new ArrayList<Item>(); 
        Item pineWood = new  Wood("Pine Wood",10,0);
        Item rawIron = new Iron("Raw Iron", 20, 0);
        Item jugOfWater = new Water("Jug of Water", 5, 0);
        
        inventory.add(pineWood);
        inventory.add(rawIron);
        inventory.add(jugOfWater);
        
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    
    
    
    
}
