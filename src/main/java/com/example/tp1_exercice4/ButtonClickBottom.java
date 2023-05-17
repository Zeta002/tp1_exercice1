package com.example.tp1_exercice4;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class ButtonClickBottom implements EventHandler<Event> {

    private Label topLabel;
    private Button btn;
    private Pane centerControls;
    private int cptR = 0;
    private int cptG = 0;
    private int cptB = 0;

    public ButtonClickBottom(Label topLabel, Button btn, Pane centerControls) {
        this.topLabel = topLabel;
        this.btn = btn;
        this.centerControls = centerControls;
    }

    @Override
    public void handle(Event event) {
        switch (btn.getText()) {
            case "rouge":
                centerControls.setStyle("-fx-background-color: #6e0202");
                cptR++;
                topLabel.setText("C'est la " + cptR + " eme fois que vous appuyez sur ce bouton!");
                break;
            case "vert":
                centerControls.setStyle("-fx-background-color: #314159");
                cptB++;
                topLabel.setText("C'est la " + cptB + " eme fois que vous appuyez sur ce bouton!");
                break;
            case "bleu":
                centerControls.setStyle("-fx-background-color: #447053");
                cptG++;
                topLabel.setText("C'est la " + cptG + " eme fois que vous appuyez sur ce bouton!");
                break;
        }
    }
}
