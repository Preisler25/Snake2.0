package preislerdev.snake2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Screen.setStage(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}