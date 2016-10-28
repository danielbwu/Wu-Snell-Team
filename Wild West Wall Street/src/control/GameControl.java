/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Classes.Player;
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
    
}