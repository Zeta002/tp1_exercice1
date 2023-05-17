package com.example.partie2;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private Label helloLabel;
    private TextField nameField;
    private Button button;

    @Override
    public void start(Stage stage) throws IOException {
        // --- WINDOW --- //

        stage.setWidth(400);
        stage.setHeight(400);

        // --- ROOT --- //

        // Main container
        VBox root = new VBox();
        root.setAlignment( Pos.CENTER );

        // Contain
        this.helloLabel = new Label("Bonjour à tous !");

        this.nameField = new TextField("Veuillez saisir un nom");
        nameField.setMaxWidth(180.0d);
        nameField.setFont( Font.font("Courier", FontWeight.NORMAL, 12) );

        this.button = new Button("Dire bonjour");
        Image image = new Image( HelloApplication.class.getResource("silver_button.png").toString() );
        ImageView iv = new ImageView();
        iv.setImage(image);
        button.setGraphic( iv );

        root.getChildren().addAll(helloLabel, nameField, button);

        // Event
        button.addEventHandler(MouseEvent.MOUSE_CLICKED,  new ButtonClickHandler(helloLabel, nameField) );
        nameField.setOnAction( actionEvent -> handleButtonClick(actionEvent) );

        // Display
        Scene scene = new Scene(root);
        stage.setTitle("Hello application");
        stage.setScene(scene);
        stage.show();
    }

    private void handleButtonClick(Event event) {
        helloLabel.setText( "Bonjour à toi, "+nameField.getText() );
    }
}
