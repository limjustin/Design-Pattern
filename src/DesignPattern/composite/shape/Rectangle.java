package DesignPattern.composite.shape;

public class Rectangle extends Shape {

    private String name;
    private int[] coords;
    private int idx;

    public Rectangle(String name, int[] coords, int idx) {
        super(name, coords, idx);
    }
}
