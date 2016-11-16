/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SellItemsView extends View {
    
    public SellItemsView(){ //Initial View
             super( "\n"
                    +"\n----------------------------------"
                    +"\n| Store                          |"
                    +"\n----------------------------------"
                    +"\n1 - Pine Wood ($15)"
                    +"\n2 - Raw Iron ($15)"
                    +"\n3 - Leather ($7)"
                    +"\nQ - Exit Menu"
                    +"\n----------------------------------"
                    +"\nWhat would you like to sell? ");
       
    }
    
    @Override
    public boolean doAction(String choice) {
      choice = choice.toUpperCase();
      
      switch(choice){
          case "1":
              this.sellItems(1, 15.0);
              break;
          case "2":
              this.sellItems(2, 15.0);
              break;
          case "3":
              this.sellItems(3, 7.0);
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }
    
    private void sellItems(int item, double price) {
        System.out.println("How many would you like to sell?");
        Scanner input = new Scanner(System.in);
        double numSold = input.nextDouble();
        
        InventoryControl buyItems = new InventoryControl();
        double total = buyItems.totalCost(numSold, price);
        
        if (item == 1){
            System.out.println("Sold " + numSold + " pine wood for $" 
                    + total + "\n");
        }
        else if (item == 2){
            System.out.println("Sold " + numSold + " raw iron for $" 
                    + total + "\n");
        }
        else if (item == 3){
            System.out.println("Sold " + numSold + " leather for $" 
                    + total + "\n");
        }
    }
}
