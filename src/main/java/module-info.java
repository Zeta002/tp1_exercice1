module com.example.tp1_exercice1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp1_exercice1 to javafx.fxml;
    exports com.example.tp1_exercice1;
}