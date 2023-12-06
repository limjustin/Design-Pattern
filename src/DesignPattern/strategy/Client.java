package DesignPattern.strategy;

public class Client {
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.setAttackStrategy(new MissileStrategy());
        robot.setMovingStrategy(new FlyingStrategy());
        robot.attack();
        robot.move();

        robot.setAttackStrategy(new PunchStrategy());
        robot.setMovingStrategy(new WalkingStrategy());
        robot.attack();
        robot.move();
    }
}
