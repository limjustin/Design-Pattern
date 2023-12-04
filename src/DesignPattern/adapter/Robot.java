package DesignPattern.adapter;

public class Robot {

    private final ArmCore leftArm;
    private final ArmCore rightArm;

    public Robot(ArmCore leftArm, ArmCore rightArm) {
        this.leftArm = leftArm;
        this.rightArm = rightArm;
    }

    public void armUp() {
        leftArm.up();
        rightArm.up();
    }

    public void armDown() {
        leftArm.down();
        rightArm.down();
    }
}
