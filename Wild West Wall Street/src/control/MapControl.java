/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Classes.Actor;
import Classes.Map;
import Classes.Location;
import Classes.Scene;
import Classes.SceneType;
import Exceptions.MapControlException;
import cit260.game.CIT260Game;
import java.awt.Point;

/**
 *
 * @author Kameron
 */
public class MapControl {
    public static Map createMap() {
        Map map = new Map(10,10);
       
       Scene[] scenes = MapControl.createScenes();
        
        MapControl.assignScenesToLocations(map,scenes);
        
        return map;
    }

    public static void moveActorsToStartingLocation(Map map) 
            throws MapControlException {
    
      Actor[] actors = Actor.values();
      
     // for (Actor actor : actors) {
       //   Point coordinates = actor.getCoordinates();
         //  MapControl.moveActorToLocation(actor, coordinates);
        
          //}
          
    }
    
    public static void moveActorToLocation(Actor actor, Point coordinates)
                                throws MapControlException {
        Map map = CIT260Game.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if(newRow< 0 || newRow >= map.getRowCount() || 
                newColumn < 0 || newColumn >= map.getColumnCount()){
          throw new MapControlException ("Can not move actor to location"
          + coordinates.x + "," + coordinates.y + "becasue that location is"
                  + "outside the bounds of the map.");
    }
    }
    
