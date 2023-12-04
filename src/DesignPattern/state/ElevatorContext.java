package DesignPattern.state;

public class ElevatorContext {

    private ElevatorState elevatorState;

    public ElevatorContext() {
        this.elevatorState = StopState.getInstance();
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public void pushUpButton() {
        elevatorState.pushUpButton();
        this.setElevatorState(UpState.getInstance());
    }

    public void pushDownButton() {
        elevatorState.pushDownButton();
        this.setElevatorState(DownState.getInstance());
    }

    public void pushStopButton() {
        elevatorState.pushStopButton();
        this.setElevatorState(StopState.getInstance());
    }
}
