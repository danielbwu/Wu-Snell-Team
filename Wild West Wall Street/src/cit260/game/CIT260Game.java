/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 *test1234232efgrdfd
 */
package cit260.game;

import Classes.Player;
//import Classes.BankScene;
//import Classes.BattleScene;
import Classes.Location;
import Classes.Scene;
//import Classes.Weapons;
//import Classes.Character;
import Classes.Game;
import Classes.Item;
import Classes.Map;
//import Classes.Product;
//import Classes.Wagon;
import citbyui.cit260.WWWS.view.StartProgramView;

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
        playerOne.setMoney(4.00);
    
    
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        //Scene - Market
        Scene market = new Scene();
       
        market.setDescription("market");
        market.setTravelTime(4);
       
        System.out.println(market.toString());
       
        //BankScene *****UNUSED*****
/*        BankScene bank = new BankScene();
       
        bank.setDeposit(100);
        bank.setWithdraw(65);
        bank.setLoan(500);
        bank.setSavedMoney(699);
       
        System.out.println(bank.toString());
       
        //BattleScene
        BattleScene battle = new BattleScene();
       
        battle.setAmountOfEnemies(4);
        battle.setTypeOfEnemies("outlaws");
       
        System.out.println(battle.toString());
*/               

        
        //Game
        Game slotOne = new Game();
        
        slotOne.setTotalTime(360);
        
        System.out.println(slotOne.toString());
        
        //Map
        Map wildWest = new Map();
        
        wildWest.setRowCount(5);
        wildWest.setColumnCount(5);
        
        System.out.println(wildWest.toString());
        
       
        
      
        //Wagon *****UNUSED*****
/*        Wagon oldWagon = new Wagon();
        
        oldWagon.setSpeed(10);
        oldWagon.setHealth(50);
        oldWagon.setMaxCapacity(100);
        oldWagon.setCurrentCapacity(23);
        
        System.out.println(oldWagon.toString());
*/        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
       
    }
    
   
}
