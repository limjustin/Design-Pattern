package DesignPattern.state.calculator;

public class OperatorState implements State {
    private static OperatorState instance = new OperatorState();
    private OperatorState() {}

    public static OperatorState getInstance() {
        return instance;
    }

    @Override
    public void processDigit(int digit) {
        System.out.println("  Operator  -->  Operand2  ");
        Calculator.getCalculator().setNumB(String.valueOf(digit));  // numB
    }

    @Override
    public void processArithmeticOperator(char ch) {
        Calculator.getCalculator().setOperator(String.valueOf(ch));  // 덮어쓰기
    }

    // processDigit : Start 상태에서 숫자를 입력받음
    // processArithmeticOperator : 연산 기호를 입력받음
    // processEqualOperator : Invalid
}
