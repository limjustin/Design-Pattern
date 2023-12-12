package DesignPattern.state.calculator;

public class Calculator {

    private static Calculator calculator = new Calculator();
    private State state;
    private String numA;
    private String numB;
    private String operator;
    private Boolean completeDigitA = false;

    private Calculator() {
        this.state = StartState.getInstance();
        initializeValue();
    }

    public static Calculator getCalculator() {
        return calculator;
    }

    private void initializeValue() {
        numA = "0";
        numB = "0";
        operator = "";
        completeDigitA = false;
    }

    public void processDigit(int digit) {
        state.processDigit(digit);
        if (completeDigitA) {
            setState(Operand2State.getInstance());
            return;
        }
        setState(Operand1State.getInstance());
    }

    public void processArithmeticOperator(char ch) {
        state.processArithmeticOperator(ch);
        setState(OperatorState.getInstance());
        completeDigitA = true;
    }

    public void processEqualOperator() {
        state.processEqualOperator();
        setState(StartState.getInstance());
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setNumA(String num) {
        String s = numA.concat(num);
        this.numA = s;
        System.out.println(this.numA);
    }

    public void setNumB(String num) {
        String s = numB.concat(num);
        this.numB = s;
        System.out.println(this.numB);
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void printResult() {
        System.out.println("numA = " + this.numA + ", numB = " + this.numB);
        int integerA = Integer.parseInt(numA);
        int integerB = Integer.parseInt(numB);
        int result = calculate(integerA, integerB, operator);

        System.out.println(integerA + " " + operator + " " + integerB + " = " + result);
        initializeValue();
    }

    private int calculate(int a, int b, String operator) {
        System.out.println("operator = " + operator);
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "%" -> a % b;
            default -> 0;
        };
    }
}
