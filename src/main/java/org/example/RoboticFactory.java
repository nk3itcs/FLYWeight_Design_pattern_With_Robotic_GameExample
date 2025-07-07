package org.example;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private  static Map<String,IRobot> roboticCache=new HashMap<>();
    public static IRobot createRobot(String type){
        if(roboticCache.containsKey(type))
                return roboticCache.get(type);
        else if(type=="Humanoid"){
            Sprites sprites=new Sprites();
            IRobot humanRobot=new HumanoidRobot("Humanoid",sprites);
            roboticCache.put("Humanoid",humanRobot);
            return  humanRobot;
        }
        else{
            Sprites sprites=new Sprites();
            IRobot roboticDog=new RoboticDog("RoboticDog",sprites);
            roboticCache.put("RoboticDog",roboticDog);
            return roboticDog;
        }
    }

}
