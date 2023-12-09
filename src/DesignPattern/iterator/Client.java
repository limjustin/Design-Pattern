package DesignPattern.iterator;

public class Client {
    public static void main(String[] args) {
        City city = new City(5);
        city.add("Seoul");
        city.add("Suwon");
        city.add("Busan");
        city.add("Daegu");
        city.add("Gwangju");

        Iterator iter = city.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
