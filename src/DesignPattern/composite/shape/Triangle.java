package DesignPattern.composite.shape;

public class Triangle extends Shape{
    private String name;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public Triangle(String name, int[] coords, int idx) {
        this.name = name;
        this.x1 = coords[idx];
        this.y1 = coords[idx + 1];
        this.x2 = coords[idx + 2];
        this.y2 = coords[idx + 3];
        this.x3 = coords[idx + 4];
        this.y3 = coords[idx + 5];
        setShape();
    }

    private void setShape() {
        setMinBoundsX(Math.min(Math.min(x1, x2), x3));
        setMinBoundsY(Math.min(Math.min(y1, y2), y3));
        setMaxBoundsX(Math.max(Math.max(x1, x2), x3));
        setMaxBoundsY(Math.max(Math.max(y1, y2), y3));
        setName(name);
    }
}
