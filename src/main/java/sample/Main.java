package main.java.sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    private static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        FXMLLoader openingLoader = new FXMLLoader(Main.class.getResource("OpeningScene.fxml"));
        Parent root = openingLoader.load();

        Scene openingScene = new Scene(root, 300, 275);
        primaryStage.setTitle("Building Manager");
        primaryStage.setScene(openingScene);
        primaryStage.setOnHidden(e-> Platform.exit());
        primaryStage.show();
    }

    public static Stage getPrimaryStage(){return primaryStage;}
}