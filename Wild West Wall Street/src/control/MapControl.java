/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Classes.Map;
import Classes.Scene;

/**
 *
 * @author Kameron
 */
public class MapControl {
    public static Map createMap() {
        Map map = new Map(20, 20);
       
       Scene[] scenes = createScenes();
        
        //GameControl.assignScenesToLocations(map,scenes);
        
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
       System.out.println("moveActorsToStartingLocation called");
    }
    
    private static Scene[] createScenes(){
       Scene[] scenes = new Scene[SceneType.values().length];
       return scenes;
    }
    
    public enum SceneType {
        start,
        bank,
        store,
        helpMenu,
        battleMenu,
        inventoryMenu,
        map,
        treasureChest,
        wagon,
        city1,
        city2,
        city3,
        city4,
        city5,
        menu,
        gmaeMenu,
        buy,
        sell,
        pineWood,
        rawIron,
        water,
        bread,
        pistol,
        rifle,
        shotgun,
        shotgunShells,
        pistolAmmo,
        rifleAmmo,
    }
        
    }


