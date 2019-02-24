package com.example.carll.calculator;

public class Calculator {

    private String expression;
    private double results;

    public Calculator(String expression, double results) {
        this.expression = expression;
        this.results = results;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public double getResults() {
        return results;
    }

    public void setResults(double results) {
        this.results = results;
    }

    public void calculate(String expression) {
            char currentOperator = ' ';
            String currentOperand = "";
            double currentValue = 0;
        for (int i = 0; i <  expression.length(); i++) {
            char token = expression.charAt(i);

         if (isOperator(token) ) {
             currentOperator = token;
             currentOperand = "";

         } else {
             currentOperand += token;
             updateResult(currentValue, currentOperator, currentOperand);
         }


        }

            setResults(currentValue);
    }

    private boolean isOperator(char button) {
        return button == '+' || button == '-' || button == '*' || button == '/';
    }

    private double updateResult(double currentValue, char currentOperator, String currentOperand) {
        double operand = Double.parseDouble(currentOperand);

        switch (currentOperator) {

            case '+':
                currentValue += operand;
                break;

            case '*':
                currentValue *= operand;
                break;

            case '-':
                currentValue -= operand;
                break;

        }
        return currentValue;
    }
}