    public static Scene[] createScenes(){
       Scene[] scenes = new Scene[SceneType.values().length];
       
       Scene startingScene = new Scene();
       startingScene.setDescription(
              "So you wanna make some money? You came to the right place. The"
            + "wild west is the place to do it. Be careful though, "
            + "they're are some dangerous parts around here, watch out"
            + "for the outlaws and bandits looking to steal from anyone."
            + "Head off and to the bank to get your start up loan and good luck!");
        startingScene.setDisplaySymbol(" GO ");
        startingScene.setTravelTime(100);
        scenes[SceneType.start.ordinal()] = startingScene;
        
         Scene bankScene = new Scene();
        bankScene.setDescription(
                  "Welcome to the bank. Here you can Deposit or Withdraw"
                + "your money. You can also pay back your loan.");
        bankScene.setDisplaySymbol(" BA ");
        bankScene.setTravelTime(1000);
        scenes[SceneType.bank.ordinal()] = bankScene;
        
        Scene storeScene = new Scene();
        storeScene.setDescription(
                  "Welcome to the bank. Here you can Deposit or Withdraw"
                + "your money. You can also pay back your loan.");
        storeScene.setDisplaySymbol(" ST ");
        storeScene.setTravelTime(1000);
        scenes[SceneType.store.ordinal()] = storeScene;
        
        Scene battleScene = new Scene();
        battleScene.setDescription(
                  "Watch out!!! You are getting robbed, what do you want to do?");
        battleScene.setDisplaySymbol(" BS ");
        battleScene.setTravelTime(1000);
        scenes[SceneType.battle.ordinal()] = battleScene;
        
        Scene treasureChestScene = new Scene();
        treasureChestScene.setDescription(
                 "Luck is on your side!! You have found a lost treasure chest"
               + "but it is locked!!! Figure out the passcode and the loot is yours!!!");
        treasureChestScene.setDisplaySymbol(" TC ");
        treasureChestScene.setTravelTime(1000);
        scenes[SceneType.treasureChest.ordinal()] = treasureChestScene;
        
        Scene city1Scene = new Scene();
        city1Scene.setDescription(
                "Welcome to city1!");
        city1Scene.setDisplaySymbol(" C1 ");
        city1Scene.setTravelTime(1000);
        scenes[SceneType.city1.ordinal()] = city1Scene;
        
        Scene city2Scene = new Scene();
        city2Scene.setDescription(
                "Welcome to city2!");
        city2Scene.setDisplaySymbol(" C2 ");
        city2Scene.setTravelTime(1000);
        scenes[SceneType.city2.ordinal()] = city2Scene;
        
        Scene city3Scene = new Scene();
        city3Scene.setDescription(
                "Welcome to city3!");
        city3Scene.setDisplaySymbol(" C3 ");
        city3Scene.setTravelTime(1000);
        scenes[SceneType.city3.ordinal()] = city3Scene;
        
        Scene city4Scene = new Scene();
        city1Scene.setDescription(
                "Welcome to city4!");
        city4Scene.setDisplaySymbol(" C4 ");
        city4Scene.setTravelTime(1000);
        scenes[SceneType.city4.ordinal()] = city4Scene;
        
        Scene city5Scene = new Scene();
        city5Scene.setDescription(
                "Welcome to city5!");
        city5Scene.setDisplaySymbol(" C5 ");
        city5Scene.setTravelTime(1000);
        scenes[SceneType.city5.ordinal()] = city5Scene;
        
        Scene pineWoodScene = new Scene();
        pineWoodScene.setDescription(
                "You found some pine wood! You can sell that for some profit!");
        pineWoodScene.setDisplaySymbol(" PW ");
        pineWoodScene.setTravelTime(1000);
        scenes[SceneType.pineWood.ordinal()] = pineWoodScene;
        
        Scene rawIronScene = new Scene();
        rawIronScene.setDescription(
                "You found some raw iron! You can sell that for some profit!");
        rawIronScene.setDisplaySymbol(" RI ");
        rawIronScene.setTravelTime(1000);
        scenes[SceneType.rawIron.ordinal()] = rawIronScene;
        
        Scene waterScene = new Scene();
        waterScene.setDescription(
                "You found a jug of fresh water! You can sell that for some profit!");
        waterScene.setDisplaySymbol(" FW ");
        waterScene.setTravelTime(1000);
        scenes[SceneType.water.ordinal()] = waterScene;
        
        Scene grainScene = new Scene();
        grainScene.setDescription(
                "You found some grain! You can sell that for some profit!");
        grainScene.setDisplaySymbol(" GR ");
        grainScene.setTravelTime(1000);
        scenes[SceneType.grain.ordinal()] = grainScene;
        
        Scene desertScene = new Scene();
        desertScene.setDescription(
                "Desert, nuff said.");
        desertScene.setDisplaySymbol(" DS ");
        desertScene.setTravelTime(1000);
        scenes[SceneType.desert.ordinal()] = desertScene;
        
        Scene lakeScene = new Scene();
        lakeScene.setDescription(
                "Lake, nuff said.");
        lakeScene.setDisplaySymbol(" LA ");
        lakeScene.setTravelTime(1000);
        scenes[SceneType.lake.ordinal()] = lakeScene;
        
        Scene mountainScene = new Scene();
        mountainScene.setDescription(
                "mountain, nuff said.");
        mountainScene.setDisplaySymbol(" MT ");
        mountainScene.setTravelTime(1000);
        scenes[SceneType.mountain.ordinal()] = mountainScene;
        
       return scenes;
    }
    
    
    public static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        

        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.city1.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.bank.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.rawIron.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.store.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.rawIron.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.grain.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.pineWood.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.city2.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.bank.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.store.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.battle.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.rawIron.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.pineWood.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.pineWood.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.rawIron.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.pineWood.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.pineWood.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.store.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.city5.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.bank.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.battle.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.desert.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.desert.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.pineWood.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.store.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.battle.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.lake.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.lake.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.city3.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.bank.ordinal()]);
        locations[7][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.desert.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.battle.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.pineWood.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.lake.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.lake.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.water.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.desert.ordinal()]);
        locations[8][0].setScene(scenes[SceneType.pineWood.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.store.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.rawIron.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.rawIron.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.desert.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.pineWood.ordinal()]);
        locations[9][0].setScene(scenes[SceneType.city4.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.bank.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.rawIron.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.rawIron.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.desert.ordinal()]);
        locations[9][7].setScene(scenes[SceneType.desert.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.desert.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.desert.ordinal()]);
    }

}

