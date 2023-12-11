package DesignPattern.composite.shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shape implements Selectable {

    private String name;
    private int[] coords;
    private int idx;
    private List<Integer> xCoords = new ArrayList<>();
    private List<Integer> yCoords = new ArrayList<>();

    public Shape(String name, int[] coords, int idx) {
        this.name = name;
        this.coords = coords;
        this.idx = idx;
        separate();
    }

    public void separate() {
        for (int i = 0; i < coords.length; i++)
            if (i % 2 == 0)
                xCoords.add(coords[i]);
            else
                yCoords.add(coords[i]);
    }

    @Override
    public int getMinBoundsX() {
        return Collections.min(xCoords);
    }

    @Override
    public int getMinBoundsY() {
        return Collections.min(yCoords);
    }

    @Override
    public int getMaxBoundsX() {
        return Collections.max(xCoords);
    }

    @Override
    public int getMaxBoundsY() {
        return Collections.max(yCoords);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isSelected(int x, int y) {
        boolean result = x >= getMinBoundsX() && x <= getMaxBoundsX() && y >= getMinBoundsY() && y <= getMaxBoundsY();
        System.out.println(getName() + " is selected at (" + x + ", " + y + "): " + result);
        return result;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println("minBoundsX: " + getMinBoundsX() + ", minBoundsY: " + getMinBoundsY());
        System.out.println("maxBoundsX: " + getMaxBoundsX() + ", maxBoundsY: " + getMaxBoundsY());
    }
}
