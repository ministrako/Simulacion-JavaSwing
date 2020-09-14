package sim.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 * Creada con Java with Maven Archetype org.openjfx and FXML
 * UI con scene builder
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}