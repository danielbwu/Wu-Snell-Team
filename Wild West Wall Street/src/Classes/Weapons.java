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
 * @author Kameron/Daniel
 */
public enum Weapons implements Serializable {
    
    //Melee Weapons
    WoodenBat("Melee", 10, 0, "none", 0, "Sometimes, a strong arm and a blunt object are all you need."),
    MetalPipe("Melee", 15, 0, "none", 0, "Totally metal, dude,"),
    Broadsword("Melee", 30, 0, "none", 0, "It's the 19th century! What are you, a savage?!"),
    
    //Pistols
    OldRevolver("Pistol", 20, 2, "PistolAmmo", 6, "Cowboy standard issue."),
    NewRevolver("Pistol", 25, 2, "PistolAmmo", 6, "That's the actual product name. It's actually quite outdated."),
    
    //Shotguns
    DoubleBarrelShotgun("Shotgun", 40, 1, "ShotgunAmmo", 2, "Two barrels are better than one."),
    PumpShotgun("Shotgun", 30, 1, "ShotgunAmmo", 6, "Two barrels: One for the lead; One for the dead."),
    
    //Rifles
    HuntingRifle("Rifle", 30, 3, "RifleAmmo", 8, "Great for protecting what's yours,");
    
    private final String type;
    private final int power;
    private final int range;
    private final String ammoType;
    private final int maxAmmo;
    private final String description;

    Weapons(String type, int power, int range, String ammoType, int maxAmmo, String description) {
        this.type = type;
        this.power = power;
        this.range = range;
        this.ammoType = ammoType;
        this.maxAmmo = maxAmmo;
        this.description = description;
    }
    
    

    @Override
    public String toString() {
        return "weapons{" + "type=" + type + ", power=" + power + ", ammoType=" + ammoType+  ", maxAmmo=" + maxAmmo + ", description" + description + '}';
    }
    
    
    
}
