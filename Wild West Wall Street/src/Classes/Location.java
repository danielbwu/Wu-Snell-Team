/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Point;
import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Kameron
 */
public class Location implements Serializable {
    
    private String description;
    private  Point coordinates;
    private Scene scene;
    private boolean isVisited;
    private ArrayList<Item> shop = new ArrayList<>();
    private boolean isShop;
    private boolean canTravel;
   
    Location(){
        this.isVisited = false;
        this.coordinates = null;
        this.description = "";
    }
    
    Location(String description) {
    this.description = description;
    coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

   public Scene getScene() {
        return scene;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public ArrayList<Item> getShop() {
        return shop;
    }

    public void setShop(ArrayList<Item> shop) {
        this.shop = shop;
    }

    public boolean isIsShop() {
        return isShop;
    }

    public void setIsShop(boolean isShop) {
        this.isShop = isShop;
    }

    public boolean isCanTravel() {
        return canTravel;
    }

    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }
    
    public ArrayList<Item> createStore() {
        
        ArrayList<Item> store = new ArrayList<>();
        
        Wood wood = new Wood("Pine Wood", 12.00, 10);
        store.add(wood);
        
        Iron iron = new Iron("Raw Iron", 25.00, 10);
        store.add(iron);
        
        Water water = new Water("Fresh Water", 10.00, 10);
        store.add(water);
        
        return store;
    }
    
}
    
    
    

