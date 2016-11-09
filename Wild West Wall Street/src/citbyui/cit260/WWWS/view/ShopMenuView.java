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
public class ShopMenuView extends View {
    private String menu;
    private String promptMessage;
    
    public ShopMenuView(){ //Initial View
               super("\n"
                    +"\n----------------------------------"
                    +"\n| Shop                           |"
                    +"\n----------------------------------"
                    +"\nB - Buy"
                    +"\nS - Sell"
                    +"\nQ - Exit Menu"
                    +"\n----------------------------------"
                    +"\nPlease select an option: ");
    }
    
    /* public void displayShopMenuView() { //Calls functions to display initial view and prompt input
       
      boolean done = false;
      do {
          String shopMenuOption =this.getShopMenuOption();
          if (shopMenuOption.toUpperCase().equals("Q"))
              return;
          
          done = this.doAction(shopMenuOption);
          
      }while(!done);
    }

    private String getShopMenuOption() { //Gets input
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
          case "B":
              this.buyItems();
              break;
          case "S":
              this.sellItems();
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }
    
    private void buyItems() {
        //System.out.println("buyItems() calld");
        BuyItemsView buyItems = new BuyItemsView();
        buyItems.display();
       
    }
    private void sellItems() {
        System.out.println("sellItems calld");
       
    }
}
