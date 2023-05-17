module com.example.tp1_exercice1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp1_exercice1 to javafx.fxml;
    opens com.example.partie3 to javafx.fxml;

    exports com.example.tp1_exercice1;
    exports com.example.partie2;
    exports com.example.tp1_exercice4;
    exports com.example.partie2.exercice5;
    exports com.example.partie3;
}