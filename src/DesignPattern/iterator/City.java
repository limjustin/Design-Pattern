package DesignPattern.iterator;

public class City implements Aggregate {

    private Object[] arr;
    private int index = 0;

    public City(int size) {
        this.arr = new Object[size];
    }

    public void add(Object o) {
        if (index < arr.length) {
            arr[index] = o;
            index++;
        }
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(arr);
    }
}
