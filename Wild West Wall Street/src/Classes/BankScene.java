/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Objects;
import java.io.Serializable;


/**
 *
 * @author Kameron
 */
public class BankScene implements Serializable {
    
    private double deposit;
    private double withdraw;
    private double loan;
    private double savedMoney;

    public BankScene() {
    }
    
    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getSavedMoney() {
        return savedMoney;
    }

    public void setSavedMoney(double savedMoney) {
        this.savedMoney = savedMoney;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.deposit) ^ (Double.doubleToLongBits(this.deposit) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.withdraw) ^ (Double.doubleToLongBits(this.withdraw) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.loan) ^ (Double.doubleToLongBits(this.loan) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.savedMoney) ^ (Double.doubleToLongBits(this.savedMoney) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BankScene other = (BankScene) obj;
        if (Double.doubleToLongBits(this.deposit) != Double.doubleToLongBits(other.deposit)) {
            return false;
        }
        if (Double.doubleToLongBits(this.withdraw) != Double.doubleToLongBits(other.withdraw)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loan) != Double.doubleToLongBits(other.loan)) {
            return false;
        }
        if (Double.doubleToLongBits(this.savedMoney) != Double.doubleToLongBits(other.savedMoney)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bankScene{" + "deposit=" + deposit + ", withdraw=" + withdraw + ", loan=" + loan + ", savedMoney=" + savedMoney + '}';
    }
    
    
    
    
    
}
