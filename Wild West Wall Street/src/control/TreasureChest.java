/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static java.lang.Math.PI;

/**
 *
 * @author Kameron
 */
public class TreasureChest {
       
    public static double calcVolumeOfCone(double height, double diameter){
       
        if (height < 1){
          //  System.out.println("\nInvalid input: Height must be higher then 0.");
        return -1;
        }
        if (diameter < 0 || diameter >12){
          //  System.out.println("Invalid input: Diameter must be between 1 and 12.");
                return -1;
        }
        
        
        double radius = diameter/2;
        double volume = ((1.0/3.0) * PI * radius * radius * height);
        return volume;
        
    }
    
}
