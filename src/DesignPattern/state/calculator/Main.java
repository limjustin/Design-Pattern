package DesignPattern.state.calculator;

import java.util.Scanner;

// 입력된 문자 ch가 0~9까지의 숫자를 나타내는 문자인 경우, ch - '0'으로 0~9까지의 정수로 변환 가능
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);      // 키보드에서 한 글자 입력 받기

        Calculator calculator = Calculator.getCalculator();

        while (ch != 'q' && ch != 'Q') {    // 종료 문자가 아니면 반복

            if (ch >= '0' && ch <= '9') {
                // System.out.println("processDigit");
                calculator.processDigit(ch - '0');
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                // System.out.println("processArithmeticOperator");
                calculator.processArithmeticOperator(ch);
            } else if (ch == '=') {
                // System.out.println("processEqualOperator");
                calculator.processEqualOperator();
            }
            // Rewrite
            ch = sc.next().charAt(0);
        }
    }
}