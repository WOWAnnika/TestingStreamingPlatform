module com.example.testingstreamingplatform {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.testingstreamingplatform to javafx.fxml;
    exports com.example.testingstreamingplatform;
}