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
       
       // Scene[] scenes = createScenes();
        
        //GameControl.assignScenesToLocations(map,scenes);
        
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
       System.out.println("moveActorsToStartingLocation called");
    }
    
   // private static Scene[] createScenes(){
    //    Scene[] scenes = new scene[SceneType.values().length];
     //   return scenes;
    }
        
    //}


