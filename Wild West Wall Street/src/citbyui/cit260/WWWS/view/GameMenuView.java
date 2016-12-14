/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import control.InventoryControl;
import Classes.Player;
import cit260.game.CIT260Game;
import java.util.Scanner;
import Classes.Player;

/**
 *
 * @author Kameron
 */
public class GameMenuView {
    private String menu;
    private String promptMessage;
    
public GameMenuView() {
        this.menu = "\n----------------------------------"
                  + "\n|    Game Menu                   |"
                  + "\n----------------------------------"
                  + "\nI - Inventory                 "
                  + "\nD - Display Map                "
                  + "\nM - Move                        "
                  + "\nB - Bank                         "
                  + "\nP - Shop                         " 
                  + "\nH - Help                          " 
                  + "\nQ - Quit"
                  + "\n----------------------------------";
        
         this.promptMessage = "\nPlease select an option: ";
    }

   

  public void displayGameMenuView() {
       
      boolean done = false;
      do {
          String gameMenuOption =this.getGameMenuOption();
          if (gameMenuOption.toUpperCase().equals("Q"))
              return;
          
          done = this.doAction(gameMenuOption);
          
      }while(!done);
    }

    private String getGameMenuOption() {
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
          case "I":
              this.seeInventory();
              break;
         case "D":
              this.displayMap();
              break;
         case "M":
              this.movePlayer();
              break;
          case "P":
              this.openShop();
              break;
          case "H":
              this.helpMenu();
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }

    private void seeInventory() {
        InventoryControl seeInventory = new InventoryControl();
        seeInventory.displayInventory(CIT260Game.getCurrentGame().getPlayer().getInventory(), CIT260Game.getCurrentGame().getPlayer().getMoney());
    }
    
    private void displayMap() {
       DisplayMap displayMap = new DisplayMap();
       displayMap.displayMap();
    }
   
    private void openShop() {
       // System.out.println("dipslay current progress in game");
       ShopMenuView shopMenu = new ShopMenuView();
       shopMenu.display();

    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    

    private void movePlayer(){
    MovePlayerView movePlayerView = new MovePlayerView();
    movePlayerView.display();
    
    }

    
}

    

