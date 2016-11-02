/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author 1dani
 */
public class InventoryControl {
    
    public double sellItems(double numSold, double price){
        
        double profit = numSold * price;
        
        return profit;
    }
}
