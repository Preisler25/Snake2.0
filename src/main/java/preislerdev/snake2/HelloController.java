package preislerdev.snake2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Stage s = Screen.getStage();
        welcomeText.setText(s.toString());
    }
}