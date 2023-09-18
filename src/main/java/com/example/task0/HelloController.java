package com.example.task0;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label countText1, countText2, countText3;
    @FXML
    private TextField inputCount;

    final int smallProcent = 3, normalProcent = 9, bigProcent = 15;
    Procent procent = new Procent();

    @FXML
    protected void countSmall() {
        if(inputCount.getText().length() > 0)
        if(inputCount.getText().matches("\\d*")) {
            procent.setSum(Float.parseFloat(inputCount.getText()));
            countText3.setText("Расчёт (+"+smallProcent+"%): " + procent.countSumrnd(smallProcent) + " ₽\t| Чаевые: " + procent.countPrR(smallProcent) +" ₽");
        }
        else inputCount.setText("");
    }
    @FXML
    protected void countNormal() {
        if(inputCount.getText().length() > 0)
        if(inputCount.getText().matches("\\d*")) {
            procent.setSum(Float.parseFloat(inputCount.getText()));
            countText2.setText("Расчёт (+"+normalProcent+"%): " + procent.countSumrnd(normalProcent) + " ₽\t| Чаевые: " + procent.countPrR(normalProcent)+" ₽");
        }
        else inputCount.setText("");
    }
    @FXML
    protected void countBig() {
        if(inputCount.getText().length() > 0)
        if(inputCount.getText().matches("\\d*")) {
            procent.setSum(Float.parseFloat(inputCount.getText()));
            countText1.setText("Расчёт (+"+bigProcent+"%): " + procent.countSumrnd(bigProcent) + " ₽\t| Чаевые: " + procent.countPrR(bigProcent)+ " ₽");
        }
        else inputCount.setText("");
    }
}