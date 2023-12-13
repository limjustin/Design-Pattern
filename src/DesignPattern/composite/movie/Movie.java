package DesignPattern.composite.movie;

public class Movie implements Component {

    private String title;
    private int year;
    private int price;
    private String resolution;

    public Movie(String title, int year, int price, String resolution) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.resolution = resolution;
    }

    @Override
    public Boolean equals(String title, int year) {
        // 제목과 제작년도를 비교
        return (this.title.equals(title) && this.year == year);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "제목: " + getTitle() + ", 제작년도: " + getYear() + ", 가격: " + getPrice() + ", 해상도: " + getResolution();
    }
}
