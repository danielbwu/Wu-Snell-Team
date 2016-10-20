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
public class BankControlTest {
    
    public BankControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcMonthlyPayment method, of class BankControl.
     */
    @Test
    public void testCalcMonthlyPayment() {
        System.out.println("\tTest Case #1");
        double initialLoan = 2000.0;
        double apr = 0.15;
        BankControl instance = new BankControl();
        double expResult = 193.46;
        double result = instance.calcMonthlyPayment(initialLoan, apr);
        assertEquals(expResult, result, 193.46);
        // TODO review the generated test code and remove the default call to fail.
        
        /*
         * Test Case 2
        */
        System.out.println("\tTest Case #2");
        
        //Inputs
        initialLoan = 2000.0;
        apr = -0.23;
        BankControl instance2 = new BankControl();
        expResult = -1.0;
        
        //Call function to run test
        result = instance2.calcMonthlyPayment(initialLoan, apr);
        
        //Compares expected and actual return values
        assertEquals(expResult, result, -1.0);
       
        /*
         * Test Case 3
        */
        System.out.println("\tTest Case #3");
        
        //Inputs
        initialLoan = -1800.0;
        apr = 0.15;
        BankControl instance3 = new BankControl();
        expResult = -1.0;
        
        //Call function to run test
        result = instance3.calcMonthlyPayment(initialLoan, apr);
        
        //Compares expected and actual return values
        assertEquals(expResult, result, -1.0);
        
        /*
         * Test Case 4
        */
        System.out.println("\tTest Case #4");
        
        //Inputs
        initialLoan = 2000.0;
        apr = 0.001;
        BankControl instance4 = new BankControl();
        expResult = -1.0;
        
        //Call function to run test
        result = instance4.calcMonthlyPayment(initialLoan, apr);
        
        //Compares expected and actual return values
        assertEquals(expResult, result, -1.0);
        
        /*
         * Test Case 5
        */
        System.out.println("\tTest Case #5");
        
        //Inputs
        initialLoan = 1000.0;
        apr = 0.0;
        BankControl instance5 = new BankControl();
        expResult = -1.0;
        
        //Call function to run test
        result = instance5.calcMonthlyPayment(initialLoan, apr);
        
        //Compares expected and actual return values
        assertEquals(expResult, result, -1.0);
        
        /*
         * Test Case 6
        */
        System.out.println("\tTest Case #6");
        
        //Inputs
        initialLoan = 0.0;
        apr = 0.5;
        BankControl instance6 = new BankControl();
        expResult = 0.0;
        
        //Call function to run test
        result = instance6.calcMonthlyPayment(initialLoan, apr);
        
        //Compares expected and actual return values
        assertEquals(expResult, result, 0.0);
        
        /*
         * Test Case 7
        */
        System.out.println("\tTest Case #7");
        
        //Inputs
        initialLoan = 1.0;
        apr = 0.1;
        BankControl instance7 = new BankControl();
        expResult = 0.09206;
        
        //Call function to run test
        result = instance7.calcMonthlyPayment(initialLoan, apr);
        
        //Compares expected and actual return values
        assertEquals(expResult, result, 0.09206);
    
    }
    
    
}
