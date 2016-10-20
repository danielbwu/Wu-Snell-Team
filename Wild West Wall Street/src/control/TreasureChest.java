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
       
    public double calcVolumeOfCone(double height, double diameter){
        
        if (height <0)
            return -1;
        if (diameter < 0 || diameter >12)
            return -1;
        
        double radius = diameter/2;
        double volume = ((1/3) * PI * radius * radius * height);
        return volume;
        
    }
    
}
