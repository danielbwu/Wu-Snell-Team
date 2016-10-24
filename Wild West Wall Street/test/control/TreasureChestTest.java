/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kameron
 */
public class TreasureChestTest {
    
    public TreasureChestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcVolumeOfCone method, of class TreasureChest.
     */
    @Test
    public void testCalcVolumeOfCone() {
        System.out.println("\t test case 1");
        double height = 15.0;
        double diameter = 8.0;
        TreasureChest instance = new TreasureChest();
        double expResult = 251.33;
        double result = instance.calcVolumeOfCone(height, diameter);
        assertEquals(expResult, result,251.33);
        
        System.out.println("\t test case 2");
         height = -1.0;
         diameter = 4.0;
        TreasureChest instance2 = new TreasureChest();
         expResult = -1.0;
         result = instance.calcVolumeOfCone(height, diameter);
        assertEquals(expResult, result, -1.0);
        
        System.out.println("\t test case 3");
         height = 19.0;
         diameter = -1.0;
        TreasureChest instance3 = new TreasureChest();
         expResult = -1.0;
         result = instance.calcVolumeOfCone(height, diameter);
        assertEquals(expResult, result, -1.0);
        
        System.out.println("\t test case 4");
         height = 5.0;
         diameter = 15.0;
        TreasureChest instance4 = new TreasureChest();
         expResult = -1.0;
         result = instance.calcVolumeOfCone(height, diameter);
        assertEquals(expResult, result, -1.0);
        
        System.out.println("\t test case 5");
         height = 0.0;
         diameter = 12.0;
        TreasureChest instance5 = new TreasureChest();
         expResult = 0.0;
         result = instance.calcVolumeOfCone(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t test case 6");
         height = 20.0;
         diameter = 0.0;
        TreasureChest instance6 = new TreasureChest();
         expResult = 0.0;
         result = instance.calcVolumeOfCone(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t test case 7");
         height = 20.0;
         diameter = 12.0;
        TreasureChest instance7 = new TreasureChest();
        expResult = 753.98;
        result = instance.calcVolumeOfCone(height, diameter);
        assertEquals(expResult, result, 753.98);
    }
    
}
