/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import Exceptions.MapControlException;
import cit260.game.CIT260Game;
import control.GameControl;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Kameron
 */
public class MainMenuView extends View {

    
public MainMenuView() {
              super("\n"
                    +"\n----------------------------------"
                    +"\n| Main Menu                      |"
                    +"\n----------------------------------"
                    +"\nN - Start new game"
                    +"\nL - Load saved game"
                    +"\nH - Help"
                    +"\nS - Save game"
                    +"\nQ - Quit"
                    +"\n----------------------------------"
                    +"\nPlease select an option: ");
        
    }

@Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
      
      switch(value){
          case "N":
      {
          try {
              this.startNewGame();
          } catch (MapControlException ex) {
             System.out.println(ex.getMessage());
          }
      }
              break;
          case "L":
              this.startExistingGame();
              break;
          case "H":
              this.displayHelpMenu();
              break;
          case "S":
              this.saveGame();
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }

    private void startNewGame() throws MapControlException {
     GameControl.createNewGame(CIT260Game.getPlayer());
     
     GameMenuView gameMenu = new GameMenuView();
     gameMenu.displayGameMenuView();
       
    }

    private void startExistingGame() {
       // System.out.println("startExistingGame calld");
       TreasureChestView treasureChest = new TreasureChestView();
       treasureChest.displayTreasurchestView();
     
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        BattleIntroView battleMenu = new BattleIntroView();
        battleMenu.display();
    }
    
}
