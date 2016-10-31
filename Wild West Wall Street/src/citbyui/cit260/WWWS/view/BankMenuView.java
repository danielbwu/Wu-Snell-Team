/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import cit260.game.CIT260Game;
import control.GameControl;
import java.util.Scanner;


public class BankMenuView {
    private String menu;
    private String promptMessage;
    
public BankMenuView() {
        this.menu = "\n"
                    +"\n----------------------------------"
                    +"\n|  Welcome to the Bank                     |"
                    +"\n----------------------------------"
                    +"\nL - Loan"
                    +"\nB - Check Balances"
                    +"\nD - Deposit money"
                    +"\nW - Withdraw money"
                    +"\nH - Help"
                    +"\nQ - Quit"
                    +"\n----------------------------------";
        
         this.promptMessage = "\nPlease select an option: ";
    }

   

  public void displayBankMenuView() {
       
      boolean done = false;
      do {
          String bankMenuOption =this.getBankMenuOption();
          if (bankMenuOption.toUpperCase().equals("Q"))
              return;
          
          done = this.doAction(bankMenuOption);
          
      }while(!done);
    }

    private String getBankMenuOption() {
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
          case "L":
              this.getLoan();
              break;
          case "B":
              this.getBalances();
              break;              
          case "D":
              this.depositMoney();
              break;
          case "W":
              this.withdrawMoney();
              break;
          case "H":
              this.loanHelpMenu();
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      return false;
    }

    private void getLoan() {
     System.out.println("displays loan options");
       
    }
    private void getBalances() {
        System.out.println("Displays balance is savings and how much money left on loan");
       
    }    
    private void depositMoney() {
        System.out.println("asks for amount of money wanted to deposit");
       
    }
    
    private void withdrawMoney() {
        System.out.println("asks how much money wanted to withdraw");
    }

    private void loanHelpMenu() {
        System.out.println("At the beginning of the game, you will take out a\n"
             + "loan to start a small business.\n"
             + "You choose the loan amount and interest rate.\n"
             + "A smaller loan and/or higher interest rate increases difficulty."
             + "At the end of each month, a regular payment will automatically\n"
             + "be withdrawn from your bank account.\n");
    }
    
}
