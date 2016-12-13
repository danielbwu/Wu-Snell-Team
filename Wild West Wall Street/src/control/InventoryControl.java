/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Classes.Item;
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
    
    public ArrayList<Item> addItem(ArrayList<Item> inventory) {
        
        
        return inventory;
    }
    
    public ArrayList<Item> removeItem(ArrayList<Item> inventory) {
        
        
        return inventory;
    }
    
    public void displayInventory(ArrayList<Item> inventory) {
        
        System.out.println("displayInventory called");
        for (Item item : inventory){
            System.out.println("\n\t" + item.getName() + " -- " + item.getQuantity());
        
        return;
        }
    }
}
