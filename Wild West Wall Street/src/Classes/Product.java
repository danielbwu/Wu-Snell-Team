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
 * @author Daniel
 */
public class Product implements Serializable{
    
    private double value;
    private double noInStock;

    public Product() {
    }
    

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getNoInStock() {
        return noInStock;
    }

    public void setNoInStock(double noInStock) {
        this.noInStock = noInStock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.noInStock) ^ (Double.doubleToLongBits(this.noInStock) >>> 32));
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
        final Product other = (Product) obj;
        if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noInStock) != Double.doubleToLongBits(other.noInStock)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "value=" + value + ", noInStock=" + noInStock + '}';
    }
    
    
    
}
