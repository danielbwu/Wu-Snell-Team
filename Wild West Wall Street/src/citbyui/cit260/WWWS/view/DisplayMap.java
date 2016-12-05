/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import Classes.Location;
import Classes.Map;
import Classes.Location;
import cit260.game.CIT260Game;
import control.MapControl;

/**
 *
 * @author Kameron
 */
public class DisplayMap {

    public void displayMap() {

        Location[][] locations = CIT260Game.getCurrentGame().getMap().getLocations();

        System.out.println("           Wild Wild West");
        System.out.println("    1    2    3    4    5    6    7    8    9    10\n"
                + "----------------------------------------------------");
        for (int row = 0; row < locations.length; row++) {
            System.out.print("\n" + (row + 1));
            System.out.print("| ");
            
            for (int column = 0; column < locations[row].length; column++) {
                
                Location location = locations[row][column];
                if (location.isVisited()) {
                    System.out.print(location.getScene().getDisplaySymbol());
                } else {
                    System.out.print("??");
                }
                   System.out.print("|");
            }
            System.out.print("\n" + "------------------------------------------------------");
        }
    }
}
