package DesignPattern.command.calculate;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private List<Command> opList;

    public CommandManager() {
        this.opList = new ArrayList<>();
    }

    public void addOperation(Command op) {
        opList.add(op);
    }

    public void performOperations() {
        for (Command command : opList)
            System.out.println(command.execute());
    }
}
