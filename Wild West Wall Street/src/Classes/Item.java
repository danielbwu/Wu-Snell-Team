/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * What does the map do?
What does map have?
What does player have?
What does player do?
What does each location have?
How do these all interact?
 */
package Classes;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Item implements Serializable{

    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    
    

/*    
    PineWood("Sturdy planks cut from a pine tree. Useful as construction material."),
    RawIron("Raw iron ore. Useless to the average man. A blacksmith, however..."),
    RefinedIron("Strong, pruified metal. An invaluable resource for construction, tools, and crafts."),
    Leather("Thick, durable cow hide."),
    Flour("Finely ground wheat flour. Useful for baking."),
    Water("Liquid Dihydrogen Monoxide. Lethal if consumed in excessive quantities."),
    PistolAmmo("Standard 9mm rounds."),
    RifleAmmo("Standard Winchester rifle rounds."),
    ShotgunAmmo("Standard 12-gauge shells."),
    WagonParts("Used to repair and reinforce wagons.");

    private final String itemDescription;

    Item(String itemDescription) {    
        this.itemDescription = itemDescription;
    }
    
    @Override
    public String toString() {
        return "Item{" + ", itemDescription=" + itemDescription + '}';
    }
*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
