/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kameron
 */
public class MapLocation implements Serializable {
    
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private Enum<Character> characters;
    
    public MapLocation(){
}

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean isVisited() {
        return visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.row;
        hash = 83 * hash + this.column;
        hash = 83 * hash + (this.visited ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.scene);
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
        final MapLocation other = (MapLocation) obj;
        return true;
    }

    @Override
    public String toString() {
        return "MapLocation{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", scene=" + scene + '}';
    }
    
    
}
