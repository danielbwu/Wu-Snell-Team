/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Daniel
 */
public class InventoryControl {
    
    public double totalCost(double numSold, double price){
        
        double total = numSold * price;
        
        return total;
    }
}
