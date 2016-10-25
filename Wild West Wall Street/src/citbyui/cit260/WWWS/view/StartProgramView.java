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
public class StartProgramView {
    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
    /*    Scanner inFile;
        inFile = new Scanner(System.in);
        String name = inFile.nextLine();
    */    
        this.displayBanner();
    }
    

    private void displayBanner() {
        
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
      System.out.println("\n**** displayStartProgram() function called ***");
    }
}
