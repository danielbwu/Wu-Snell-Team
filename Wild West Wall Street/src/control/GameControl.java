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
import Classes.Wagon;
import cit260.game.CIT260Game;

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

    public static void createNewGame(Player player) {
       
        Game game = new Game();
        CIT260Game.setCurrentGame(game);
        
        game.setPlayer(player);
       
        Item[] invetoryList = GameControl.createInventoryList();
        game.setInventory(invetoryList);
        
        Wagon wagon = new Wagon();
        game.setWagon(wagon);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }
    public static Item[] createInventoryList(){
            System.out.println("called createInventoryList in game control");
            return null;
        }
    
}
