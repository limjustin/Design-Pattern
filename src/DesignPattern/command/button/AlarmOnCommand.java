package DesignPattern.command.button;

public class AlarmOnCommand implements Command {
    private final Alarm alarm;

    public AlarmOnCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}
