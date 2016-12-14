/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Point;
import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public enum Character implements Serializable{
    
        BillyTheKid("The retired king of the Wild west, owns the bank and gives out loans, dont get on his bad side."),
        ButchCassidy("Once a theif but gave that up long ago, now he owns the general stores for you to sell your products."),
        CalamityJane("Long time legend, knows a ton about the wild west and guide you to help you become successful"),
        Bandit("will rob you blind"),
        StoreClerk("sell you goods"),
        BankClerk("handle your banking needs"),
        Player("This is you");
        
        

    private final Point location;
    private final String description;

    Character(String description) {
        this.description =description;
        location = new Point(1,1);
    }
    

    public Point getLocation() {
        return location;
    }


    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Character{ location=" + location + ", description=" + description + '}';
    }
    
    
}
