/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import java.util.Scanner;

/**
 *
 * @author Kameron
 */
public class MainMenuView {
    private String menu;
    private String promptMessage;
    
public MainMenuView() {
        this.menu = "\n"
                    +"\n----------------------------------"
                    +"\n| Main Menu                      |"
                    +"\n----------------------------------"
                    +"\nN - Start new game"
                    +"\nL - Load saved game"
                    +"\nH - Help"
                    +"\nS - Save game"
                    +"\nQ - Quit"
                    +"\n----------------------------------";
        
         this.promptMessage = "\nPlease select an option: ";
    }

   

  public void displayMainMenuView() {
       
      boolean done = false;
      do {
          String menuOption =this.getMenuOption();
          if (menuOption.toUpperCase().equals("Q"))
              return;
          
          done = this.doAction(menuOption);
          
      }while(!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        System.out.println(this.menu);
        
        while (!valid){
            System.out.println("\n" + this.promptMessage);
           
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
          case "N":
              this.startNewGame();
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

    private void startNewGame() {
       System.out.println("startNewGame Called");
       
    }

    private void startExistingGame() {
        System.out.println("startExistingGame calld");
       
    }

    private void displayHelpMenu() {
        System.out.println("displayHelpMenu called");
    }

    private void saveGame() {
        System.out.println("saveGame called");
    }
    
}
