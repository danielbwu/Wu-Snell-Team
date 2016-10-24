/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1dani
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hitTarget method, of class BattleControl.
     */
    @Test
    public void testHitTarget() {
        System.out.println("Test 1: Same Range");
        int weaponRange = 2;
        int targetDistance = 2;
        BattleControl instance = new BattleControl();
        Boolean expResult = true;
        Boolean result = instance.hitTarget(weaponRange, targetDistance);
        assertEquals(expResult, result);
        
        System.out.println("Test 2: Out of range");;
        weaponRange = 1;
        targetDistance = 3;
        BattleControl instance1 = new BattleControl();
        expResult = false;
        result = instance1.hitTarget(weaponRange, targetDistance);
        assertEquals(expResult, result);
        
        System.out.println("Test 3: Too close for comfort");;
        weaponRange = 2;
        targetDistance = 0;
        BattleControl instance2 = new BattleControl();
        expResult = false;
        result = instance2.hitTarget(weaponRange, targetDistance);
        assertEquals(expResult, result);
        
        System.out.println("Test 4: Negative values");;
        weaponRange = -2;
        targetDistance = -5;
        BattleControl instance3 = new BattleControl();
        expResult = false;
        result = instance3.hitTarget(weaponRange, targetDistance);
        assertEquals(expResult, result);
        
        System.out.println("Test 5: Non-integers");;
        weaponRange = (int)1.5;
        targetDistance = (int)0.23;
        BattleControl instance4 = new BattleControl();
        expResult = false;
        result = instance4.hitTarget(weaponRange, targetDistance);
        assertEquals(expResult, result);
        
        System.out.println("Test 6: Above max range");;
        weaponRange = 4;
        targetDistance = 5;
        BattleControl instance5 = new BattleControl();
        expResult = false;
        result = instance5.hitTarget(weaponRange, targetDistance);
        assertEquals(expResult, result);
        
        System.out.println("Test 7: Fisticuffs");;
        weaponRange = 0;
        targetDistance = 0;
        BattleControl instance6 = new BattleControl();
        expResult = true;
        result = instance6.hitTarget(weaponRange, targetDistance);
        assertEquals(expResult, result);
        
        System.out.println("Test 8: Sniper duel");;
        weaponRange = 3;
        targetDistance = 3;
        BattleControl instance7 = new BattleControl();
        expResult = true;
        result = instance7.hitTarget(weaponRange, targetDistance);
        assertEquals(expResult, result);
        
        System.out.println("Test 9: Fish in a barrel");;
        weaponRange = 3;
        targetDistance = 1;
        BattleControl instance8 = new BattleControl();
        expResult = true;
        result = instance8.hitTarget(weaponRange, targetDistance);
        assertEquals(expResult, result);
        
    }
    
}
