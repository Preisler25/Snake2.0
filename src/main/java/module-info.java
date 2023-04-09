module preislerdev.snake2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens preislerdev.snake2 to javafx.fxml;
    exports preislerdev.snake2;
}