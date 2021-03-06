package hansel;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {


    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane root = FXMLLoader.load(getClass().getResource("view/Main.FXML"));
        //Node playlists = FXMLLoader.load(getClass().getResource("view/Playlists.FXML"));
        //Node library = FXMLLoader.load(getClass().getResource(("view/Library.FXML")));
        //Node controlBar = FXMLLoader.load(getClass().getResource(("view/ControlBar.FXML")));

        //root.setLeft(playlists);
        //root.setCenter(library);
        //root.setBottom(controlBar);

        primaryStage.setTitle("Hansel - Music Player");
        primaryStage.setScene(new Scene(root, 990, 660));
        primaryStage.show();
    }
}