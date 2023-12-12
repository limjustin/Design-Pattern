package DesignPattern.composite.shape;

public class Shape implements Selectable {
    private int minBoundsX;
    private int minBoundsY;
    private int maxBoundsX;
    private int maxBoundsY;
    private String name;

    public void setMinBoundsX(int minBoundsX) {
        this.minBoundsX = minBoundsX;
    }

    public void setMinBoundsY(int minBoundsY) {
        this.minBoundsY = minBoundsY;
    }

    public void setMaxBoundsX(int maxBoundsX) {
        this.maxBoundsX = maxBoundsX;
    }

    public void setMaxBoundsY(int maxBoundsY) {
        this.maxBoundsY = maxBoundsY;
    }

    public void setName(String name) {
        this.name = name;
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
        return name;
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
        System.out.println(getName() + ":");
        System.out.println("minBoundsX: " + getMinBoundsX() + ", minBoundsY: " + getMinBoundsY());
        System.out.println("maxBoundsX: " + getMaxBoundsX() + ", maxBoundsY: " + getMaxBoundsY());
    }
}
