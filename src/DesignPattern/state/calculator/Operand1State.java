package DesignPattern.state.calculator;

public class Operand1State implements State {
    private static Operand1State instance = new Operand1State();

    private Operand1State() {}

    public static Operand1State getInstance() {
        return instance;
    }

    @Override
    public void processDigit(int digit) {
        Calculator.getCalculator().setNumA(String.valueOf(digit));
    }

    @Override
    public void processArithmeticOperator(char ch) {
        System.out.println("  Operand1  -->  Operator  ");
        Calculator.getCalculator().setOperator(String.valueOf(ch));
    }

    // processDigit : Start 상태에서 숫자를 입력받음
    // processArithmeticOperator : 연산 기호를 입력받음
    // processEqualOperator : Invalid
}
