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
public class BuyItemsView {
    private String menu;
    private String promptMessage;
    
    public BuyItemsView(){ //Initial View
        this.menu = "\n"
                    +"\n----------------------------------"
                    +"\n| Inventory                      |"
                    +"\n----------------------------------"
                    +"\n1 - Pine Wood ($10)"
                    +"\n2 - Raw Iron ($25)"
                    +"\n3 - Shotgun Shells[5] ($5)"
                    +"\nQ - Exit Menu"
                    +"\n----------------------------------";
        this.promptMessage = "\nWhat would you like to buy? ";
    }
    
     public void displayBuyItemsView() { //Calls functions to display initial view and prompt input
       
      boolean done = false;
      do {
          String buyItemsOption =this.getBuyItemsOption();
          if (buyItemsOption.toUpperCase().equals("Q"))
              return;
          
          done = this.doAction(buyItemsOption);
          
      }while(!done);
    }

    private String getBuyItemsOption() { //Gets input
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
          case "1":
              this.buyItems(10.0);
              break;
          case "2":
              this.buyItems(25.0);
              break;
          case "3":
              this.buyItems(5.0);
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }
    
    private void buyItems(double price) {
        System.out.println("buyItems() calld");
       
    }
}
