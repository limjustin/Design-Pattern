package DesignPattern.strategy;

public class Robot {
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    public void attack() {
        attackStrategy.attack();
    }

    public void move() {
        movingStrategy.move();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }
}
