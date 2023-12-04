package DesignPattern.facade;

public class Client {
    public static void main(String[] args) {
        Washing washing = new Washing();
        Rinsing rinsing = new Rinsing();
        Spinning spinning = new Spinning();

        washing.wash();
        rinsing.rinse();
        spinning.spin();

        WashingMachine washingMachine = new WashingMachine(washing, rinsing, spinning);
        washingMachine.start();
    }
}
