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
 * @author Daniel
 */
public class InventoryMenuView extends View {
    private String menu;
    private String promptMessage;
    
    public InventoryMenuView(){ //Initial View
               super("\n"
                    +"\n----------------------------------"
                    +"\n| Inventory                      |"
                    +"\n----------------------------------"
                    +"\nP - Player"
                    +"\nW - Wagon"
                    +"\nQ - Exit Menu"
                    +"\n----------------------------------"
                    +"\nPlease select an option: ");
    }
    
     /*public void displayInventoryMenuView() { //Calls functions to display initial view and prompt input
       
      boolean done = false;
      do {
          String inventoryMenuOption =this.getInventoryMenuOption();
          if (inventoryMenuOption.toUpperCase().equals("Q"))
              return;
          
          done = this.doAction(inventoryMenuOption);
          
      }while(!done);
    }

    private String getInventoryMenuOption() { //Gets input
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
    }*/
    @Override
    public boolean doAction(String choice) {
      choice = choice.toUpperCase();
      
      switch(choice){
          case "P":
              this.playerInventory();
              break;
          case "W":
              this.wagonInventory();
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }
    
    private void playerInventory() {
        System.out.println("playerInventory calld");
       
    }
    private void wagonInventory() {
        System.out.println("wagonInventory calld");
       
    }
}
