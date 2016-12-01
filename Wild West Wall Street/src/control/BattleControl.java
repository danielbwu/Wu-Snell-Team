/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Classes.Weapons;

/**
 *
 * @author Daniel
 */
public class BattleControl {
    
    public Boolean hitTarget(int weaponRange, int targetDistance){
        if (targetDistance == 0 && weaponRange != 0) //0 is melee range. Melee weapons only
            return false;
        else if (targetDistance < 0 || weaponRange < 0)
            return false;
        else if (targetDistance > 3 || weaponRange > 3)
            return false;
        else if (targetDistance % 1 != 0 || weaponRange % 1 != 0)
            return false;
        else if (weaponRange >= targetDistance)
            return true;
        else
            return false;
    }

    
/*    public double attackTarget(double targetHealth, double weaponDamage, int weaponRange, int targetDistance){
        
        call hitTarget()
        if true subtract damage from target health
        if false return -1
        
        return -1;
    }
*/
}
