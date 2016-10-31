/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import Classes.Player;
import control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Kameron
 */
public class TreasureChestView {
       private String promptMessage;
   
  public TreasureChestView() {
            
      
       this.promptMessage = "\nPlease enter your name: ";
       this.displayMessage();
    
      
    } 
    
    
    public void displayMessage() {
        
        System.out.println(
        "\n***************************************************"
        +"\n*                                                *"
        +"\n* You have stumbled upon a Treasure Chest!!!     *"
        +"\n* It seems to contain lots of treasure           *"
        +"\n* the only problem is, it seems to be locked     *"
        +"\n* by a combination lock                          *"
        +"\n* luckily we know the combination is the volume  *"
        +"\n* of the treasure chest, so you must figure out  *"
        +"\n* the height and diameter of the treasure chest  *"
        +"\n* then we can crack the lock, but be warned you  *"
        +"\n* you only have three shots at it before it      *"
        +"\n* becomes impossible, good luck!!!!              *"
        );
    }
      public void displayTreasureChestView() {
      
          boolean done = false;
          do {
              String playersName = this.getPlayersName();
              if(playersName.toUpperCase().equals ("Q"))
                  return;
              
              done = this.doAction(playersName);
              
          } while (!done);
          
          /*
          do 
               prompt for and get playerName
               if playersName == 'Q' then
               return
          do requested action and display next view
          while the view is not done
          */
    }

    private String getTreasureChest() {
    
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
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

    private boolean doAction(String playersName) {
        if(playersName.length() < 2) {
           System.out.println("\nInvalid players name: "
           + "This name must be greater than one character length");
           return false;
        }
        
    Player player = GameControl.createPlayer(playersName);
    
    if (player == null) {
        System.out.println("\nError creating the player.");
        return false;
    }
    
    this.displayNextView(player);
     
    return true;
    }

    private void displayNextView(Player player) {
       System.out.println("\n========================================="
                         +"\n Welcome to the game " + player.getName()
                         +"\n We hope you enjoy!"
                         + "\n========================================");
       MainMenuView mainMenuView = new MainMenuView();
              
       mainMenuView.displayMainMenuView();
    }
    
}
