/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Classes.Game;
import Classes.Item;
import Classes.Map;
import Classes.Player;
import Exceptions.MapControlException;
import cit260.game.CIT260Game;
import java.util.ArrayList;

/**
 *
 * @author Kameron
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        CIT260Game.setPlayer(player);
        
        return player;

    }

    public static void createNewGame(Player player) throws MapControlException {
       
        Game game = new Game();
        CIT260Game.setCurrentGame(game);
        
        game.setPlayer(player);
       
       // Item[] invetoryList = GameControl.createInventoryList();
       // game.setInventory(invetoryList);
        
//        Wagon wagon = new Wagon();
//        game.setWagon(wagon);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }
    
 
    public static Item[] createInventoryList(){
        
        Item[] inventory = new Item[10];
        
        //Item PineWood = new Item();
        //inventory[Item.PineWood.ordinal()] = PineWood;
        
        return inventory;
    }
    
    public static void displayInventory(ArrayList<Item> inventory){
        for (Item item : inventory){
            //System.out.println("\n\tItem: " + item.getName());
        }
    }
    /*public static Item[] createInventoryList(){
        //arrayList of inventory Items
        Item[] inventory = new Item[11];
        
        Item pineWood = new Item();
        pineWood.setItemDescription("Pine Wood");
        pineWood.setNoInStock(0);
        inventory[0] = pineWood;
        
        Item rawIron = new Item();
        rawIron.setItemDescription("Raw Iron");
        rawIron.setNoInStock(0);
        inventory[1] = rawIron;
        
        Item leather = new Item();
        leather.setItemDescription("Leather");
        leather.setNoInStock(0);
        inventory[2] = leather;
        
        Item water = new Item();
        water.setItemDescription("Jug of Water");
        water.setNoInStock(0);
        inventory[3] = water;
        
        Item flour = new Item();
        flour.setItemDescription("Just flour");
        flour.setNoInStock(0);
        inventory[4] = flour;
        
        Item rifle = new Item();
        rifle.setItemDescription("Winchester Long Rifle");
        rifle.setNoInStock(0);
        inventory[5] = rifle;
        
        Item pistol = new Item();
        pistol.setItemDescription("Colt 45");
        pistol.setNoInStock(0);
        inventory[6] = pistol;
        
        Item shotgun = new Item();
        shotgun.setItemDescription("Double barrel shotgun");
        shotgun.setNoInStock(0);
        inventory[7] = shotgun;
        
        Item wagonParts = new Item();
        wagonParts.setItemDescription("Parts to fix your wagon");
        wagonParts.setNoInStock(0);
        inventory[8] = wagonParts;
        
        Item pistolAmmo = new Item();
        pistolAmmo.setItemDescription("Colt 45 ammo");
        pistolAmmo.setNoInStock(0);
        inventory[9] = pistolAmmo;
        
        Item rifleAmmo = new Item();
        rifleAmmo.setItemDescription("Winchester ammo");
        rifleAmmo.setNoInStock(0);
        inventory[10] = rifleAmmo;
        
        Item shotgunAmmo = new Item();
        shotgunAmmo.setItemDescription("Shotgun Ammo");
        shotgunAmmo.setNoInStock(0);
        inventory[11] = shotgunAmmo;
        
        return inventory;
           
}*/
}
