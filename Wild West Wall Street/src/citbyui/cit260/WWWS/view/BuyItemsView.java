/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import cit260.game.CIT260Game;
import control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class BuyItemsView extends View {
    private String menu;
    private String promptMessage;
    
    public BuyItemsView(){ //Initial View
             super( "\n"
                    +"\n----------------------------------"
                    +"\n| Store                          |"
                    +"\n----------------------------------"
                    +"\n1 - Pine Wood ($10)"
                    +"\n2 - Raw Iron ($25)"
                    +"\n3 - Shotgun Shells ($2)"
                    +"\nQ - Exit Menu"
                    +"\n----------------------------------"
                    +"\nWhat would you like to buy? ");
       
    }
    
     /*public void displayBuyItemsView() { //Calls functions to display initial view and prompt input
       
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
    }*/
    @Override
    public boolean doAction(String choice) {
      choice = choice.toUpperCase();
      
      switch(choice){
          case "1":
              this.buyItems(1, 10.0);
              break;
          case "2":
              this.buyItems(2, 25.0);
              break;
          case "3":
              this.buyItems(3, 2.0);
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }
    
    private void buyItems(int item, double price) {
        System.out.println("How much do you want to buy?");
        Scanner input = new Scanner(System.in);
        double numSold = input.nextDouble();
        
        InventoryControl buyItems = new InventoryControl();
        double total = buyItems.totalCost(numSold, price);
        
        if (item == 1){
            System.out.println("Bought " + numSold + " pine wood for $" 
                    + total + "\n");
        }
        else if (item == 2){
            System.out.println("Bought " + numSold + " raw iron for $" 
                    + total + "\n");
        }
        else if (item == 3){
            System.out.println("Bought " + numSold + " shotgun shells for $" 
                    + total + "\n");
        }
    }
}
