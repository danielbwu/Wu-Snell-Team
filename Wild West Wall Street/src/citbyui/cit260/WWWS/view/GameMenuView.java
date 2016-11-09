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
public class GameMenuView {
    private String menu;
    private String promptMessage;
    
public GameMenuView() {
        this.menu = "\n"
                    +"\n----------------------------------"
                    +"\n|  Game Menu                   |"
                    +"\n----------------------------------"
                    +"\nI - Inventory"
                    +"\nB - Bank"
                    +"\nP - Progress (Shop Menu test)"
                    +"\nH - Help"
                    +"\nQ - Quit"
                    +"\n----------------------------------";
        
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
          case "B":
              this.seeBank();
              break;
          case "P":
              this.seeProgress();
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
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }

    private void seeBank() {
        BankMenuView bankMenu = new BankMenuView();
        bankMenu.display();
       
    }
    
    private void seeProgress() {
       // System.out.println("dipslay current progress in game");
       ShopMenuView shopMenu = new ShopMenuView();
       shopMenu.display();

    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    
}

    

