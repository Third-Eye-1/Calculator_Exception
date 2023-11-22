package com.example.calculatorapp;

import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField inputField;

    Calculator calculator = new Calculator();
    private boolean isNewCalculation = true;

    @FXML
    public void handleDigitButtonClick(ActionEvent event) {
        if (isNewCalculation) {
            inputField.clear();
            isNewCalculation = false;
        }
        Button button = (Button) event.getSource();
        inputField.appendText(button.getText());
    }

    @FXML
    public void handleOperatorButtonClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        char operator = button.getText().charAt(0);
        calculator.setOperand1(Double.parseDouble(inputField.getText()));
        calculator.setOperator(operator);
        isNewCalculation = true;
    }

    @FXML
    public void handleEqualsButtonClick() {
        if (!isNewCalculation) {
            calculator.setOperand2(Double.parseDouble(inputField.getText()));
            calculator.calculate();
            double result = calculator.getResult();
            if (Double.isNaN(result)) {
                inputField.setText("Error: Division by zero");
            } else {
                inputField.setText(Double.toString(result));
            }
            isNewCalculation = true;
        }
    }

    @FXML
    public void handleClearButtonClick() {
        inputField.clear();
        isNewCalculation = true;
    }
}
