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
 * @author Daniel
 */
public enum Item implements Serializable{
    
    PineWood(1, "Sturdy planks cut from a pine tree. Useful as construction material."),
    RawIron(2, "Raw iron ore. Useless to the average man. A blacksmith, however..."),
    RefinedIron(3, "Strong, pruified metal. An invaluable resource for construction, tools, and crafts."),
    Leather(4, "Thick, durable cow hide."),
    Flour(5, "Finely ground wheat flour. Useful for baking."),
    Water(6, "Liquid Dihydrogen Monoxide. Lethal if consumed in excessive quantities."),
    PistolAmmo(7, "Standard 9mm rounds."),
    RifleAmmo(8, "Standard Winchester rifle rounds."),
    ShotgunAmmo(9, "Standard 12-gauge shells."),
    WagonParts(10, "Used to repair and reinforce wagons.");

    private final String itemDescription;
    private final int itemId;

    Item(int itemId, String itemDescription) {    
        this.itemDescription = itemDescription;
        this.itemId = itemId;
    }
    
    @Override
    public String toString() {
        return "Item{" + ", itemDescription=" + itemDescription + ", itemId=" + itemId + '}';
    }

}