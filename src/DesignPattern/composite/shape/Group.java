package DesignPattern.composite.shape;

import java.util.ArrayList;
import java.util.List;

public class Group implements Selectable {
    private List<Selectable> components;
    private int num;
    private int minBoundsX;
    private int minBoundsY;
    private int maxBoundsX;
    private int maxBoundsY;

    public Group(int num) {
        this.num = num;
        components = new ArrayList<>();
        minBoundsX = Integer.MAX_VALUE;  // 신기한 방법일세
        minBoundsY = Integer.MAX_VALUE;  // 주의! 거꾸로 넣으면 안 된다!
        maxBoundsX = Integer.MIN_VALUE;
        maxBoundsY = Integer.MIN_VALUE;
    }

    public void add(Selectable component) {
        components.add(component);
        updateValue(component);
    }

    private void updateValue(Selectable component) {
        if (minBoundsX > component.getMinBoundsX())
            minBoundsX = component.getMinBoundsX();

        if (minBoundsY > component.getMinBoundsY())
            minBoundsY = component.getMinBoundsY();

        if (maxBoundsX < component.getMaxBoundsX())
            maxBoundsX = component.getMaxBoundsX();

        if (maxBoundsY < component.getMaxBoundsY())
            maxBoundsY = component.getMaxBoundsY();
    }

    @Override
    public int getMinBoundsX() {
        return minBoundsX;
    }

    @Override
    public int getMinBoundsY() {
        return minBoundsY;
    }

    @Override
    public int getMaxBoundsX() {
        return maxBoundsX;
    }

    @Override
    public int getMaxBoundsY() {
        return maxBoundsY;
    }

    @Override
    public String getName() {
        return "Group: " + num;
    }

    @Override
    public boolean isSelected(int x, int y) {
        boolean isSelected = (x >= getMinBoundsX() && x <= getMaxBoundsX() && y >= getMinBoundsY() && y <= getMaxBoundsY());
        System.out.println(getName() + " is selected at (" + x + ", " + y + "):");
        System.out.println(isSelected);
        return isSelected;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println("NumOfSelectables: " + components.size());
        System.out.println("minBoundsX: " + getMinBoundsX() + ", minBoundsY: " + getMinBoundsY());
        System.out.println("maxBoundsX: " + getMaxBoundsX() + ", maxBoundsY: " + getMaxBoundsY());

        for (Selectable selectable : components) {
            selectable.print();
        }
    }
}
