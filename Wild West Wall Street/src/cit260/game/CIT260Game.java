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
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Kameron
 */
public class CIT260Game {
     private static PrintWriter outFile = null;
     private static BufferedReader inFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CIT260Game.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CIT260Game.inFile = inFile;
    }

     
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

        
