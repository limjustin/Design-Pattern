package DesignPattern.singleton;

public class Printer {
    private static Printer printer = new Printer();
    private Printer() {}

    public static Printer getPrinter() {
        return printer;
    }

    public void print(String str) {
        System.out.println(str);
    }
}
