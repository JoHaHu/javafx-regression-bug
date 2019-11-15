package test;

import java.io.File;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        var uri = new File("/home/$user/Music/test.mp3").toURI().toString();
        var media = new Media(uri);
        var mediaplayer = new MediaPlayer(media);
        mediaplayer.play();
    }
}
