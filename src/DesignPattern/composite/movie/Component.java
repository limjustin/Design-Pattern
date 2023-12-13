package DesignPattern.composite.movie;

public interface Component {
    public Boolean equals(String title, int year);
    public String toString();
    public String getTitle();
    public int getYear();
    public int getPrice();
    public void setPrice(int price);
}
