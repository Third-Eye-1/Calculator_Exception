package com.example.calculatorapp;

public class Calculator {
    private double operand1;
    private double operand2;
    private char operator;
    private double result;

    public void setOperand1(double operand) {
        this.operand1 = operand;
    }

    public void setOperand2(double operand) {
        this.operand2 = operand;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void calculate() {
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    result = Double.NaN; // Division by zero
                }
                break;
        }
    }

    public double getResult() {
        return result;
    }
}
