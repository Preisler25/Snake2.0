package preislerdev.snake2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Screen {
    private static Stage stage;
    private static Scene scene;

    public static void setStage(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Screen.stage = stage;
        scene = new Scene(fxmlLoader.load(), 1920, 1000);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public static void setPageFromGroup(Group root) {
        scene.setRoot(root);
        stage.setScene(scene);
    }
    public static void setPageFromFXML(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        scene.setRoot(loader.load());
        stage.setScene(scene);
    }
}
