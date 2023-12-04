package DesignPattern.adapter;

public class Main {

    public static void main(String[] args) {
        System.out.println("-- Robot Arm Test --");

        ArmCore leftArm = new Arm();
        ArmCore rightArm = new Arm();

        Robot robot = new Robot(leftArm, rightArm);
        robot.armUp();
        robot.armDown();

        System.out.println("-- Robot Arm Test --");
        NewArm newArm = new NewArm();  // Change new Arm
        ArmCore newArmAdapter = new NewArmAdapter(newArm);

        robot = new Robot(leftArm, newArmAdapter);
        robot.armUp();
        robot.armDown();
    }
}
