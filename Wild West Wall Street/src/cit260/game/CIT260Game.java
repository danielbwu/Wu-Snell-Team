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
import Classes.Character;
import Classes.Game;
import Classes.Item;
import Classes.Map;
import Classes.Product;
import Classes.Wagon;

/**
 *
 * @author Kameron
 */
public class CIT260Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Player
        Player playerOne = new Player();
        
        playerOne.setName("Bill The Kid");
        playerOne.setHighScore(4.00);
    
    
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
        //Location
        Location oneOne = new Location();
        
        oneOne.setRow(1);
        oneOne.setColumn(1);
        oneOne.setVisited(Boolean.TRUE);
        
        System.out.println(oneOne.toString());
        
        //Weapon - Pistol
        Weapons pistol = new Weapons(); 
       
        pistol.setType("hand gun");
        pistol.setPower(4);
        pistol.setAmmo(6);
        pistol.setAmmoType("45 slug");
       
        System.out.println(pistol.toString());
       
        //Scene - Market
        Scene market = new Scene();
       
        market.setDescription("market");
        market.setTravelTime(4);
       
        System.out.println(market.toString());
       
        //BankScene
        BankScene bank = new BankScene();
       
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
               
        //Character - Sid
        Character Sid = new Character();
        
        Sid.setName("Sid");
        Sid.setLocation("Thatch Town");
        Sid.setDescription("A middle-aged man in a brown suit and slacks.");
        
        System.out.println(Sid.toString());
        
        //Game
        Game slotOne = new Game();
        
        slotOne.setTotalTime(360);
        
        System.out.println(slotOne.toString());
        
        //Map
        Map wildWest = new Map();
        
        wildWest.setRowCount(5);
        wildWest.setColumnCount(5);
        
        System.out.println(wildWest.toString());
        
        //Item
        Item pineWood = new Item();
        
        pineWood.setItemName("Pine Wood");
        pineWood.setItemDescription("Useful for building. Can be bought and sold at markets.");
        pineWood.setInventoryType("Material");
        pineWood.setNoInStock(25);
        
        System.out.println(pineWood.toString());
        
        //Product
        Product ironBar = new Product();
        
        ironBar.setValue(20);
        ironBar.setNoInStock(32);
        
        System.out.println(ironBar.toString());
        
        //Wagon
        Wagon oldWagon = new Wagon();
        
        oldWagon.setSpeed(10);
        oldWagon.setHealth(50);
        oldWagon.setMaxCapacity(100);
        oldWagon.setCurrentCapacity(23);
        
        System.out.println(oldWagon.toString());
    }
}
