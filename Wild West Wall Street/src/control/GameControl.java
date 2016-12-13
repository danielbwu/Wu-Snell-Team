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
        player.setMoney(1000.00);
        
        InventoryControl createInventory = new InventoryControl();
        player.setInventory(createInventory.createInventory());
        
        CIT260Game.setPlayer(player);
        
        return player;

    }
    

    public static void createNewGame(Player player) throws MapControlException {
       
        Game game = new Game();
        game.setPlayer(player);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
        CIT260Game.setCurrentGame(game);
    }
    
}
