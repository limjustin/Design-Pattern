package DesignPattern.composite;

public class Keyboard implements ComputerDevice {
    private final int price;
    private final int power;

    public Keyboard(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPower() {
        return power;
    }
}
