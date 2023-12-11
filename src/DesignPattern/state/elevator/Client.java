package DesignPattern.state.elevator;

public class Client {
    public static void main(String[] args) {
        ElevatorContext elevator = new ElevatorContext();

        elevator.pushUpButton();
        elevator.pushStopButton();
        elevator.pushDownButton();
        elevator.pushDownButton();
        elevator.pushStopButton();
        elevator.pushUpButton();
    }
}
