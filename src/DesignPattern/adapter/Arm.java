package DesignPattern.adapter;

public class Arm implements ArmCore {
    @Override
    public void up() {
        System.out.println("Robot Arm Up");
    }

    @Override
    public void down() {
        System.out.println("Robot Arm Down");
    }
}
