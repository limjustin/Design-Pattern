package DesignPattern.iterator;

public class ConcreteIterator implements Iterator {

    private Object[] arr;
    private int nextIndex = 0;

    public ConcreteIterator(Object[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < arr.length;
    }

    @Override
    public Object next() {
        return arr[nextIndex++];
    }
}
