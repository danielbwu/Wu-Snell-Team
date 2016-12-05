/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Point;
import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author Kameron
 */
public class Location implements Serializable {
    
    private String description;
    private  Point coordinates;
    private Scene scene;
    private boolean isVisited;
    private String character;
   
   
    Location(){
        this.isVisited = true;
        //this.scene = SceneType.desert;
        this.character = "";
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

    public String getCharacter() {
        return character;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
    
    
}
    
    
    

