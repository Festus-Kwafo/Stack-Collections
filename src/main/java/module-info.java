module com.example.stackassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stackassignment to javafx.fxml;
    exports com.example.stackassignment;
}