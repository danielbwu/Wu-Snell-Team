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

}
