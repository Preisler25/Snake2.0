package preislerdev.snake2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Screen {
    private static Stage stage;
    private static Scene scene;

    public static void setStage(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Screen.stage = stage;
        scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public static void setPageFromGroup(Group root) {
        scene = new Scene(root);
        stage.setScene(scene);
    }
    public static void setPageFromFXML(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        scene = new Scene(loader.load(), 1280, 720);
        stage.setScene(scene);
    }
}
