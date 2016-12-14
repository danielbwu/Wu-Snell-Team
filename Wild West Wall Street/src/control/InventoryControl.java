/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Classes.Iron;
import Classes.Item;
import Classes.Water;
import Classes.Wood;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class InventoryControl {
    
    public double totalCost(double numSold, double price){
        
        double total = numSold * price;
        
        return total;
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
    
    public ArrayList<Item> addItem(ArrayList<Item> inventory, Item item) {
        
        
        return inventory;
    }
    
    public ArrayList<Item> removeItem(ArrayList<Item> inventory, Item item) {
        
        
        return inventory;
    }
    
    public void displayInventory(ArrayList<Item> inventory, double money) {
        
        System.out.println("\n==================================\n"
                         + "|           Inventory            |"
                         + "\n==================================\n");
        
        System.out.println("Current Balance: $" + money + "\n");
        System.out.println("Items:");
        for (Item item : inventory){
            System.out.println("| " + item.getName() + " -- " + item.getQuantity());
        
        }

    }
}
