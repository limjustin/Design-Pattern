package DesignPattern.adapter;

public class NewArm implements NewArmCore {
    @Override
    public void lift() {
        System.out.println("New Robot Arm Lift");
    }

    @Override
    public void fall() {
        System.out.println("New Robot Arm Fall");
    }
}
