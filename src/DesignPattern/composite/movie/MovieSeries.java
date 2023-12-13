package DesignPattern.composite.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieSeries implements Component {

    List<Component> movies;
    private String title;
    private int year;
    private int price;
    private int discountRate;  // 개별 영화 가격의 합계에서 할인

    public MovieSeries(String title, int year, int discountRate) {
        this.movies = new ArrayList<>();
        this.title = title;
        this.year = year;
        this.price = 0;
        this.discountRate = discountRate;
        System.out.println("MovieSeries: 영화 시리즈 " + title + " 생성, 할인율: " + discountRate);
    }

    public void add(Component component) {
        if (!checkListContainsComponent(component)) {
            movies.add(component);
            this.price += component.getPrice();
            System.out.println("MovieSeries: 영화 " + component.getTitle() + " 가(이) 추가되었습니다.");
        }
    }

    public void remove(Component component) {
        movies.remove(component);
        System.out.println("MovieSeries: 영화 " + component.getTitle() + " 가(이) 삭제되었습니다.");
    }

    private Boolean checkListContainsComponent(Component component) {
        for (Component movie : movies) {
            // 이미 존재하는 영화일 경우
            if (movie.equals(component.getTitle(), component.getYear())) {
                movie.setPrice(component.getPrice());  // 기존 영화 객체의 가격을 새로운 가격으로 수정
                System.out.println("MovieSeries: 영화 " + component.getTitle() + " 가(이) 새로 교체되었습니다.");
                return true;
            }
        }
        return false;
    }

    public Component getMovie(int idx) {
        return movies.get(idx - 1);
    }

    public void printPriceInfo() {
        int totalPrice = 0;
        for (Component component : movies)
            totalPrice += component.getPrice();

        System.out.println("MovieSeries: 기존 가격: " + totalPrice + ", 새로운 가격: " + totalPrice * (1 - (double) discountRate / 100));
    }

    public void list() {
        for (Component component : movies) {
            System.out.println("영화: " + component.getTitle() + ", 가격: " + component.getPrice());
        }
    }

    @Override
    public Boolean equals(String title, int year) {
        return (this.title.equals(title) && this.year == year);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        System.out.println("Movie Series Name: " + getTitle() + ", Price: " + getPrice() + "원, Discount rate: " + this.discountRate + "%");
        for (Component component : movies) {
            str.append("\t").append(component.toString()).append("\n");
        }
        return str.toString();
    }
}
