package DesignPattern.facade;

public class WashingMachine {

    private final Washing washing;
    private final Rinsing rinsing;
    private final Spinning spinning;

    public WashingMachine(Washing washing, Rinsing rinsing, Spinning spinning) {
        this.washing = washing;
        this.rinsing = rinsing;
        this.spinning = spinning;
    }

    void start() {
        washing.wash();
        rinsing.rinse();
        spinning.spin();
    }
}
