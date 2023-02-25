module com.example.proyecc2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecc2 to javafx.fxml;
    exports com.example.proyecc2;
    exports com.example.proyecc2.controllers;
    opens com.example.proyecc2.controllers to javafx.fxml;
}