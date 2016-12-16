/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import cit260.game.CIT260Game;
import control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Kameron
 */
public class HelpMenuView extends View {
    private String menu;
    private String promptMessage;
    
public HelpMenuView() {
               super("\n"
                    +"\n----------------------------------"
                    +"\n| Help Menu                     |"
                    +"\n----------------------------------"
                    +"\nG - Goal of the game"
                    +"\nM - Moving"
                    +"\nD - Map Symbols" 
                    +"\nT - Time"
                    +"\nQ - Quit"
                    +"\n----------------------------------"
                    +"\nPlease select an option: ");
        
         
    }

@Override
    public boolean doAction(String choice) {
      choice = choice.toUpperCase();
      
      switch(choice){
          case "G":
              this.goalGame();
              break;
          case "M":
              this.movingHelpMenu();
              break;
          case "D":
              this.mapSymbols();
              break;
          case "T":
              this.timeHelpMenu();
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }

    private void goalGame() {
     System.out.println("The Goal of Wild West Wall Street is to buy low, sell high\n"
             + "You start off with a loan and you need to pay it back before the\n"
             + "loan sharks come after you. Its a race against time so you best hurry!!");
       
    }

    private void combatTutorial() {
        System.out.println("Shots will only hit if enemies are within range\n"
             + "of your weapon.\n"
             + "If enemies are too close, only melee weapons will work\n");
       
    }

    private void loanHelpMenu() {
        System.out.println("At the beginning of the game, you will take out a\n"
             + "loan to start a small business.\n"
             + "You choose the loan amount and interest rate.\n"
             + "A smaller loan and/or higher interest rate increases difficulty."
             + "At the end of each month, a regular payment will automatically\n"
             + "be withdrawn from your bank account.\n");
    }

    private void movingHelpMenu() {
        System.out.println("Movement Controls:\n"
                + "From the movement menu, enter the map coordinates"
                + "in the format <y,x>");
    }
    private void mapSymbols() {
        System.out.println("Map Symbols:\n"
                + "DS - Desert\n"
                + "TC - Treasure Chest\n"
                + "PW - Pine Wood\n"
                + "RI - Raw Iron\n"
                + "FW - Fresh Water\n"
                + "LA - Lake\n"
                + "MT - Mountain\n");
    }
    private void timeHelpMenu() {
        System.out.println("Game Time:"
                + "This game runs on a timer. Time passes every time you move\n"
                + "to a new location on the map. Faster wagons cause less time\n"
                + "to pass as you move across the map.\n");
    }
    
}
    

