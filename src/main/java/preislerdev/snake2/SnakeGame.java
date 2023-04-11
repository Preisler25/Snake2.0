package preislerdev.snake2;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

public class SnakeGame extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Screen.setStage(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}