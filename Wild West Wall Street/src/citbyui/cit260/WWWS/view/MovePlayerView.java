/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import Classes.Player;
import Exceptions.MapControlException;
import cit260.game.CIT260Game;
import citbyui.cit260.WWWS.view.View;
import control.MapControl;
import java.awt.Point;
import Classes.Character;

/**
 *
 * @author Kameron
 */
public class MovePlayerView extends View {
    
    public MovePlayerView(){
        super("Please enter Coordinates: ");
    }

    @Override
    public boolean doAction(String value) {
        //pull out the row number and column number
        value = value.trim();
        int comma = value.indexOf(",");
       if(comma < 0){
           System.out.println("Please use comma between row and column number");
           return false;
       }
        String rowValue = value.substring(0, comma);
        String columnValue = value.substring(comma + 1);
        //convert to ints
        int row;
        int column;
        try{ 
         row =Integer.parseInt(rowValue);
         column = Integer.parseInt(columnValue);
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid row or column number");
            return false;
        }
        //move player
        Character character = Classes.Character.Player;
        Point coordinates = new Point(row,column);
        try{
        MapControl.movePlayerToLocation(character, coordinates);
        }
        catch(MapControlException mc){
            System.out.println(mc.getMessage());
            return false;
        }
        //dsiplay map
        DisplayMap displayMap = new DisplayMap();
        displayMap.displayMap();
        
        return true;
        
    }
    
}
