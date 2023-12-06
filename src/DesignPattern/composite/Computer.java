package DesignPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerDevice {
    private final List<ComputerDevice> components = new ArrayList<ComputerDevice>();

    public void addComponent(ComputerDevice component) {
        components.add(component);
    }

    public void removeComponent(ComputerDevice component) {
        components.remove(component);
    }

    @Override
    public int getPrice() {
        int price = 0;
        for (ComputerDevice component : components)
            price += component.getPrice();

        return price;
    }

    @Override
    public int getPower() {
        int power = 0;
        for (ComputerDevice component : components)
            power += component.getPower();

        return power;
    }
}
