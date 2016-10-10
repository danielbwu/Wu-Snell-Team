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
public class Weapons implements Serializable {
    
    private String type;
    private double power;
    private double ammo;
    private String ammoType;

    public Weapons() {
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getAmmo() {
        return ammo;
    }

    public void setAmmo(double ammo) {
        this.ammo = ammo;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.type);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.power) ^ (Double.doubleToLongBits(this.power) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.ammo) ^ (Double.doubleToLongBits(this.ammo) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.ammoType);
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
        final Weapons other = (Weapons) obj;
        if (Double.doubleToLongBits(this.power) != Double.doubleToLongBits(other.power)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ammo) != Double.doubleToLongBits(other.ammo)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.ammoType, other.ammoType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "weapons{" + "type=" + type + ", power=" + power + ", ammo=" + ammo + ", ammoType=" + ammoType + '}';
    }
    
    
    
}
