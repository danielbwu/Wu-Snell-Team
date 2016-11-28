/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import Classes.Map;
import Classes.MapLocation;
import cit260.game.CIT260Game;
import control.MapControl;


/**
 *
 * @author Kameron
 */
public class DisplayMap {



    
    public void displayMap(){
        
       MapLocation[][] locations = CIT260Game.getCurrentGame().getMap().getLocations();
        
        System.out.println("           Wild Wild West");
        System.out.println("   1  2  3  4  5  6  7  8  9  10\n"
                + "-------------------------------------");
       for(int row = 1;row< 11;row++){
            System.out.println(row + "|  |  |  |  |  |  |  |  |  |  |");
            for(int column = 1;column <2; column++){
              System.out.println("-------------------------------------");
                
              MapLocation location = locations[row][column];
              if(location.isVisited()){
              System.out.println(location.getScene().getDisplaySymbol());
              }
                      
              else{
                  System.out.println ("??");
              }
    }
    
       }
    }
}