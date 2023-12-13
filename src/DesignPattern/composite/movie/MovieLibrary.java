package DesignPattern.composite.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {

    List<Component> components;
    private String name;

    public MovieLibrary(String name) {
        this.components = new ArrayList<>();
        this.name = name;
    }

    public void insert(Component component) {
        Boolean replace = checkDuplicate(component);
        if(!replace) {
            components.add(component);  // movie, movieseries 나눠서 구현했는데 그냥 이렇게 구현하면 되네!
            System.out.println("MovieLibrary: " + component.getYear() + " 년도에 제작된(구성된) 영화(시리즈) " + component.getTitle() + " 가(이) 추가되었습니다.");
        }
    }

    private Boolean checkDuplicate(Component component) {
        for (Component c : components) {
            if (c.equals(component.getTitle(), component.getYear())) {
                delete(c);
                return true;
            }
        }
        return false;
    }

    public void delete(Component component) {
        if (checkInList(component)) {
            components.remove(component);
            System.out.println("MovieLibrary: " + component.getYear() + " 년에 제작된 영화(시리즈) " + component.getTitle() + " 를(을) 삭제했습니다.");
        }
        else {
            System.out.println("MovieLibrary: " + component.getYear() + "년에 제작된 영화(시리즈) "  + component.getTitle() + " 가(이) 없습니다.");
        }
    }

    private Boolean checkInList(Component component) {
        if (components.contains(component))
            return true;
        return false;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Component component : components) {
            str.append(component.toString());
        }

        return str.toString();
    }

    public void printLibrary() {
        int price = 0;

        for (Component component : components)
            price += component.getPrice();

        System.out.println("영화 라이브러리: " + name);
        System.out.println("영화(시리즈) 개수: " + components.size() + "        영화 라이브러리 전체 구매 가격: " + price + "\n");
        for (Component component : components)
            System.out.println(component.toString());
    }
}
