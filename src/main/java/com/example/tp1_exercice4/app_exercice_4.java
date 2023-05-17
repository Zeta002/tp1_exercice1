package com.example.tp1_exercice4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class app_exercice_4 extends Application {

    private Label topLabel;
    private Button greenButton;
    private Button redButton;
    private Button blueButton;

    public void start(Stage stage) throws IOException {
        // --- WINDOW --- //

        stage.setWidth(400);
        stage.setHeight(200);

        // --- CONTAIN --- //

        // root
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #f0f0f0");

        // Top
        Label topLabel = new Label();
        topLabel.setPadding(new Insets(7));
        root.setAlignment(topLabel, Pos.CENTER);
        root.setTop(topLabel);

        // Center
        Pane centerControls = new Pane();
        root.setCenter(centerControls);

        // Bottom
            // Contain
            Button greenButton = new Button("vert");
            Button redButton = new Button("rouge");
            Button blueButton = new Button("blue");

            // Controls
            HBox bottomControls = new HBox();
            bottomControls.setAlignment(Pos.CENTER);
            bottomControls.setPadding(new Insets(7));
            bottomControls.setSpacing(10);
            bottomControls.getChildren().addAll(greenButton, redButton, blueButton);
            root.setBottom(bottomControls);

        // Event
        redButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new ButtonClickBottom(topLabel, redButton, centerControls));
        greenButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new ButtonClickBottom(topLabel, greenButton, centerControls));
        blueButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new ButtonClickBottom(topLabel, blueButton, centerControls));

        // Display
        Scene scene = new Scene(root);
        stage.setTitle("Application exercice 4");
        stage.setScene(scene);
        stage.show();
    }
}
