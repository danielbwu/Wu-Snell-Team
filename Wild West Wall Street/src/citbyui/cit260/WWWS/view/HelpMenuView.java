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
public class HelpMenuView {
    private String menu;
    private String promptMessage;
    
public HelpMenuView() {
        this.menu = "\n"
                    +"\n----------------------------------"
                    +"\n| Help Menu                     |"
                    +"\n----------------------------------"
                    +"\nG - Goal of the game"
                    +"\nC - Combat tutorial"
                    +"\nL - How loans work"
                    +"\nM - Moving"
                    +"\nT - Time"
                    +"\nQ - Quit"
                    +"\n----------------------------------";
        
         this.promptMessage = "\nPlease select an option: ";
    }

   

  public void displayHelpMenuView() {
       
      boolean done = false;
      do {
          String helpMenuOption =this.getHelpMenuOption();
          if (helpMenuOption.toUpperCase().equals("Q"))
              return;
          
          done = this.doAction(helpMenuOption);
          
      }while(!done);
    }

    private String getHelpMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.promptMessage +this.menu);
           
            value = keyboard.nextLine();
            value = value.trim();
            
           
            if(value.length() <1) {
                System.out.println("\nInvalid vaule: value can not be blank");
                continue;    
                
            }
            break;
       
        }
        return value;
    }

    private boolean doAction(String choice) {
      choice = choice.toUpperCase();
      
      switch(choice){
          case "G":
              this.goalGame();
              break;
          case "C":
              this.combatTutorial();
              break;
          case "L":
              this.loanHelpMenu();
              break;
          case "M":
              this.movingHelpMenu();
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
                + "\tW - North\n"
                + "\tA - West\n"
                + "\tS - South\n"
                + "\tD - East\n");
    }
    private void timeHelpMenu() {
        System.out.println("Game Time:"
                + "This game runs on a timer. Time passes every time you move\n"
                + "to a new location on the map. Faster wagons cause less time\n"
                + "to pass as you move across the map.\n");
    }
    
}
    

