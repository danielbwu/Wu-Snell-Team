/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.WWWS.view;

import Exceptions.TreasureChestException;
import control.TreasureChest;
import java.util.Scanner;

/**
 *
 * @author Kameron
 */
public class TreasureChestView extends View {

    private String promptMessage;
  

    public TreasureChestView() {

        this.promptMessage =("\nPlease enter the height: ");

        this.displayMessage();

    }

    public void displayMessage() {

        System.out.println(
                "\n***************************************************"
                + "\n*                                                *"
                + "\n* You have stumbled upon a Treasure Chest!!!     *"
                + "\n* It seems to contain lots of treasure           *"
                + "\n* the only problem is, it is locked     *"
                + "\n* by a combination lock                          *"
                + "\n* luckily we know the combination is the heighth  *"
                + "\n* of the treasure chest, so you must figure out  *"
                + "\n* the height of the treasure chest  *"
                + "\n* then we can crack the lock, but be warned you  *"
                + "\n* you only have three shots at it before it      *"
                + "\n* becomes impossible, good luck!!!!              *"
        );
    }

    public void displayTreasurchestView() {
        String strHeight = "";

        boolean done = false;

        do {
            strHeight = this.getInput();

            done = this.doAction(strHeight);
        } while (!done);

    }
@Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine();

            if (value.length() < 1) {
                System.out.println("\nInvalid vaule: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }
  
@Override
    public boolean doAction(String strHeight) {

        double volume = 0;
        this.promptMessage =  "\nPlease enter the diameter: ";
        String strDiameter = this.getInput();
        
        double height = Double.parseDouble(strHeight);
        double diameter = Double.parseDouble(strDiameter);
        
        try {
        volume = TreasureChest.calcVolumeOfCone(height, diameter);
        } catch(TreasureChestException ex)
        {
            System.out.println(ex.getErrorMessage());
        }
        if (volume < 0) {
            System.out.println("\nError. Volume cannot be less than 1. Please try again");
            return false;
        }
        
           System.out.println("\nThe volume is " + volume);
           return true;
    }

}
