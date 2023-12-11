package DesignPattern.composite.computer;

public class Monitor implements ComputerDevice {
    private final int price;
    private final int power;

    public Monitor(int price, int power) {
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
