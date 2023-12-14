package DesignPattern.composite.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {

    List<Component> components;
    private String name;
    private int removeIdx;

    public MovieLibrary(String name) {
        this.components = new ArrayList<>();
        this.name = name;
        removeIdx = -1;
    }

    public void insert(Component component) {
        Boolean replace = checkDuplicate(component);
        if (replace)  // replace 값이 true 값일 경우 기존 영화(시리즈) 삭제
            delete(components.get(removeIdx));

        components.add(component);
        System.out.println("MovieLibrary: " + component.getYear() + " 년도에 제작된(구성된) 영화(시리즈) " + component.getTitle() + " 가(이) 추가되었습니다.");
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

    private Boolean checkDuplicate(Component component) {
        for (Component c : components) {
            if (c.equals(component.getTitle(), component.getYear())) {
                // delete(c);  // replace 값이 true 이면 기존 영화(시리즈) 삭제
                removeIdx = components.indexOf(c);
                return true;
            }
        }
        return false;
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

    public void printLibraryInfo() {
        int price = 0;
        for (Component component : components)
            price += component.getPrice();

        System.out.println("영화 라이브러리: " + name);
        System.out.println("영화(시리즈) 개수: " + components.size() + "        영화 라이브러리 전체 구매 가격: " + price + "\n");
        for (Component component : components)
            System.out.println(component.toString());
    }
}
