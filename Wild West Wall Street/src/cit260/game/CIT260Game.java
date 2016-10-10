/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 *test1234232efgrdfd
 */
package cit260.game;

import Classes.Player;
import Classes.BankScene;
import Classes.BattleScene;
import Classes.Location;
import Classes.Scene;
import Classes.Weapons;

/**
 *
 * @author Kameron
 */
public class CIT260Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Bill The Kid");
        playerOne.setHighScore(4.00);
    
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    
        Location oneOne = new Location();
        
        oneOne.setRow(1);
        oneOne.setColumn(1);
        oneOne.setVisited(Boolean.TRUE);
        
        System.out.println(oneOne.toString());
        
       Weapons pistol = new Weapons(); 
       
       pistol.setType("hand gun");
       pistol.setPower(4);
       pistol.setAmmo(6);
       pistol.setAmmoType("45 slug");
       
       System.out.println(pistol.toString());
       
       Scene market = new Scene();
       
       market.setDescription("market");
       market.setTravelTime(4);
       
       System.out.println(market.toString());
       
       BankScene bank = new BankScene();
       
       bank.setDeposit(100);
       bank.setWithdraw(65);
       bank.setLoan(500);
       bank.setSavedMoney(699);
       
       System.out.println(bank.toString());
       
       BattleScene battle = new BattleScene();
       
       battle.setAmountOfEnemies(4);
       battle.setTypeOfEnemies("outlaws");
       
       System.out.println(battle.toString());
               
    
    }
}
