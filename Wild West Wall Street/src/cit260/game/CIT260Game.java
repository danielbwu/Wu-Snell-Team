/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 *test1234232efgrdfd
 */
package cit260.game;

import Classes.Player;
import Classes.bankScene;
import Classes.battleScene;
import Classes.location;
import Classes.scene;
import Classes.weapons;

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
    
        location oneOne = new location();
        
        oneOne.setRow(1);
        oneOne.setColumn(1);
        oneOne.setVisited(Boolean.TRUE);
        
        System.out.println(oneOne.toString());
        
       weapons pistol = new weapons(); 
       
       pistol.setType("hand gun");
       pistol.setPower(4);
       pistol.setAmmo(6);
       pistol.setAmmoType("45 slug");
       
       System.out.println(pistol.toString());
       
       scene market = new scene();
       
       market.setDescription("market");
       market.setTravelTime(4);
       
       System.out.println(market.toString());
       
       bankScene bank = new bankScene();
       
       bank.setDeposit(100);
       bank.setWithdraw(65);
       bank.setLoan(500);
       bank.setSavedMoney(699);
       
       System.out.println(bank.toString());
       
       battleScene battle = new battleScene();
       
       battle.setAmountOfEnemies(4);
       battle.setTypeOfEnemies("outlaws");
       
       System.out.println(battle.toString());
               
    
    }
}
