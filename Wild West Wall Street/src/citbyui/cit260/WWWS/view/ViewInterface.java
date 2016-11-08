/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public interface ViewInterface {
 public void display();
 public String getInput();
 public boolean doAction(String value);
    

    
  /* public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;

        while (!valid) {
          //  System.out.println("\n" + this.displayMessage);

            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                System.out.println("\nInvalid vaule: value can not be blank");
                continue;
            }
            break;
        }
        return selection;
    }*/
}
