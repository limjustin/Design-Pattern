package DesignPattern.strategy;

public class MissileStrategy implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("I have missile");
    }
}
