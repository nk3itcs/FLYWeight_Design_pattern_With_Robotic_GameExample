package org.example;

public class HumanoidRobot implements IRobot{
    private String type;
    private Sprites body;

    HumanoidRobot(String type,Sprites sprites){
        this.type=type;
        this.body=sprites;
    }
    String getType(){
        return type;
    }
    Sprites getBody(){
        return body;
    }
    @Override
    public  void display(int x,int y){
        System.out.println("x and y objects of Human"+x+" "+y);
    }
}
