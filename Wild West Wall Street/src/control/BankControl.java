/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author 1dani
 */
public class BankControl {
    
    public double calcMonthlyPayment(double initialLoan, double apr){
        if (apr < 0.1)
            return -1;
        if (initialLoan < 0)
            return -1;
        
        double amtOwed = initialLoan * Math.pow((1 + apr / 12), 12);
        double monthlyPmt = amtOwed / 12;
        
        return monthlyPmt;
    }
    
}
