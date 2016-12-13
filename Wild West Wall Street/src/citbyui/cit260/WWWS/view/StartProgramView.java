/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;
import Classes.Player;
import Exceptions.MapControlException;
import control.GameControl;
import java.util.Scanner;
/**
 *
 * @author Kameron
 */
public class StartProgramView extends View{
   private String promptMessage;
   
  public StartProgramView() {
             
      
       this.promptMessage = "\nPlease enter your name: ";
       this.displayBanner();
        /* Scanner inFile;
        inFile = new Scanner(System.in);
        String name = inFile.nextLine();
    */    
      
    } 
    
    
    public void displayBanner() {
        
        System.out.println(
        "\n***************************************************"
        +"\n*                                                *"
        +"\n* Welcome to Wild West Wall Street               *"
        +"\n* The name of the game is to buy cheap, sell high*"
        +"\n* but watch out for them bandits, they will rob  *"
        +"\n* you blind.                                     *"
        +"\n* The first thing you need to do is get a loan   *"
        +"\n* from the trusty bank and start the business of *"
        +"\n* yours right up.                                *"
        +"\n* its a race agianst time so you best hurry!!!   *"
        );
    }
      public void displayStartProgramView() {
      
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

    private String getPlayersName() {
    
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
@Override
    public boolean doAction(String playersName) {
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
        mainMenuView.display();
    }

}
