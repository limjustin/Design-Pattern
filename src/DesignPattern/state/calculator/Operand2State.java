package DesignPattern.state.calculator;

public class Operand2State implements State {
    private static Operand2State instance = new Operand2State();
    private Operand2State() {}

    public static Operand2State getInstance() {
        return instance;
    }

    @Override
    public void processDigit(int digit) {
        Calculator.getCalculator().setNumB(String.valueOf(digit));
    }

    @Override
    public void processEqualOperator() {
        System.out.println("  Operand2  -->  Start  ");
        Calculator.getCalculator().printResult();
    }

    // processDigit : Start 상태에서 숫자를 입력받음
    // processArithmeticOperator : Invalid
    // processEqualOperator : 결과 만들러 감
}
