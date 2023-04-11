package preislerdev.snake2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ScreenController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello, JavaFX!");
    }
}