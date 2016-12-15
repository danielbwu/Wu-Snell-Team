/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Kameron
 */
public class LoanSort {
        public static int[] loanSort(int[] loan){
         
        for (int i = 0; i < loan.length - 1; i++)
        {
            int index = i;
            for (int k = i + 1; k < loan.length; k++)
                if (loan[k] < loan[index])
                    index = k;
      
            int smallNum = loan[index]; 
            loan[index] = loan[i];
            loan[i] = smallNum;
        }
        return loan;
    }

    
}
