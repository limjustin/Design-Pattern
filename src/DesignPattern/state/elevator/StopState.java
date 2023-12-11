package DesignPattern.state.elevator;

public class StopState implements ElevatorState {

    public static StopState stopState;

    public StopState() {}

    public static StopState getInstance() {
        if(stopState == null)
            stopState = new StopState();

        return stopState;
    }

    @Override
    public void pushUpButton() {
        System.out.println("올라감");
    }

    @Override
    public void pushDownButton() {
        System.out.println("내려감");
    }

    @Override
    public void pushStopButton() {
        System.out.println("동작 없음");
    }
}
