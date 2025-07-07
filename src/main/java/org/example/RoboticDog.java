package org.example;

public class RoboticDog implements IRobot{
    String type;
    Sprites body;
    RoboticDog(String type,Sprites body){
        this.body=body;
        this.type=type;
    }

    Sprites getBody(){
        return body;
    }
    String getType(){
        return type;
    }
    @Override
    public  void display(int x,int y){
        System.out.println("x and y objects of DOg"+x+" "+y);
    }
}
