package randomExcercises;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloWorldFX2 extends Application {

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button();
		primaryStage.setTitle("Hello Wold Test");
		button.setText("press");
		MyEventHandler meh = new MyEventHandler();
		button.setOnAction(meh);
		StackPane root = new StackPane();
		root.getChildren().add(button);
		button.setStyle(" -fx-background-color:#64EE64;");
		root.setBackground(new Background(new BackgroundFill(Color.DARKCYAN, null, null)));
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}

}

class MyEventHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		StackPane root2 = new StackPane();
		System.out.println("Hello world");
		root2.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));

	}

}
