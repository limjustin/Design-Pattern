package DesignPattern.command.calculate;

public class Client {
    public static void main(String[] args) {
        CommandManager command = new CommandManager();

        AddValueCommand addCommand = new AddValueCommand(10, 5);
        SubtractValueCommand subtractCommand = new SubtractValueCommand(10, 5);
        SquareValueCommand squareCommand = new SquareValueCommand(10);

        command.addOperation(addCommand);
        command.addOperation(subtractCommand);
        command.addOperation(squareCommand);

        command.performOperations();
    }
}
