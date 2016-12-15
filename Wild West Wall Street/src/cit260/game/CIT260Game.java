/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 *test1234232efgrdfd
 */
package cit260.game;

import Classes.Player;
import Classes.Location;
import Classes.Scene;
import Classes.Game;
import Classes.Item;
import Classes.Map;
import citbyui.cit260.WWWS.view.StartProgramView;
import control.InventoryControl;
import static control.LoanSort.loanSort;

/**
 *
 * @author Kameron
 */
public class CIT260Game {

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CIT260Game.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        CIT260Game.player = player;
    }
    
    private static Game currentGame = null;
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Player
        Player playerOne = new Player();
        
        playerOne.setName("Bill The Kid");
        playerOne.setMoney(1000.00);
       
    
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Game
        Game slotOne = new Game();
        
        slotOne.setTotalTime(360);
        
        System.out.println(slotOne.toString());
        
        //Map
        Map wildWest = new Map();
        
        wildWest.setRowCount(5);
        wildWest.setColumnCount(5);
        
        System.out.println(wildWest.toString());

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        


       
    }
    
   
}

        
