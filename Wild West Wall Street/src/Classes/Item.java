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
public class Item implements Serializable{
    
    private String itemName;
    private String itemDescription;
    private String inventoryType;
    private double noInStock;

    public Item() {
    }
    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getNoInStock() {
        return noInStock;
    }

    public void setNoInStock(double noInStock) {
        this.noInStock = noInStock;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.itemName);
        hash = 37 * hash + Objects.hashCode(this.itemDescription);
        hash = 37 * hash + Objects.hashCode(this.inventoryType);
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.noInStock) != Double.doubleToLongBits(other.noInStock)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", itemDescription=" + itemDescription + ", inventoryType=" + inventoryType + ", noInStock=" + noInStock + '}';
    }

}