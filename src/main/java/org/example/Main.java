package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IRobot robotHuman=RoboticFactory.createRobot("Humanoid");
        robotHuman.display(10,20);

        IRobot robotDog=RoboticFactory.createRobot("RoboticDog");
        robotDog.display(2,0);
    }
}