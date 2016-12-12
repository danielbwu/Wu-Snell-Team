/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

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
    private ArrayList<Item> inventory = new ArrayList<>();

    public Player() {
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

    public ArrayList<Item> createInventory() {
        
        ArrayList<Item> inventory = new ArrayList<>();
        
        Wood wood = new Wood("Pine Wood", 0.00, 0);
        inventory.add(wood);
        
        Iron iron = new Iron("Raw Iron", 0.00, 0);
        inventory.add(iron);
        
        Water water = new Water("Fresh Water", 0.00, 0);
        inventory.add(water);
        
        return inventory;
    }
    
    
    
}
