package com.example.tp1_exercice1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // --- WINDOW --- //

        stage.setWidth(800);
        stage.setHeight(600);

        // --- ROOT --- //

        // Main container
        BorderPane root = new BorderPane();

        // Bottom
            // Contain
            Label labelBottom = new Label("Exemple");
            Separator separatorHorizontal = new Separator(Orientation.HORIZONTAL);

            // Controls
            VBox bottomControls = new VBox();
            bottomControls.setAlignment(Pos.BOTTOM_CENTER);
            bottomControls.getChildren().addAll(separatorHorizontal, labelBottom);
            root.setBottom(bottomControls);

        // Left
            // Contain
            Label labelLeft = new Label("Boutons : ");
            Button b1 = new Button("Bouton 1");
            Button b2 = new Button("Bouton 2");
            Button b3 = new Button("Bouton 3");
            Separator separatorVertical = new Separator(Orientation.VERTICAL);

            // Controls
            VBox leftList = new VBox();
            leftList.getChildren().addAll(labelLeft, b1, b2, b3);
            HBox leftControls = new HBox();
            leftList.setAlignment(Pos.CENTER);
            leftControls.getChildren().addAll(leftList, separatorVertical);
            root.setLeft(leftControls);
            leftList.setSpacing(10.0);

        // Top
            // Contain
                // Sub Menu m1
                Menu m1s1 = new Menu("New");
                Menu m1s2 = new Menu("Open");
                Menu m1s3 = new Menu("Save");
                Menu m1s4 = new Menu("Close");
            Menu m1 = new Menu("File");
            m1.getItems().addAll(m1s1, m1s2, m1s3, m1s4);

                // Sub Menu m1
                Menu m2s1 = new Menu("Cut");
                Menu m2s2 = new Menu("Copy");
                Menu m2s3 = new Menu("Paste");

            Menu m2 = new Menu("Options");
            m2.getItems().addAll(m2s1, m2s2, m2s3);

            Menu m3 = new Menu("Help");
            MenuBar bar = new MenuBar(m1, m2, m3);

            // Controls
            root.setTop(bar);

        // Display
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Exercice 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}