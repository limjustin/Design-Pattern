package DesignPattern.composite.shape;


public class Triangle extends Shape {

    private String name;
    private int[] coords;
    private int idx;

    public Triangle(String name, int[] coords, int idx) {
        super(name, coords, idx);
    }
}
