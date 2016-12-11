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
    
    
//No longe used    private ArrayList<Item> wagonInventory = new ArrayList<>();

   public Player() {
        
    }
    
    public Player(String name,double highScore, Point location) {
        this.name = "";
        this.money = 3000;
        this.location = new Point(0,0);
        this.inventory = new ArrayList<>(); 
        
        Item Wood = new Item("Pine Wood",12.0,0);
        Item Water = new Item("Jug of Water",10.0,0);
        Item Iron = new Item ("Raw Iron", 25.0, 0);
        
        
    }
    public Point getLocation() {
         System.out.println("Please enter coordinates: ");
        return location;
    }

    public void setLocation(Point location) {
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
