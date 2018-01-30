package Lab1;

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

public class HelloWorldFX extends Application {

	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button();
		primaryStage.setTitle("Hello Wold Test");
		button.setText("press");
		button.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello world");
			}
		
		});
		StackPane root = new StackPane();
		root.getChildren().add(button);
		primaryStage.setScene(new Scene(root, 300, 250));
		button.setStyle(" -fx-background-color:#64EE64;");
		root.setBackground(new Background(new BackgroundFill(Color.DARKCYAN,null,null)));
		primaryStage.show();
	}

}
