package DesignPattern.composite;

public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(50000, 20);
        Body body = new Body(100000, 100);
        Monitor monitor = new Monitor(200000, 200);

        Computer computer = new Computer();
        computer.addComponent(keyboard);
        computer.addComponent(body);
        computer.addComponent(monitor);

        System.out.println("Computer price : " + computer.getPrice());
        System.out.println("Computer Power : " + computer.getPower());
    }
}
