package com.pilhavisual;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    private Pilha<Integer> pInteira = new Pilha<Integer>();

    @FXML
    private Label welcomeText;

    @FXML
    private TextField firstValue;

    @FXML
    protected void onEmpilharButtonClick() {
        try{
            pInteira.push(Integer.valueOf(firstValue.getText()));
            welcomeText.setText(pInteira.imprimi());
        }
        catch (PilhaCheiaExcecao falha) {
            System.err.println();
        }
    }

    @FXML
    protected void onDesempilharButtonClick() {
        try {
            pInteira.pop();
            welcomeText.setText(pInteira.imprimi());
        }
        catch (PilhaVaziaExcecao falha) {
            System.err.println();
        }
    }
}