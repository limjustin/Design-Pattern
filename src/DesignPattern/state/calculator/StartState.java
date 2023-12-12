package DesignPattern.state.calculator;

public class StartState implements State {
    private static StartState instance = new StartState();

    private StartState() {}

    public static StartState getInstance() {
        return instance;
    }

    @Override
    public void processDigit(int digit) {
        System.out.println("  Start  -->  Operand1  ");
        Calculator.getCalculator().setNumA(String.valueOf(digit));
    }

    // processDigit : Start 상태에서 숫자를 입력받음
    // processArithmeticOperator : Invalid
    // processEqualOperator : Invalid
}
