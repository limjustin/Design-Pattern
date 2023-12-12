package DesignPattern.composite.shape;

public class Rectangle extends Shape {
    private String name;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(String name, int[] coords, int idx) {
        this.name = name;
        this.x1 = coords[idx];
        this.y1 = coords[idx + 1];
        this.x2 = coords[idx + 2];
        this.y2 = coords[idx + 3];
        setShape();
    }

    private void setShape() {
        setMinBoundsX(Math.min(x1, x2));
        setMinBoundsY(Math.min(y1, y2));
        setMaxBoundsX(Math.max(x1, x2));
        setMaxBoundsY(Math.max(y1, y2));
        setName(name);
    }
}
