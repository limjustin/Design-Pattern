package DesignPattern.composite.shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group implements Selectable {
    private String name;

    private List<Shape> shapes = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public int getMinBoundsX() {
        List<Integer> list = new ArrayList<>();
        for (Shape shape : shapes)
            list.add(shape.getMinBoundsX());
        return Collections.min(list);
    }

    @Override
    public int getMinBoundsY() {
        List<Integer> list = new ArrayList<>();
        for (Shape shape : shapes)
            list.add(shape.getMinBoundsY());
        return Collections.min(list);
    }

    @Override
    public int getMaxBoundsX() {
        List<Integer> list = new ArrayList<>();
        for (Shape shape : shapes)
            list.add(shape.getMaxBoundsX());
        return Collections.max(list);
    }

    @Override
    public int getMaxBoundsY() {
        List<Integer> list = new ArrayList<>();
        for (Shape shape : shapes)
            list.add(shape.getMaxBoundsY());
        return Collections.max(list);
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
        for (Shape shape : shapes)
            shape.print();
    }
}
