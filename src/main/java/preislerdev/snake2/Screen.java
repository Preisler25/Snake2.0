package preislerdev.snake2;

import javafx.stage.Stage;

public class Screen {
    private static Stage stage;

    public static Stage getStage() {
        return stage;
    }
    public static void setStage(Stage stage) {
        Screen.stage = stage;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "stage=" + stage +
                '}';
    }
}
