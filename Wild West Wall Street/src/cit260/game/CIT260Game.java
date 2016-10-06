/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 *test1234232efgrdfd
 */
package cit260.game;

import Classes.Player;

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
    
    }
}
