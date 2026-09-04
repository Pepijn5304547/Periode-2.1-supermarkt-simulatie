module org.example.supermarksimulatiep21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.supermarksimulatiep21 to javafx.fxml;
    exports org.example.supermarksimulatiep21;
}